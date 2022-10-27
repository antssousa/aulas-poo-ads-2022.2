public class PontoTeste {
    public static void main(String[] args) {
        Ponto p1 = new Ponto(2, 1);
        Ponto p2 = new Ponto(4, 5);
        Ponto p3 = new Ponto();
        Ponto p4 = new Ponto(p1);
        System.out.printf("A distancia entre o ponto p1 e p2 e %.2f\n", p1.distancia(p2));
        System.out.printf("A distancia entre o ponto p2 e p1 e %.2f\n", p2.distancia(p1));
        System.out.printf("A distancia entre o ponto p1 e p3 e %.2f\n", p1.distancia(p3));
        System.out.printf("A distancia entre o ponto p1 e p4 e %.2f\n", p1.distancia(p4));
    }
}
