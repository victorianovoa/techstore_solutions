# TechStore Solutions

Sistema web de comércio eletrônico desenvolvido como projeto acadêmico do curso de Engenharia de Software do Centro Universitário de Brasília (UniCEUB).

## Sobre o Projeto

A TechStore Solutions é uma plataforma de e-commerce voltada para a comercialização de produtos tecnológicos, periféricos gamers, hardware e acessórios de informática.

O projeto foi desenvolvido com foco na aplicação prática de conceitos de Engenharia de Software, Modelagem UML, Arquitetura em Camadas, Banco de Dados Relacional, Programação Orientada a Objetos e Versionamento de Código.

## Funcionalidades

### Cliente

* Cadastro de usuários
* Login no sistema
* Consulta ao catálogo de produtos
* Adição de produtos ao carrinho
* Visualização de produtos
* Finalização de pedidos

### Administrador

* Cadastro de produtos
* Atualização de produtos
* Exclusão de produtos
* Listagem de produtos
* Controle de estoque
* Gerenciamento de informações do sistema

## Tecnologias Utilizadas

### Front-end

* HTML5
* CSS3
* JavaScript

### Back-end

* PHP

### Banco de Dados

* MySQL

### Ferramentas

* Git
* GitHub
* XAMPP
* Visual Studio Code

## Arquitetura do Projeto

O sistema foi estruturado utilizando arquitetura em camadas:

backend/

* config
* controllers
* models
* services

frontend/

sql/

docs/

## Padrões Utilizados

### Singleton

O padrão Singleton foi aplicado para centralizar o gerenciamento da conexão com o banco de dados através da classe Database.

## Estrutura do Projeto

techstore_solutions/

backend/

* config/
* controllers/
* models/
* services/

frontend/

sql/

docs/

README.md

## Banco de Dados

O sistema utiliza MySQL para armazenamento das informações.

Principais tabelas:

* usuarios
* categorias
* produtos
* pedidos
* itens_pedido

## Como Executar o Projeto

### Pré-requisitos

* XAMPP
* PHP
* MySQL
* Navegador Web

### Passos

1. Clonar o repositório.

2. Copiar o projeto para a pasta htdocs do XAMPP.

3. Iniciar Apache e MySQL.

4. Criar o banco de dados utilizando os scripts da pasta sql.

5. Acessar o projeto pelo navegador.

## Versionamento

O projeto utiliza Git e GitHub para controle de versões e rastreamento das alterações realizadas durante o desenvolvimento.

## Equipe

* Arthur Santana Santos
* Felipe Evangelista e Silva
* Ian Alves Calado
* Lucas Coelho de Castro
* Victória de Nóvoa Gama

## Repositório

https://github.com/victorianovoa/techstore_solutions

## Licença

Projeto desenvolvido para fins acadêmicos na disciplina Metodologia de Desenvolvimento de Software do Centro Universitário de Brasília (UniCEUB).
