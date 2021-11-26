<p align="center">
  <img alt="GitHub language count" src="https://img.shields.io/github/languages/count/brunotiyoda/hexagonal-architecture-in-kotlin#readme?color=%2304D361">

  <img alt="Repository size" src="https://img.shields.io/github/repo-size/brunotiyoda/hexagonal-architecture-in-kotlin#readme">

  <img alt="License" src="https://img.shields.io/badge/license-MIT-brightgreen">
</p>

# Hexagonal Architecture in Kotlin

## Sobre o projeto

A ideia é aplicar os conseitos de Domain Driven Design, Clean Architecture e Hexagonal Architecture. Explicando como as
camadas se comunicão por Ports and Adapters.

* API/Controller
    * recebe requisições
    * se comunica por meio de uma interface useCase com a camada de Application/Services
* A camada de Application/Services
    * onde fica o DOMAIN da aplicação
    * regras de negócio
    * se comunica por meio de uma interface persistence com a camada de Persistence/Entities
* A camada de Persistence/Entities
    * onde fica nossas clases que serão/são representação do nosso banco de dados

## Tecnologias usadas

* Kotlin
* Gradle
* Spring Boot
* OpenJDK 11

## Como rodar o projeto

Ainda não funciona

## Implementações futuras

* fazer funcionar

## Licença

Este projeto esta sobe a licença [MIT](./LICENSE).