<?php

require_once 'Produto.php';

class Carrinho
{
    private array $produtos = [];

    public function adicionarProduto(
        Produto $produto
    ): bool
    {
        if ($produto->getEstoque() > 0) {

            $this->produtos[] = $produto;

            $produto->reduzirEstoque();

            return true;
        }

        return false;
    }

    public function removerProduto(
        Produto $produto
    ): bool
    {
        foreach ($this->produtos as $key => $item) {

            if (
                $item->getId()
                ===
                $produto->getId()
            ) {

                unset(
                    $this->produtos[$key]
                );

                return true;
            }
        }

        return false;
    }

    public function calcularTotal(): float
    {
        $total = 0;

        foreach (
            $this->produtos
            as $produto
        ) {

            $total +=
                $produto->getPreco();
        }

        return $total;
    }

    public function getProdutos(): array
    {
        return $this->produtos;
    }
}