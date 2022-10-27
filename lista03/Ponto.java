public class Ponto {
    // Atributos
    int x;
    int y;

    // Construtores (sobrecarga)
    Ponto() {

    }

    Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Ponto(Ponto p) {
        this(p.x, p.y);
    }

    // Métodos
    double distancia(Ponto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

}
