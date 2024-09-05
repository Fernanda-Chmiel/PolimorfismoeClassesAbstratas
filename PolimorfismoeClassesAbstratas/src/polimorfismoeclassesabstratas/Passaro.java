package polimorfismoeclassesabstratas;


public class Passaro extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Pássaro está piando");
    }

    @Override
    public void mover() {
        System.out.println("Pássaro está se movendo");
    }
    
    
}

