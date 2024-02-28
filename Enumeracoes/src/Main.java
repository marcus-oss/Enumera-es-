public class Main {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.setNomeCliente("Marcus");
        pedido.setValorPedido(90);
        pedido.setStatus(StatusPedido.EMITIDO);
        pedido.cancelarPedido();
        System.out.println(pedido.getStatus());

        System.out.println(pedido.getTempoEntrega());

    }
}