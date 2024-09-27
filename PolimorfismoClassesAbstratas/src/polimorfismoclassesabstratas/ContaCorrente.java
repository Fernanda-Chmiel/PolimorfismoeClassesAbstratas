package polimorfismoclassesabstratas;

public class ContaCorrente extends ContaBancaria {
    public ContaCorrente(int saldoInicial) {
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
