package Figuras;

public class Circulo extends Figura2D {

    private double radio;

    // Constructores

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Métodos
    @Override
    public double calcularArea() {
    
        double resultado = Math.PI * radio * radio;
        return resultado;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

}
