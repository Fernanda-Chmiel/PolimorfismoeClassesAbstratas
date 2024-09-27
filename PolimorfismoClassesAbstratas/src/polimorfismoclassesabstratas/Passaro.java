package polimorfismoclassesabstratas;

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