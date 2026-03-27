#  Address Book App (Spring Boot)

##  Project Overview

This is a **Spring Boot Address Book Application** implementing:

* REST APIs (CRUD operations)
* Layered architecture (Controller → Service → Repository)
* MySQL Database integration
* Validation & Exception Handling

---

##  Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* MySQL
* Maven

---

##  Project Structure

```
controller/
service/
repository/
model/
dto/
exception/
```

---

##  Features Implemented

###  Section 1

* Basic REST API
* CRUD endpoints using HTTP methods

###  Section 2

* DTO & Model
* Service Layer
* In-memory List storage

### Section 3

* Service Interface
* Repository Layer
* MySQL + JPA integration
* Environment Variables configuration

###  Section 4

* Validation (`@NotBlank`, `@Pattern`)
* Global Exception Handling
* Custom Exception for invalid ID
