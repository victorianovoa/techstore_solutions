<?php

class Database
{
    private static ?Database $instance = null;

    private mysqli $connection;

    private function __construct()
    {
        $this->connection = new mysqli(
            "localhost",
            "root",
            "",
            "techstore"
        );

        if ($this->connection->connect_error) {
            die(
                "Erro de conexão: " .
                $this->connection->connect_error
            );
        }
    }

    public static function getInstance(): Database
    {
        if (self::$instance === null) {
            self::$instance = new Database();
        }

        return self::$instance;
    }

    public function getConnection(): mysqli
    {
        return $this->connection;
    }
}