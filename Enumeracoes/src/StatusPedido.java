public enum StatusPedido {

    RASCUNHO {
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return true;
        }
    },
    EMITIDO(10) {
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    EM_ANALISE(13) {
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return valorPedido < 100;
        }
    },
    ENTREGUE(6) {
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return false;
        }
    },
    FATURADO(12) {
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return false;
        }
    },
    SEPARADO(14){
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return false;
        }
    },
    CANCELADO(0){
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return false;
        }
    },
    DESPACHADO(9){
        @Override
        public boolean podeMudarStatusParaCancelado(double valorPedido) {
            return false;
        }
    };

    private Integer tempoEntregueEmHoras;


    StatusPedido() {

    }

    StatusPedido(int tempoEntregueEmHoras) {
        this.tempoEntregueEmHoras = tempoEntregueEmHoras;


    }

    public Integer getTempoEntregueEmHoras() {
        return tempoEntregueEmHoras;

    }

    public abstract boolean podeMudarStatusParaCancelado(double valorPedido);
}
