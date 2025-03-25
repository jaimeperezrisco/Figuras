package Figuras;

public abstract class Figura2D extends Figura {

    // tengo que poner la clase abstract porque si no me da error
    public abstract double calcularPerimetro();

    public void mostrarInformacion() {
        // tipo de figura
        System.out.println("El tipo de figura es: " + this.getClass().getName());
        // area
        System.out.println("El area es: " + calcularArea());
        // perimetro
        System.out.println("El perimetro es: " + calcularPerimetro());
    }

}
