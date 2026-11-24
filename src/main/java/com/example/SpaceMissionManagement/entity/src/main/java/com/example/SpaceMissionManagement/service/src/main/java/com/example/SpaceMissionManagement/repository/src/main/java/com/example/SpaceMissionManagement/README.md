# Space Mission Management System 🚀

## Project Overview
The Space Mission Management System is a Java-based backend application developed using Spring Boot and Spring Data JPA. It manages space mission information and performs database operations using custom JPQL queries with the `@Query` annotation.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- JPQL
- Oracle Database
- Maven
- Eclipse IDE

## Features
1. Find missions by agency name.
2. Find missions by destination.
3. Retrieve missions based on budget.
4. Find missions launched after a specific year.
5. Filter missions by status.
6. Search missions by agency and destination.
7. Find missions within a budget range.
8. Sort missions by launch year.
9. Find maximum and minimum mission budgets.
10. Calculate the average budget.
11. Count missions by agency.
12. Update mission status.
13. Update mission budget.
14. Delete a mission by ID.

## Project Structure
```text
SpaceMissionManagement
├── src/main/java
│   └── com.example.SpaceMissionManagement
│       ├── entity
│       │   └── SpaceMission.java
│       ├── repository
│       │   └── SpaceMissionRepository.java
│       ├── service
│       │   └── SpaceMissionService.java
│       └── SpaceMissionManagementApplication.java
├── src/main/resources
│   └── application.properties
└── pom.xml
```

## Database
Oracle Database is used to store space mission details.

Entity: `SpaceMission`

Fields:
- missionId
- missionName
- agencyName
- destination
- budget
- launchYear
- missionStatus

## How to Run
1. Clone this repository.
2. Open the project in Eclipse or another Java IDE.
3. Configure your Oracle database connection.
4. Update the database configuration locally.
5. Run `SpaceMissionManagementApplication.java`.

## Author
Manikanta

Java Developer | Spring Boot | SQL
