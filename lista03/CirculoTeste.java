import java.util.Scanner;

public class CirculoTeste {
    public static void main(String[] args) {
        Circulo c1 = new Circulo(3);
        Circulo c2 = new Circulo(4);
        Circulo c3 = new Circulo(7);
        // System.out.println(
        // "A area do circulo c1 e " + c1.calcularArea() + " m² e o perimetro e " +
        // c1.calcularPerimetro() + " m");
        System.out.printf("A area do circulo c1 e %.2f m e o perimetro e %.2f m\n", c1.calcularArea(),
                c1.calcularPerimetro());
        System.out.printf("A area do circulo c2 e %.2f m e o perimetro e %.2f m\n", c2.calcularArea(),
                c2.calcularPerimetro());
        System.out.printf("A area do circulo c3 e %.2f m e o perimetro e %.2f m\n", c3.calcularArea(),
                c3.calcularPerimetro());

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do raio");
        double raio = scan.nextDouble();
        Circulo c4 = new Circulo(raio);
        System.out.println("Digite o valor do raio");
        Circulo c5 = new Circulo(scan.nextDouble());
        System.out.println("Digite o valor do raio");
        Circulo c6 = new Circulo(scan.nextDouble());
        System.out.printf("O perimetro do raio c4 e %.2f e a area e %.2f\n", c4.calcularPerimetro(), c4.calcularArea());
        System.out.printf("O perimetro do raio c5 e %.2f e a area e %.2f\n", c5.calcularPerimetro(), c5.calcularArea());
        System.out.printf("O perimetro do raio c6 e %.2f e a area e %.2f\n", c6.calcularPerimetro(), c6.calcularArea());
    }

}
