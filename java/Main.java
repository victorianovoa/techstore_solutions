public class Main {

        public static void main(String[] args) {
    
            SistemaTechStore sistema =
                    SistemaTechStore.getInstance();
    
            Usuario usuario =
                    new Usuario(
                            1,
                            "Victória",
                            "victoria@email.com"
                    );
    
            Produto produto1 =
                    new Produto(
                            1,
                            "Mouse Gamer RGB",
                            199.90,
                            15
                    );
    
            Produto produto2 =
                    new Produto(
                            2,
                            "Teclado Mecânico",
                            349.90,
                            10
                    );
    
            Produto produto3 =
                    new Produto(
                            3,
                            "Headset Gamer",
                            279.90,
                            8
                    );
    
            Produto produto4 =
                    new Produto(
                            4,
                            "Monitor 27 Polegadas",
                            1299.90,
                            5
                    );
    
            Produto produto5 =
                    new Produto(
                            5,
                            "SSD 1TB",
                            499.90,
                            12
                    );
    
            sistema.cadastrarUsuario(usuario);
    
            sistema.cadastrarProduto(produto1);
            sistema.cadastrarProduto(produto2);
            sistema.cadastrarProduto(produto3);
            sistema.cadastrarProduto(produto4);
            sistema.cadastrarProduto(produto5);
    
            Carrinho carrinho =
                    new Carrinho();
    
            carrinho.adicionarProduto(produto1);
            carrinho.adicionarProduto(produto2);
            carrinho.adicionarProduto(produto3);
    
            Pedido pedido =
                    new Pedido(carrinho);
    
            pedido.confirmarPedido();

            sistema.registrarPedido(pedido);

            sistema.mostrarPedidos();
    
            sistema.mostrarUsuarios();
    
            sistema.mostrarProdutos();
        }
    }