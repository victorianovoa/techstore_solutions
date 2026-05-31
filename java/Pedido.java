public class Pedido {

        private Carrinho carrinho;
    
        private StatusPedido status;
    
        public Pedido(Carrinho carrinho) {
    
            this.carrinho = carrinho;
    
            this.status = StatusPedido.PENDENTE;
        }
    
        public void confirmarPedido() {
    
            status = StatusPedido.CONFIRMADO;
    
            System.out.println("Pedido confirmado.");
    
            System.out.println(
                    "Status: " + status
            );
    
            System.out.println(
                    "Total: R$ "
                    + carrinho.calcularTotal()
            );
        }
    
        public StatusPedido getStatus() {
    
            return status;
        }
    }
    