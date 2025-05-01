# Demo Spring Data Project

Este é um projeto de exemplo utilizando **Spring Boot** e **Spring Data JPA** com integração ao banco de dados PostgreSQL.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.3.5**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**

## Estrutura do Projeto

- **Controller**: [ClienteController.java](src/main/java/com/example/demo/controller/ClienteController.java) - Controlador REST para gerenciar clientes.
- **Service**: [ClienteService.java](src/main/java/com/example/demo/service/ClienteService.java) - Contém a lógica de negócios para clientes.
- **Repository**: [ClienteRepository.java](src/main/java/com/example/demo/repository/ClienteRepository.java) e [PessoaRepository.java](src/main/java/com/example/demo/repository/PessoaRepository.java) - Interfaces para acesso ao banco de dados.
- **Model**: Entidades JPA como [Cliente.java](src/main/java/com/example/demo/model/Cliente.java), [Pessoa.java](src/main/java/com/example/demo/model/Pessoa.java), etc.
- **DTO**: [ClienteDTO.java](src/main/java/com/example/demo/dto/ClienteDTO.java) - Objeto de transferência de dados para clientes.

## Configuração do Banco de Dados

Certifique-se de que o PostgreSQL esteja configurado e rodando. As configurações de conexão estão no arquivo [application.properties](src/main/resources/application.properties):

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/adb_exemplo
spring.datasource.username=postgres
spring.datasource.password=12345678
```

## Endpoints Disponíveis

### Clientes
- GET /clientes/cpf/{cpf}: Busca um cliente pelo CPF.
- POST /clientes: Cria um novo cliente.

Exemplo de payload para criar um cliente:
```json
{
  "pessoaId": 1,
  "nome": "João Silva",
  "cpf": "123.456.789-00",
  "dataNascimento": "1990-01-01",
  "mae": "Maria Silva",
  "dataDeCadastro": "2023-01-01",
  "status": "ATIVO"
}
```
