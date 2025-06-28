# Projeto Arquitetura Hexagonal com Java

## 📋 Sobre o Projeto

Este projeto demonstra na prática a implementação da **Arquitetura Hexagonal** (Ports and Adapters) utilizando Java e Spring Boot. O foco principal é mostrar como organizar e estruturar microsserviços de forma desacoplada, seguindo os princípios da Clean Architecture.

## 🎯 Objetivo

O objetivo principal deste projeto é aplicar os conceitos de arquitetura hexagonal em um ambiente real, criando uma aplicação que se comunica com diferentes sistemas externos através de adapters bem definidos, mantendo o core da aplicação isolado e testável.

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3.x**
- **Apache Kafka** - Para mensageria assíncrona
- **MongoDB** - Banco de dados NoSQL
- **Docker & Docker Compose** - Para containerização
- **Gradle** - Gerenciamento de dependências

## 🏗️ Arquitetura

O projeto segue os princípios da **Arquitetura Hexagonal**, organizando o código em camadas bem definidas:

```
src/main/java/
└── com.lucas.hexagonal/
    ├── adapters/
    │   ├── in/
    │   └── out/
    ├── application/
    │   ├── core/
    │   └── ports/
    └── config/
```

### Camadas da Arquitetura

- **Application**: Contém as regras de negócio e casos de uso
- **Ports**: Interfaces que definem contratos de entrada e saída
- **Adapters**: Implementações concretas
  - **In**: Controllers REST e Consumers Kafka
  - **Out**: Repositórios MongoDB e Producers Kafka

## 🚀 Funcionalidades Implementadas

- ✅ CRUD completo seguindo arquitetura hexagonal
- ✅ Comunicação assíncrona via Kafka
- ✅ Persistência em MongoDB
- ✅ API REST para operações síncronas
- ✅ Consumers para processamento de mensagens
- ✅ Producers para publicação de eventos
- ✅ Configurações com Docker Compose

## 📦 Como Executar

### Pré-requisitos
- Java 17+
- Docker e Docker Compose
- Gradle

### Executando o projeto

1. Clone o repositório:
```bash
git clone [URL_DO_REPOSITORIO]
cd projeto-arquitetura-hexagonal
```

2. Suba os serviços de infraestrutura:
```bash
docker-compose up -d
```

3. Execute a aplicação:
```bash
./gradlew bootRun
```

### Serviços disponíveis após execução:
- **Aplicação**: http://localhost:8082
- **MongoDB**: localhost:27017
- **Kafka**: localhost:2181

## 📚 Conceitos Aplicados

### Arquitetura Hexagonal
- Separação clara entre domínio e infraestrutura
- Inversão de dependências
- Testabilidade e flexibilidade para trocar implementações

## 📁 Estrutura de Pastas

```
projeto-arquitetura-hexagonal/
├── docker-local/
│   └── docker-compose.yml
├── gradle/
├── src/
│   └── main/
│       └── java/
│           └── com.lucas.hexagonal/
├── build.gradle
└── README.md
```

---

**Desenvolvido com foco em boas práticas de arquitetura de software e Clean Code.**
