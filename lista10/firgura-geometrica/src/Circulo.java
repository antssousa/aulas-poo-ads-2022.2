public class Circulo implements FiguraGeometrica {

    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new FiguraGeometricaException("O raio nao pode ser menor ou igual a zero");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

}
