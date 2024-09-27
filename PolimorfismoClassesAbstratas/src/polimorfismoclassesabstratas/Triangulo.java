package polimorfismoclassesabstratas;

public class Triangulo extends FormaGeometrica{
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public int calcularArea(){
    return (base * altura)/2;
    }
    
}
