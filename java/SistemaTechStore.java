import java.util.ArrayList;
import java.util.List;

public class SistemaTechStore {

    private static
    SistemaTechStore instancia;

    private List<Usuario> usuarios;

    private List<Produto> produtos;

    private List<Pedido> pedidos;

    private SistemaTechStore() {

        usuarios =
                new ArrayList<>();

        produtos =
                new ArrayList<>();

        pedidos =
                new ArrayList<>();
    }

    public static
    SistemaTechStore
    getInstance() {

        if (
                instancia == null
        ) {

            instancia =
                    new SistemaTechStore();
        }

        return instancia;
    }

    public void cadastrarUsuario(
            Usuario usuario
    ) {

        usuarios.add(
                usuario
        );

        System.out.println(
                "Usuário cadastrado: "
                        + usuario.getNome()
        );
    }

    public void cadastrarProduto(
            Produto produto
    ) {

        produtos.add(
                produto
        );

        System.out.println(
                "Produto cadastrado: "
                        + produto.getNome()
        );
    }

    public void registrarPedido(
            Pedido pedido
    ) {

        pedidos.add(
                pedido
        );

        System.out.println(
                "Pedido registrado."
        );
    }

    public void mostrarUsuarios() {

        System.out.println(
                "\nUsuários:"
        );

        for (
                Usuario usuario :
                usuarios
        ) {

            System.out.println(
                    "- " +
                    usuario.getNome()
            );
        }
    }

    public void mostrarProdutos() {

        System.out.println(
                "\nProdutos:"
        );

        for (
                Produto produto :
                produtos
        ) {

            produto.exibirProduto();

            System.out.println(
                    "------------------"
            );
        }
    }

    public void mostrarPedidos() {

        System.out.println(
                "\nPedidos registrados: "
                        + pedidos.size()
        );
    }
}