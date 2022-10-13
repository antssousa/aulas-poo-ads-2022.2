import java.util.Scanner;

public class Questa02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = scan.nextInt();
        System.out.println("Digite outro numero");
        int n2 = scan.nextInt();
        int a = n1, b = n2;
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }

        System.out.printf("O MDC de %d e %d e %d", n1, n2, a);

    }
}
