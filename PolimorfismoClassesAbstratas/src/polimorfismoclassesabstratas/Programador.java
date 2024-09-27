package polimorfismoclassesabstratas;

public class Programador extends Funcionario {
     private static final int ADD_HORAS_EXTRAS = 570;

    public Programador(int salarioInicial) {
        super(salarioInicial);
    }
     
     @Override
     public int calcularSalario(){
       return salarioInicial + ADD_HORAS_EXTRAS;
     }
     
}
