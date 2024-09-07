/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;


public abstract class ContaBancaria {
    protected int saldo;

    public int getSaldo() {
        return saldo;
    }

    public abstract void sacar(int valor);
    public abstract void depositar(int valor);
}


