/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;


public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("O Gato está miando");
    }

    @Override
    public void mover() {
        System.out.println("O Gato está se movendo");
    }
}