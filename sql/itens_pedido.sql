CREATE TABLE itens_pedido (

    id INT
    AUTO_INCREMENT
    PRIMARY KEY,

    pedido_id INT,

    produto_id INT,

    quantidade INT,

    FOREIGN KEY (pedido_id)
    REFERENCES pedidos(id),

    FOREIGN KEY (produto_id)
    REFERENCES produtos(id)
