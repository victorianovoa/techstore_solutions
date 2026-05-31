<?php

require_once "../config/Database.php";

$db =
Database::getInstance()
->getConnection();

$sql =
"SELECT * FROM produtos";

$resultado =
$db->query($sql);

while(
    $produto =
    $resultado->fetch_assoc()
){

    echo
    $produto["nome"] .
    " - R$ " .
    $produto["preco"] .
    "<br>";
}
?>