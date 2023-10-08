package com.geekster.studentmanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String studentID;
    private String studentName;
    private String age;
    private String phoneNumber;
    private String branch;
    private String department;

    @OneToOne
    Address address;

    @OneToMany(mappedBy = "student")
    List<Book> books;

    @ManyToMany(mappedBy = "students")
    List<Course> courses;

    @OneToOne
    @JoinColumn(name = "laptop_id")
    private Laptop laptop;

    public Student() {
    }

    public Student(String studentID, String studentName, String age, String phoneNumber, String branch, String department, Address address, List<Book> books, List<Course> courses, Laptop laptop) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.branch = branch;
        this.department = department;
        this.address = address;
        this.books = books;
        this.courses = courses;
        this.laptop = laptop;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
