package polimorfismoclassesabstratas;

public class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(int saldoInicial) {
        saldo = saldoInicial; // Inicializa diretamente
    }

    @Override
    public void sacar(int valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(int valor) {
        saldo += valor;
    }
}