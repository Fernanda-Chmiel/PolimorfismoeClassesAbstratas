package polimorfismoclassesabstratas;

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