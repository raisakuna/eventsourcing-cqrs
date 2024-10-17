
# SEBank Gateway & Discovery service
### Overview

The SEbank project implements a microservices architecture utilizing Spring Cloud Gateway and Eureka as a discovery service. This setup enables seamless communication between services, load balancing, and dynamic routing. The project leverages Java 19 and incorporates essential dependencies such as Spring Boot Actuator, Eureka Client, and Spring Cloud Gateway.
### Project Structure
* Gateway service: Act as an single entry point for all requests, routing them to appropriate service.
* Eureka Server: Handle registration and discovery
* SEBank Service: Provides CRUD operations related to account
  
### Endpoints
* Eureka Server: http://localhost:8761
* Gateway: http://localhost:8888
* SEbank CRUD Operations:
    * GET /account: Retrieve account details.
    * POST /account: Create a new account.
    * PUT /account/{id}: Update an existing account.
    * DELETE /account/{id}: Delete an account.
### Dependencies
This project includes the following key dependencies:

* Spring Boot Actuator: Provides production-ready features, such as monitoring and metrics.
* Eureka Client: Enables service registration and discovery.
* Spring Cloud Gateway: Facilitates routing and API gateway functionalities.
### Contributing
Contributions are welcome! If you have suggestions for improvements or new features, please open an issue or submit a pull request.
