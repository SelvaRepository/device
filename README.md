Device API
A RESTful service to manage devices, supporting creation and retrieval by ID, name, brand, and state.

Language/Runtime: Java 21
Framework: Spring Boot 3
API Docs: OpenAPI (Swagger UI)
Mapping: MapStruct
Database: MySQL(Other env),H2(local)
Containerization: Docker Compose


Features

Create a device
Get device by ID
Get device by name
Get devices by brand
Get devices by state
Allowed states: in-use, available, inactive
OpenAPI docs (Swagger UI) auto-generated
Production-ready Docker Compose stack (App + MySQL)


Architecture (High-level)

Controller: HTTP endpoints & request/response validation
Service: Business logic & orchestration
Mapper: DTO ↔ Entity conversion via MapStruct
Repository: JPA repository to MySQL
OpenAPI: API contract & interactive docs (Swagger UI)


Prerequisites

Java 21 (e.g., Temurin 21)
Docker & Docker Compose
Build tool (choose one): Maven or Gradle


Quick Start
1) Configure environment
   Create a .env (used by docker-compose.yml):
   Plain Textenv isn’t fully supported. Syntax highlighting is based on Plain Text.# .envMYSQL_DATABASE=device_dbMYSQL_USER=device_userMYSQL_PASSWORD=device_passMYSQL_ROOT_PASSWORD=root_passAPP_PORT=8080MYSQL_PORT=3306Show more lines
2) Run with Docker Compose
   Shelldocker compose up --buildShow more lines
   This will:

Start MySQL with the database and user above
Build and start the Device API on port 8080


Swagger UI: http://localhost:8080/swagger-ui/index.html
OpenAPI JSON: http://localhost:8080/v3/api-docs