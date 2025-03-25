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
        double perimetroRectangulo = 2*(largo + ancho);
        return perimetroRectangulo;
    }
}
