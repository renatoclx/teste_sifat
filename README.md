# teste_sifat
API de testes para verificação de produtos, os seus grupos relacionados e pedidos realizados

# Rotas criadas:
/groups/all -> Listagem dos grupos cadastrados /groups/best-sellers -> Listagem dos produtos mais vendidos

/products/all -> Listagem dos produtos cadastrados /produtcts/least-sold-products -> Listagem dos produtos menos vendidos

/orders/all -> Listagem dos pedidos realizados

# Detalhes para execução do projeto
O projeto está configurado para rodar na porta 8088, tendo como o update das tabelas automático quando a aplicação iniciada pela primeira vez O banco de dados utilizado foi o PostgresSQL, dentro de um container pré configurado no arquivo docker-compose.yml

# Docker
Tendo o docker configurado na estação, realize o commando "docker compose" dentro do projeto, para que o container seja criado juntamente com a imagem e a configuração padrão da base de dados (as configurações do container estão dentro do arquivo docer-compose.yml)

# SQL
Os inserts de testes estão na raiz do projeto, na pasta sql, nomeado como "teste_sifat.sql

# Considerações
O projeto foi criado utilizando o Spring Initializr, com Java 17, Maven e Spring Boot 3.3.2;

Foram utilizadas algumas dependências para escrita de código mais eficiente: 

-> lombok - Criação de código boiler plate;

-> Spring Web - Criação de aplicações MVC e API's Rest

-> DevTools - Atribui dinâmica ao projeto como LiveReload, restarts mais rápidos e aprimora a experiência de desenvolvimento 

-> jdbcDriver - Conexão com base de dados SQL
