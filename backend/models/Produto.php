<?php

class Produto
{
    private int $id;

    private string $nome;

    private float $preco;

    private int $estoque;

    public function __construct(
        int $id,
        string $nome,
        float $preco,
        int $estoque
    ) {
        $this->id = $id;
        $this->nome = $nome;
        $this->preco = $preco;
        $this->estoque = $estoque;
    }

    public function getId(): int
    {
        return $this->id;
    }

    public function getNome(): string
    {
        return $this->nome;
    }

    public function getPreco(): float
    {
        return $this->preco;
    }

    public function getEstoque(): int
    {
        return $this->estoque;
    }

    public function reduzirEstoque(): void
    {
        if ($this->estoque > 0) {
            $this->estoque--;
        }
    }

    public function exibirProduto(): array
    {
        return [
            'id' => $this->id,
            'nome' => $this->nome,
            'preco' => $this->preco,
            'estoque' => $this->estoque
        ];
    }
}