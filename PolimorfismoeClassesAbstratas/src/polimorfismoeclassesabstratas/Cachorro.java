package polimorfismoeclassesabstratas;

public class Cachorro extends Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("Cachorro está latindo");
    }
    
    @Override
    public void mover(){
          System.out.println("Cachorro está se movendo");
    }
    
}
