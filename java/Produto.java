public class Produto {

    private int id;

    private String nome;

    private double preco;

    private int estoque;

    public Produto(
            int id,
            String nome,
            double preco,
            int estoque
    ) {

        this.id = id;

        this.nome = nome;

        this.preco = preco;

        this.estoque = estoque;
    }

    public int getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public double getPreco() {

        return preco;
    }

    public int getEstoque() {

        return estoque;
    }

    public void reduzirEstoque() {

        if (estoque > 0) {

            estoque--;
        }
    }

    public void exibirProduto() {

        System.out.println(
                "ID: " + id
        );

        System.out.println(
                "Produto: " + nome
        );

        System.out.println(
                "Preço: R$ " +
                String.format("%.2f", preco)
        );

        System.out.println(
                "Estoque: " + estoque
        );
    }
}