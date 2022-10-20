public class Circulo {
    // Atributos
    double raio;

    // Nos parênteses tem os parâmetros do construtor
    Circulo(double raio) {
        this.raio = raio;
    }

    // Métodos (funções)
    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
}