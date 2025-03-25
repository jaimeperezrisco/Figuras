package Figuras;

public class PiramideRectangular extends Figura3D {

    private double a; // lado base 1
    private double b; // lado base 2
    private double h; // altura

    // Constructor

    public PiramideRectangular(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    // Métodos
    @Override

    // areaPiramide = Area de la base(ab) + Area lateral
    // https://www.universoformulas.com/matematicas/geometria/area-piramide-rectangular/

    public double calcularArea() {
        double areaPiramide = a * b + a * Math.sqrt(Math.pow(h, 2) + Math.pow(b, 2) / 4)
                + b * Math.sqrt(Math.pow(h, 2) + Math.pow(a, 2) / 4);
        return areaPiramide;
    }

    @Override
    public double calcularVolumen() {

        double areaBase = a * b;
        double volumenPiramide = (areaBase * h) / 3;
        return volumenPiramide;
    }

}
