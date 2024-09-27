package polimorfismoclassesabstratas;

public abstract class Funcionario {
    
    public int salarioInicial;

    public Funcionario(int salarioInicial) {
        this.salarioInicial = salarioInicial;
    }

    public abstract int calcularSalario();
}
