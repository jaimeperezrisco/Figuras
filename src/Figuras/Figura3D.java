package Figuras;

public abstract class Figura3D extends Figura {

    // tengo que poner la clase abstracta para poder poner el metodo abstracto (?)
    public abstract double calcularVolumen();

    public void mostrarInformacion() {
        // tipo de figura
        System.out.println("El tipo de figura es: " + this.getClass().getName());
        // area
        System.out.println("El area es: " + calcularArea());
        // volumen
        System.out.println("El volumen es: " + calcularVolumen());
    }
}
