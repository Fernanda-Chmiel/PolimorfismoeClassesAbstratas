package polimorfismoeclassesabstratas;


public class Gato extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Gato está miando");
    }

    @Override
    public void mover() {
        System.out.println("Gato está se movendo");
    }
}