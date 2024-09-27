package polimorfismoclassesabstratas;

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