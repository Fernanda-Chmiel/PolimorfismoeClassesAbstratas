package polimorfismoclassesabstratas;

public abstract class Pagamento {
    
    public double valor;
    
            
    public Pagamento(double valor) {
        this.valor = valor;
    }
    
    public abstract double calcularValor();
}
