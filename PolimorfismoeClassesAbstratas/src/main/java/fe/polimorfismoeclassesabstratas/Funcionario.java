/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

public abstract class Funcionario {
    
    public int salarioInicial;

    public Funcionario(int salarioInicial) {
        this.salarioInicial = salarioInicial;
    }

    public abstract int calcularSalario();
}
