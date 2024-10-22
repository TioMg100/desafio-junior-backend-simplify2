<h1 align="center">
  TODO List
</h1>

Desafio sistema de gerenciamento de tarefas (To-Do List)

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI Starter WebMVC UI](https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui/2.6.0)
- [Mysql](https://dev.mysql.com/downloads/)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta https://www.postman.com/downloads/ e swagger-ui:

- Criar Tarefa
```
   curl -X 'POST' \
  'http://localhost:8080/todos' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 0,
  "nome": "Chrystian",
  "descricao": "Teste 1",
  "realizado": true,
  "prioridade": 2
}'
```

- Listar Tarefas
```
$ http GET :8080/todos

   curl -X 'GET' \
  'http://localhost:8080/todos' \
  -H 'accept: */*
```

- Atualizar Tarefa
```
   curl -X 'PUT' \
  'http://localhost:8080/todos' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "id": 3,
  "nome": "Chrystian",
  "descricao": "update",
  "realizado": true,
  "prioridade": 3
}'
```

- Remover Tarefa
```
   curl -X 'DELETE' \
  'http://localhost:8080/todos/4' \
  -H 'accept: */*'
```