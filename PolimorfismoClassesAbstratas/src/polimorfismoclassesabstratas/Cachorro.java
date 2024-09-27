package polimorfismoclassesabstratas;

public class Cachorro extends Animal{
    
    @Override
    public void emitirSom(){
        System.out.println("O Cachorro está latindo");
    }
    
    @Override
    public void mover(){
          System.out.println("O Cachorro está se movendo");
    }
    
}
