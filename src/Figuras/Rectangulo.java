package Figuras;
//TODO
public class Rectangulo extends Figura2D {
    
    private double lado;

    public Rectangulo(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularPerimetro() {
        double resultado = lado * lado;
        return resultado;
    }
}
