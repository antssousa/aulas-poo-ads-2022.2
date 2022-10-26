public class QuadradoTeste {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(3);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);
        System.out.printf("A area do quadrado e %.2f e o perimetro e %.2f\n", q1.area(), q1.perimetro());
        System.out.printf("A area do quadrado e %.2f e o perimetro e %.2f\n", q2.area(), q2.perimetro());
        System.out.printf("A area do quadrado e %.2f e o perimetro e %.2f\n", q3.area(), q3.perimetro());
    }
}
