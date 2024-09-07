/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

public abstract class Pagamento {
    
    public double valor;
    
            
    public Pagamento(double valor) {
        this.valor = valor;
    }
    
    public abstract double calcularValor();
}
