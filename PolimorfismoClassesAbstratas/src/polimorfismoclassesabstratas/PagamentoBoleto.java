package polimorfismoclassesabstratas;

public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double valor) {
        super(valor);
    }
    
   
    @Override
    public double calcularValor() {
        return valor; // Sem taxa adicional
    }
}
