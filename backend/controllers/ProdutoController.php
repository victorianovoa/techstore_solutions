<?php

require_once
"../config/Database.php";

$db =
Database::getInstance()
->getConnection();

$nome =
$_POST["nome"];

$preco =
$_POST["preco"];

$estoque =
$_POST["estoque"];

$sql =
"INSERT INTO produtos
(nome, preco, estoque)
VALUES (?, ?, ?)";

$stmt =
$db->prepare($sql);

$stmt->bind_param(
"sdi",
$nome,
$preco,
$estoque
);

$stmt->execute();
?>
