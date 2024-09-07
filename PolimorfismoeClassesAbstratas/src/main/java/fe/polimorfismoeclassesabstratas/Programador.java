/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

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
