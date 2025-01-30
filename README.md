# Nome da API

Esta é uma API desenvolvida em Java utilizando o framework Spring Boot. Ela foi criada para [descreva o propósito da API, por exemplo, "gerenciar usuários e suas tarefas"].

## Tecnologias Utilizadas

- **Java 17** (ou a versão que você está utilizando)
- **Spring Boot 3.x** (ou a versão que você está utilizando)
- **Spring Data JPA** - Para persistência de dados
- **H2 Database** (ou outro banco de dados, como MySQL, PostgreSQL, etc.)
- **Maven** - Para gerenciamento de dependências
- **Swagger** - Para documentação da API (opcional)
- **Lombok** - Para reduzir boilerplate code (opcional)

## Pré-requisitos

Antes de começar, você precisará ter instalado em sua máquina:

- **Java JDK 17** (ou superior)
- **Maven** (recomendado)
- **Docker** (opcional, se estiver utilizando containers)

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
