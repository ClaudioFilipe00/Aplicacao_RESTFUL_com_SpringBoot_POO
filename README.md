# Estoque de Produtos

Este projeto é uma aplicação para gerenciamento de estoque de produtos desenvolvida com o framework **Spring Boot** utilizando o padrão **MVC** (Model-View-Controller). Ele permite realizar operações como cadastro, atualização, listagem, exclusão e consulta de produtos em estoque.

Tecnologias Utilizadas
- **Java**: Linguagem principal para o desenvolvimento da aplicação.
- **Spring Boot**: Framework para simplificar a criação de aplicativos baseados em Spring.
  - **Spring Boot Starter Data JPA**: Suporte para interações com bancos de dados utilizando JPA.
  - **Spring Boot Starter Web**: Facilita a criação de APIs RESTful e aplicações web.
  - **Spring Boot Starter Test**: Ferramentas para testes unitários e de integração.
- **Springdoc OpenAPI Starter (WebMvc UI)**: Geração de documentação interativa da API seguindo o padrão OpenAPI (Swagger UI).
- **Springfox Boot Starter**: Alternativa para integrar Swagger e gerar documentação da API automaticamente.
- **Banco de Dados H2**: Banco de dados relacional em memória, ideal para desenvolvimento e testes.
- **Jackson Databind**: Biblioteca para manipulação de dados JSON, incluindo serialização e desserialização.
- **Spring Boot Maven Plugin**: Plugin para empacotamento e execução da aplicação como JAR.
---
### Estrutura do Projeto

A aplicação está estruturada em quatro camadas principais:

- **Model**: Define a entidade principal **Produto** e mapeia para a tabela no banco de dados.
- **Controller**: Contém os controladores responsáveis por gerenciar as requisições HTTP e mapear as rotas da aplicação.
- **Repository**: Interface que define as operações CRUD (Create, Read, Update, Delete) para interação com o banco de dados.
- **Service**: Camada intermediária responsável pela lógica de negócios.
---
### Funcionalidades
- **Cadastro de Produtos**: Permite criar e gerenciar informações de produtos, incluindo nome, preço, quantidade em estoque e status de entrega.
- **Consulta de Produtos**:
  - Listar todos os produtos.
  - Buscar um produto específico por ID.
- **Atualização de Produtos**: Atualizar informações de produtos já cadastrados.
- **Exclusão de Produtos**: Remover produtos do estoque pelo ID.
---
### Modelos Principais
#### Produto

- **id**: Identificador único do produto.
- **nome**: Nome do produto.
- **preco**: Preço do produto.
- **quantidade**: Quantidade disponível em estoque.
- **entrega**: Indica se o produto está disponível para pronta entrega.
---
## Rotas Principais

- Rota	Método HTTP	Descrição
- /Listar Produtos	GET	Lista todos os produtos cadastrados.
- /Buscar Produto/{id}	GET	Retorna o produto com o ID fornecido.
- /Cadastrar Produto	POST	Cadastra um novo produto.
- /Atualizar/{id}	PUT	Atualiza as informações de um produto existente.
- /Deletar Produto/{id}	DELETE	Remove o produto com o ID fornecido.


### Configuração do Projeto
**Pré-requisitos:**
- **JDK 17** ou superior.
- **Maven** instalado.
Passo a Passo para Executar o Projeto
1. Clone o repositório:
   ```bash
   git clone https://github.com/ClaudioFilipe00/Aplicacao_RESTFUL_com_SpringBoot_POO.git
   ```
2. Navegue para o diretório do projeto:
   ```bash
   cd Aplicacao_RESTFUL_com_SpringBoot_POO
   ```
3. Instale as dependências:
   ```bash
   mvn install
   ```
4. Execute a aplicação:
   ```bash
   mvn spring-boot:run
   ```
5. Acesse a aplicação:
   Abra o navegador e vá para [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).
---
### Configuração do Banco de Dados

Por padrão, a aplicação utiliza o banco de dados H2 em memória para desenvolvimento e testes. Para usar um banco de dados externo, como MySQL, modifique o arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/nome_do_banco
spring.datasource.username=usuario
spring.datasource.password=senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```
---
### Melhorias Futuras
- Implementar autenticação e autorização com Spring Security.
- Adicionar suporte a relatórios de movimentação de estoque.
- Melhorar a interface do Swagger com customizações adicionais.
---

## Integrantes do Grupo
- Claudio Filipe Temoteo de Farias
- Giovanni Zanco
- Otavio matias Fernandes Neto
- Pedro Henrique Garcia Brandão
---

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.
Licença

Este projeto está licenciado sob a licença **MIT**. Veja o arquivo LICENSE para mais detalhes.
