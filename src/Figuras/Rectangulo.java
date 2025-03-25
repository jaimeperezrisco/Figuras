package Figuras;

public class Rectangulo extends Figura2D {

    private double largo;
    private double ancho;

    // Constructor

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    // Métodos

    @Override

    public double calcularArea() {
        double areaRectangulo = largo * ancho;
        return areaRectangulo;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroRectangulo = Math.pow(largo, 2) + Math.pow(ancho, 2);
        return perimetroRectangulo;
    }
}
