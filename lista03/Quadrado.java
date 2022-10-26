public class Quadrado {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    double perimetro() {
        return lado * 4;
    }

    double area() {
        return lado * lado;
    }
}