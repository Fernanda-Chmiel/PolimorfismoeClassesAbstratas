package polimorfismoclassesabstratas;

public class Gerente extends Funcionario {
    
    private static final int BONUS = 2450;

    public Gerente(int salarioInicial) {
        super(salarioInicial);
    }

    @Override
    public int calcularSalario() {
        return salarioInicial + BONUS;
    }
}