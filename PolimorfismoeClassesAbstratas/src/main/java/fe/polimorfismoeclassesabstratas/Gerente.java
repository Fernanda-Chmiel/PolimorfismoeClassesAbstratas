/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

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
