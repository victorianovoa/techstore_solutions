<?php

require_once 'Carrinho.php';
require_once 'StatusPedido.php';

class Pedido
{
    private Carrinho $carrinho;

    private string $status;

    public function __construct(
        Carrinho $carrinho
    ) {
        $this->carrinho = $carrinho;

        $this->status = StatusPedido::PENDENTE;
    }

    public function confirmarPedido(): array
    {
        $this->status = StatusPedido::CONFIRMADO;

        return [
            'status' => $this->status,
            'total' => $this->carrinho->calcularTotal()
        ];
    }

    public function getStatus(): string
    {
        return $this->status;
    }
}