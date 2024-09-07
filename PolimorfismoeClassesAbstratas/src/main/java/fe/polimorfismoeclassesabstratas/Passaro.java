/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

public class Passaro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("O Pássaro está piando");
    }

    @Override
    public void mover() {
        System.out.println("O Pássaro está se movendo");
    }
    
    
}

