<?php

require_once "../config/Database.php";

$db =
Database::getInstance()
->getConnection();

$id =
$_GET["id"];

$sql =
"DELETE FROM produtos
WHERE id = ?";

$stmt =
$db->prepare($sql);

$stmt->bind_param(
    "i",
    $id
);

$stmt->execute();

echo
"Produto removido.";
?>