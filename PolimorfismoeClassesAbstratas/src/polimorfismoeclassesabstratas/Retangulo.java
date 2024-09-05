package polimorfismoeclassesabstratas;

public class Retangulo extends FormaGeometrica {
    private int largura;
    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public int calcularArea(){
    return largura * altura;
    }

    
    
}
