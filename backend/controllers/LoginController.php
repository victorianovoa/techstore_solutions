<?php

session_start();

require_once
"../config/Database.php";

$db =
Database::getInstance()
->getConnection();

$email =
$_POST["email"];

$senha =
$_POST["senha"];
?>
