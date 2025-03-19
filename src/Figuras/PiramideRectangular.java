package Figuras;

public class PiramideRectangular extends Figura3D {
    // asumo que es la piramide rectangular recta
    private double caras;
    private double altura;
    private double a; //longitud de la base
    private double b; //ancho de la base

    // Constructor

    public PiramideRectangular(double caras, double altura, double base) {
        this.caras = caras;
        this.altura = altura;
        this.base = base;

    }

    // Métodos
    @Override
    public double calcularVolumen() {
        double volumen = 4 / 3 * Math.PI * Math.pow(radio, 3);
        return volumen;
    }

    @Override
    public double calcularArea() {
        double area = 4 * Math.PI * Math.pow(radio, 2);
        return area;
    }

}
