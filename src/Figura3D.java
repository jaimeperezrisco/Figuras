abstract class Figura3D extends Figura {

    @Override
    double calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }
//tengo que poner la clase abstracta para poder poner el metodo abstracto (?)
    abstract double calcularVolumen();
    
    public void mostrarInformacion() {
        // tipo de figura
        System.out.println("El tipo de figura es + algo");
        // area
        System.out.println("El area es " + calcularArea());
        // perimetro
        System.out.println("El area es " + calcularVolumen());

    }
}
