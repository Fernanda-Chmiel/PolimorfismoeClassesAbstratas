/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

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

