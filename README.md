# apirest - Products CRUD
APIREST

## Description
A simple REST API built with Spring Boot to manage products.  
Basic CRUD operations (Create, Read, Update, Delete).  

## Technologies
- Java 17  
- Spring Boot  
- Spring Data JPA  
- H2 Database  

## Installation & Run
git clone https://github.com/youruser/apirest-products.git  
cd apirest-products  
./mvnw spring-boot:run  

## Endpoints
Method | Endpoint        | Description                
-------|----------------|----------------------------
GET    | /products      | Get all products  
GET    | /products/{id} | Get a product by ID  
POST   | /products      | Create a new product  
PUT    | /products/{id} | Update a product  
DELETE | /products/{id} | Delete a product  

## JSON Example
{
  "name": "Laptop",
  "price": "1200.00"
}
