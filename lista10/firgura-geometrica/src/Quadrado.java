public class Quadrado implements FiguraGeometrica {
    private double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new FiguraGeometricaException("Os lados de um quadrado devem ser maiores que zero");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 4;
    }

}
