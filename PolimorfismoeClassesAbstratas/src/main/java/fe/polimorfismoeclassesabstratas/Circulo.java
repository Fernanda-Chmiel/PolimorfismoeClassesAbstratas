/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fe.polimorfismoeclassesabstratas;

public class Circulo extends FormaGeometrica{
    private int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }

   @Override
   public int calcularArea(){
   return (int) (3.14 * raio * raio);
   }
  
    
}
