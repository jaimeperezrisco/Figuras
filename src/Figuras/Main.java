package Figuras;

public class Main {
    public static void main(String[] args) {

        // Figuras 3D
        PiramideRectangular piramide = new PiramideRectangular(8, 3, 10);

        System.out.println("Información de Piramide: ");
        piramide.mostrarInformacion();

        System.out.println("------------------------------------------------");

        Esfera esfera = new Esfera(7);
        System.out.println("Información de Esfera: ");
        esfera.mostrarInformacion();

        System.out.println("------------------------------------------------");

        // Figuras 2D

        Circulo circulo = new Circulo(4);
        System.out.println("Información de Circulo: ");
        circulo.mostrarInformacion();

        System.out.println("------------------------------------------------");

        Rectangulo rectangulo = new Rectangulo(5, 7);
        System.out.println("Información de Rectangulo: ");
        rectangulo.mostrarInformacion();

    }
}
