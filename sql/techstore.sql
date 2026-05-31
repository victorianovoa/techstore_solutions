CREATE DATABASE techstore;

USE techstore;

CREATE TABLE usuarios (

id INT AUTO_INCREMENT PRIMARY KEY,

nome VARCHAR(100),

email VARCHAR(100),

cpf VARCHAR(20),

senha VARCHAR(255)

);

CREATE TABLE categorias (

id INT AUTO_INCREMENT PRIMARY KEY,

nome VARCHAR(100)

);

CREATE TABLE produtos (

id INT AUTO_INCREMENT PRIMARY KEY,

nome VARCHAR(100),

descricao TEXT,

preco DECIMAL(10,2),

estoque INT,

categoria_id INT,

FOREIGN KEY
(categoria_id)
REFERENCES categorias(id)

);
