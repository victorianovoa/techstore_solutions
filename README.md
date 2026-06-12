# TechStore Solutions

Sistema web de comércio eletrônico desenvolvido como projeto acadêmico do curso de Engenharia de Software do Centro Universitário de Brasília (UniCEUB).

---

## 📖 Sobre o Projeto

A **TechStore Solutions** é uma plataforma de e-commerce voltada para a comercialização de produtos tecnológicos, periféricos gamers, hardware e acessórios de informática.

O projeto foi desenvolvido com foco na aplicação prática de conceitos de **Engenharia de Software**, **Arquitetura em Camadas**, **Banco de Dados Relacional**, **Desenvolvimento Web**, **Programação Orientada a Objetos** e **Versionamento de Código**.

---

## 🎯 Objetivos Acadêmicos

O projeto foi desenvolvido para consolidar conhecimentos relacionados a:

* Engenharia de Software
* Arquitetura em Camadas
* Banco de Dados Relacional
* Desenvolvimento Web
* Programação Orientada a Objetos
* Controle de Versão com Git e GitHub
* Modelagem UML
* Desenvolvimento Back-end com PHP
* Desenvolvimento Front-end com HTML, CSS e JavaScript

---

## 🚀 Funcionalidades

### Cliente

* Cadastro de usuários
* Login no sistema
* Consulta ao catálogo de produtos
* Visualização de produtos
* Adição de produtos ao carrinho
* Finalização de pedidos

### Administrador

* Cadastro de produtos
* Atualização de produtos
* Exclusão de produtos
* Listagem de produtos
* Controle de estoque
* Gerenciamento das informações do sistema

---

## 🛠️ Tecnologias Utilizadas

### Front-end

* HTML5
* CSS3
* JavaScript

### Back-end

* PHP 8

### Banco de Dados

* MySQL

### Ferramentas

* Git
* GitHub
* XAMPP
* Visual Studio Code

---

## 🏗️ Arquitetura do Projeto

O sistema foi estruturado utilizando **Arquitetura em Camadas**, promovendo separação de responsabilidades entre interface, regras de negócio, controle e persistência de dados.

```text
techstore_solutions/

├── backend/
│   ├── config/
│   ├── controllers/
│   ├── models/
│   └── services/
│
├── frontend/
│   ├── assets/
│   │   └── images/
│   ├── css/
│   ├── js/
│   ├── index.html
│   ├── produtos.html
│   ├── login.html
│   ├── cadastro.html
│   ├── carrinho.html
│   └── admin.html
│
├── sql/
│   ├── techstore.sql
│   └── itens_pedido.sql
│
├── docs/
│
└── README.md
```

---

## 📐 Padrões Utilizados

### Singleton

Aplicado para centralizar o gerenciamento da conexão com o banco de dados por meio da classe `Database`.

### Programação Orientada a Objetos

Aplicada na modelagem das entidades:

* Produto
* Usuário
* Carrinho
* Pedido

### Arquitetura em Camadas

Organização do sistema em camadas independentes, facilitando manutenção, escalabilidade e reutilização do código.

---

## 🗄️ Banco de Dados

O sistema utiliza **MySQL** para armazenamento das informações.

### Principais tabelas

* usuarios
* produtos
* pedidos
* itens_pedido

---

## ⚙️ Como Executar o Projeto

### Pré-requisitos

* XAMPP
* PHP 8
* MySQL
* Navegador Web

### Passo 1 — Clonar o Repositório

```bash
git clone https://github.com/victorianovoa/techstore_solutions.git
```

### Passo 2 — Copiar para o XAMPP

Mover a pasta do projeto para:

```text
xampp/htdocs/techstore_solutions
```

### Passo 3 — Iniciar os Serviços

Iniciar:

* Apache
* MySQL

### Passo 4 — Configurar o Banco

Criar o banco de dados e executar os scripts presentes na pasta:

```text
sql/
```

### Passo 5 — Executar o Sistema

Acessar:

```text
http://localhost/techstore_solutions/frontend
```

---

## 🔄 Versionamento

O projeto utiliza **Git** e **GitHub** para controle de versões e rastreamento das alterações realizadas durante o desenvolvimento.

---

## 👥 Equipe

* Arthur Santana Santos
* Felipe Evangelista e Silva
* Ian Alves Calado
* Lucas Coelho de Castro
* Victória de Nóvoa Gama

---

## 📂 Repositório

https://github.com/victorianovoa/techstore_solutions

---

## 📄 Licença

Projeto desenvolvido para fins acadêmicos na disciplina **Metodologia de Desenvolvimento de Software** do **Centro Universitário de Brasília (UniCEUB)**.
