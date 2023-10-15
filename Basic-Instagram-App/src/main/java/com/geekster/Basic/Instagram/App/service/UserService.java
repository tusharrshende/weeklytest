package com.geekster.Basic.Instagram.App.service;

import com.geekster.Basic.Instagram.App.model.AuthenticationToken;
import com.geekster.Basic.Instagram.App.model.User;
import com.geekster.Basic.Instagram.App.model.dto.SignInInputDto;
import com.geekster.Basic.Instagram.App.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    @Autowired
    UTokenService uTokenService;

        public String userSignUp(User newUser) {

            // check if email is already exist -> not allowed -> try logging in
            String newEmail = newUser.getEmail();
            User existingUser = userRepo.findFirstByEmail(newEmail);

            if(existingUser != null) {
                return "email already in use";
            }

            String signUpPassword = newUser.getPassword();

            try {
                String encryptedPassword = PasswordEncryptor.encrypt(signUpPassword);

                newUser.setPassword(encryptedPassword);

               userRepo.save(newUser);
                return "user registered";

            }
            catch (NoSuchAlgorithmException e) {
                return "Internal server problem while saving the password, try again later";
            }

        }

    public String userSignIn(SignInInputDto signInInput) {
        String email = signInInput.getEmail();

        User existingUser = userRepo.findFirstByEmail(email);

        if(existingUser == null) {
            return "Not a valid email, Please sign up first !";
        }
        //Password should be matched

        String password = signInInput.getPassword();

        try {
            String encryptedPassword = PasswordEncryptor.encrypt(password);

            if(existingUser.getPassword().equals(encryptedPassword)) {

                //return the token for this sign in
                AuthenticationToken token = new AuthenticationToken(existingUser);

                uTokenService.createToken(token);
                return token.getToken();
            }
            else {
                //password was wrong
                return "Invalid credential";
            }

        }
        catch (NoSuchAlgorithmException e) {
            return "Internal server problem while saving the password, try again later";
        }
    }
}
