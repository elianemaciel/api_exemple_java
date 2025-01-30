# API de exemplo para contexto de pagamentos

<p align="center">
  <a href="https://nestjs.com" target="_blank">
    <img src="https://nestjs.com/img/logo_text.svg" alt="NestJS Logo" width="400" />
  </a>
</p>

Esta é uma API desenvolvida em Java utilizando o framework Spring Boot. Ela foi criada para cadastrar pagamentos.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Data JPA** - Para persistência de dados
- **H2 Database**
- **Maven** - Para gerenciamento de dependências
- **Swagger** - Para documentação da API

## Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **Java JDK 17** (ou superior)
- **Maven** (recomendado)

## Configuração do Projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/elianemaciel/api_exemple_java.git
   cd api_exemple_java
   ```

2. Configure o MongoDB:

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
```

3. Execute o projeto:

```bash
mvn spring-boot:run
```

A API estará disponível em http://localhost:8080.

### Endpoints da API

Principais endpoints disponíveis na API:

POST /api/payments - Cria um novo pagamento.

### Documentação da API

A documentação da API pode ser acessada via Swagger UI:

Swagger UI: http://localhost:8080/swagger-ui.html
