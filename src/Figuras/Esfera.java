package Figuras;

public class Esfera extends Figura3D {

    private double radio;

    // Constructor

    public Esfera(double radio) {
        this.radio = radio;
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
