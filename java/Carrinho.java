import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Produto> produtos;

    public Carrinho() {

        produtos =
                new ArrayList<>();
    }

    public void adicionarProduto(
            Produto produto
    ) {

        if (
                produto.getEstoque() > 0
        ) {

            produtos.add(
                    produto
            );

            produto.reduzirEstoque();

            System.out.println(
                    "Produto adicionado: "
                            + produto.getNome()
            );

        } else {

            System.out.println(
                    "Produto indisponível."
            );
        }
    }

    public void removerProduto(
            Produto produto
    ) {

        if (
                produtos.remove(
                        produto
                )
        ) {

            System.out.println(
                    "Produto removido: "
                            + produto.getNome()
            );

        } else {

            System.out.println(
                    "Produto não encontrado no carrinho."
            );
        }
    }

    public double calcularTotal() {

        double total = 0;

        for (
                Produto produto :
                produtos
        ) {

            total +=
                    produto.getPreco();
        }

        return total;
    }

    public void mostrarCarrinho() {

        System.out.println(
                "\nCarrinho:"
        );

        for (
                Produto produto :
                produtos
        ) {

            System.out.println(
                    "- " +
                    produto.getNome()
            );
        }

        System.out.println(
                "Total: R$ " +
                String.format(
                        "%.2f",
                        calcularTotal()
                )
        );
    }
}