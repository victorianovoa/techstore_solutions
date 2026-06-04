<?php

require_once '../models/Usuario.php';
require_once '../models/Produto.php';
require_once '../models/Pedido.php';

class TechStoreService
{
    private static ?TechStoreService $instancia = null;

    private array $usuarios = [];

    private array $produtos = [];

    private array $pedidos = [];

    private function __construct()
    {
    }

    public static function getInstance(): TechStoreService
    {
        if (self::$instancia === null) {
            self::$instancia = new TechStoreService();
        }

        return self::$instancia;
    }

    public function cadastrarUsuario(
        Usuario $usuario
    ): void {
        $this->usuarios[] = $usuario;
    }

    public function cadastrarProduto(
        Produto $produto
    ): void {
        $this->produtos[] = $produto;
    }

    public function registrarPedido(
        Pedido $pedido
    ): void {
        $this->pedidos[] = $pedido;
    }

    public function listarUsuarios(): array
    {
        return $this->usuarios;
    }

    public function listarProdutos(): array
    {
        return $this->produtos;
    }

    public function listarPedidos(): array
    {
        return $this->pedidos;
    }

    public function totalPedidos(): int
    {
        return count($this->pedidos);
    }
}