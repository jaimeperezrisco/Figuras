abstract class Figura2D extends Figura {

    //preguntar abajo
    @Override
    double calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    abstract double calcularPerimetro();

    public void mostrarInformacion() {
        //tipo de figura
        System.out.println("El tipo de figura es + algo");
        //area
        System.out.println("El area es " + calcularArea());
        //perimetro
        System.out.println("El area es " + calcularPerimetro());

    }

    
}
