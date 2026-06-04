<?php

require_once "../config/Database.php";

$db =
    Database::getInstance()
    ->getConnection();

$id =
    $_POST["id"];

$nome =
    $_POST["nome"];

$preco =
    $_POST["preco"];

$estoque =
    $_POST["estoque"];

$sql =
    "UPDATE produtos
    SET nome = ?,
        preco = ?,
        estoque = ?
    WHERE id = ?";

$stmt =
    $db->prepare($sql);

$stmt->bind_param(
    "sdii",
    $nome,
    $preco,
    $estoque,
    $id
);

$stmt->execute();

echo "Produto atualizado com sucesso.";

?>