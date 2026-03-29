# API Restfull - Gestión de Postulaciones

Una API RESTful creada para la administración y registro de las empresas para el seguimiento de mis postulaciones, construida con arquitectura de microservicios. Este proyecto muestra la implementación de un CRUD (aún en desarrollo), usando una base de datos temporal (H2 DataBase)

## Demostración
https://github.com/user-attachments/assets/e4e64a1c-dcca-4010-8354-4f4d62bc003d

## Tecnologías Utilizadas 
* **Java 25**
* **Spring Boot 3** (Spring Web, Spring Data JPA)
* **H2 Database** (Base de datos relacional en memoria)
* **Lombok** (Reducción de código boilerplate)
* **Maven** (Gestor de dependencias)

## Arquitectura
* `Controller`: Manejo de peticiones HTTP (Endpoints).
* `Service`: Lógica de negocio y validaciones.
* `Repository`: Interfaces de persistencia (Spring Data JPA).
* `Model`: Entidades de base de datos (`@Entity`).

## Endpoint Principal
`POST /api/v1/empresas/crear`
