package polimorfismoclassesabstratas;

public abstract class ContaBancaria {
    protected int saldo;

    public int getSaldo() {
        return saldo;
    }

    public abstract void sacar(int valor);
    public abstract void depositar(int valor);
}
