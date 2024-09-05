package polimorfismoeclassesabstratas;


public class PolimorfismoeClassesAbstratas {


    public static void main(String[] args) {
        
       // ex1
//        FormaGeometrica Circulo = new Circulo(5); //informar raio
//        System.out.println("Área do Círculo aproximada: " + Circulo.calcularArea());
//        FormaGeometrica Retangulo = new Retangulo(4,5); // informar largura e altura 
//        System.out.println("Área do Retângulo aproximada: " + Retangulo.calcularArea());
//        FormaGeometrica Triangulo = new Triangulo(4,5); // informar base e altura
//        System.out.println("Área do Triângulo aproximada: " + Triangulo.calcularArea());

       // ex2
       Animal cachorro = new Cachorro();
       cachorro.emitirSom();
       cachorro.mover();
       
        System.out.println("--------------------------");
       
       Animal passaro = new Passaro();
       passaro.emitirSom();
       passaro.mover();
        
        System.out.println("--------------------------");
       
      Animal gato = new Gato();
      gato.emitirSom();
      gato.mover();
      
    }
    
}
