
# E-commerce API

**Description:** This is a Spring Boot-based RESTful API for an E-commerce platform. It provides endpoints for managing users, products, addresses, and orders.

## Table of Contents

- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Usage](#usage)
  - [Endpoints](#endpoints)
- [Configuration](#configuration)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

### Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or later installed.
- MySQL database server installed and running.
- An integrated development environment (IDE) like IntelliJ IDEA or Eclipse.
- Postman or a similar tool for testing API endpoints.

### Installation

1. Clone the repository:

   ```shell
   git clone https://github.com/tusharrshende/test-fs-11
   ```

2. Open the project in your preferred IDE.

3. Configure the database connection in `src/main/resources/application.properties`:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:<port>/<database-name>
   spring.datasource.username=<username>
   spring.datasource.password=<password>
   spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
   ```

4. Build and run the project.

   ```shell
   ./mvnw spring-boot:run
   ```

The API should now be running locally at `http://localhost:8080`.

## Usage

### Endpoints

#### Users

- **Create User**
  - Endpoint: `POST /users`
  - Request Body: JSON representing user details.
  - Response: JSON representing the created user.

- **Get User by ID**
  - Endpoint: `GET /users/{id}`
  - Response: JSON representing the user with the specified ID.

- **Get All Users**
  - Endpoint: `GET /users`
  - Response: JSON array of all users.

- **Update User**
  - Endpoint: `PUT /users/{id}`
  - Request Body: JSON representing updated user details.
  - Response: JSON representing the updated user.

- **Delete User**
  - Endpoint: `DELETE /users/{id}`
  - Response: No content.

Certainly! Here's the documentation for the `Products`, `Addresses`, and `Orders` endpoints in Markdown format:

---

## Products

### Create Product

- **Endpoint**: `POST /products`
- **Description**: Create a new product.
- **Request Body**: JSON representing product details.
- **Response**: JSON representing the created product.

### Get Product by ID

- **Endpoint**: `GET /products/{id}`
- **Description**: Retrieve product details by ID.
- **Response**: JSON representing the product with the specified ID.

### Get All Products

- **Endpoint**: `GET /products`
- **Description**: Retrieve a list of all products.
- **Response**: JSON array containing all products.

### Get Products by Category

- **Endpoint**: `GET /products?category={category}`
- **Description**: Retrieve products by category using query parameters.
- **Response**: JSON array containing products in the specified category.

### Update Product

- **Endpoint**: `PUT /products/{id}`
- **Description**: Update product details by ID.
- **Request Body**: JSON representing updated product details.
- **Response**: JSON representing the updated product.

### Delete Product

- **Endpoint**: `DELETE /products/{id}`
- **Description**: Delete a product by ID.
- **Response**: No content.

---

## Addresses

### Create Address

- **Endpoint**: `POST /addresses`
- **Description**: Create a new address.
- **Request Body**: JSON representing address details.
- **Response**: JSON representing the created address.

### Get Address by ID

- **Endpoint**: `GET /addresses/{id}`
- **Description**: Retrieve address details by ID.
- **Response**: JSON representing the address with the specified ID.

### Update Address

- **Endpoint**: `PUT /addresses/{id}`
- **Description**: Update address details by ID.
- **Request Body**: JSON representing updated address details.
- **Response**: JSON representing the updated address.

### Delete Address

- **Endpoint**: `DELETE /addresses/{id}`
- **Description**: Delete an address by ID.
- **Response**: No content.

---

## Orders

### Create Order

- **Endpoint**: `POST /orders`
- **Description**: Place a new order.
- **Request Body**: JSON representing order details including user, product, and address IDs.
- **Response**: JSON representing the created order.

### Get Order by ID

- **Endpoint**: `GET /orders/{id}`
- **Description**: Retrieve order details by ID.
- **Response**: JSON representing the order with the specified ID.

### Update Order

- **Endpoint**: `PUT /orders/{id}`
- **Description**: Update order details by ID.
- **Request Body**: JSON representing updated order details.
- **Response**: JSON representing the updated order.

### Delete Order

- **Endpoint**: `DELETE /orders/{id}`
- **Description**: Delete an order by ID.
- **Response**: No content.

Please replace `{id}`, `{category}`, `{category-value}`, and other placeholders with actual values or variable names as appropriate for your API implementation.

## Configuration

- Database configuration is stored in `src/main/resources/application.properties`. Update this file to configure your database connection and other settings.

## Contributing

Contributions are welcome! To contribute to this project, follow these steps:

1. Fork the project.
2. Create a new branch for your feature or bug fix.
3. Make your changes and test them thoroughly.
4. Create a pull request, explaining the purpose of your changes.