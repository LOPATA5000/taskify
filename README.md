# Taskify

Taskify is a simple task management backend built with Spring Boot, PostgreSQL, Flyway, and JPA.

## Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Flyway
- Maven
- Swagger / OpenAPI

## 
## Features

- Create a task
- Get all tasks
- Get a task by ID
- Update a task
- Delete a task
- Request validation
- Global error handling
- Database migrations with Flyway

## Run Locally

### 1. Start PostgreSQL

```bash
docker compose up -d
```

### 2. Run the application

Use IntelliJ IDEA or run:

```bash
./mvnw spring-boot:run
```

### 3. Open Swagger UI

```text
http://localhost:8080/swagger-ui/index.html
```

## API Endpoints

- `POST /tasks`
- `GET /tasks`
- `GET /tasks/{id}`
- `PUT /tasks/{id}`
- `DELETE /tasks/{id}`

## Example Request

```bash
curl -X POST http://localhost:8080/tasks \
  -H "Content-Type: application/json" \
  -d '{"title":"Buy milk","description":"2 bottles","status":"TODO"}'
```