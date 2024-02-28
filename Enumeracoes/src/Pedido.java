public class Pedido {


    public static final int ORIGEM_BALCAO = 0;
    public static final int ORIGEM_ONLINE = 1;

    private String nomeCliente;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private double valorPedido;
    private OrigemPedido origem = OrigemPedido.ONLINE;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public StatusPedido getStatus() {
        return status;
    }

//    public void setStatus(StatusPedido status) {
//        this.status = status;
//    }


    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(double valorPedido) {
        this.valorPedido = valorPedido;
    }

    public int getTempoEntrega() {
        return status.getTempoEntregueEmHoras();

    }


    public void marcarComoEntregue() {
        status = StatusPedido.ENTREGUE;
    }

    public void emitir() {
        status = StatusPedido.EMITIDO;
    }

    public void cancelarPedido() {
        if (StatusPedido.RASCUNHO.equals(getStatus()) || (StatusPedido.EMITIDO.equals(getStatus()) && getValorPedido() < 100)) {
            status = StatusPedido.CANCELADO;
        } else {
            throw new IllegalStateException("Pedido não pode ser cancelado");

        }
    }
}
