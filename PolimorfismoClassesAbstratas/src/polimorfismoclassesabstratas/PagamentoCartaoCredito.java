package polimorfismoclassesabstratas;

public class PagamentoCartaoCredito extends Pagamento {
    private static final double TAXA_SERVICO = 0.03; //taxa

    public PagamentoCartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public double calcularValor() {
        return valor + (valor * TAXA_SERVICO);
    }
}
