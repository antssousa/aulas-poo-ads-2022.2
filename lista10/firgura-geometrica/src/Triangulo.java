public class Triangulo implements FiguraGeometrica {

    private double lado1, lado2, lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        if (!validarTriangulo(lado1, lado2, lado3)) {
            throw new FiguraGeometricaException("Os valores nao formam um triangulo");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + laod3;
    }

    private boolean validarTriangulo(double a, double b, double c) {
        return (a + b > c && a + c > b && b + c > a);
    }

}
