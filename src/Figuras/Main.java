package Figuras;

public class Main {
    public static void main(String[] args) {
        PiramideRectangular piramide = new PiramideRectangular(8, 3, 10);

        System.out.println(piramide.calcularArea());
        System.out.println(piramide.calcularVolumen());

    }
}
