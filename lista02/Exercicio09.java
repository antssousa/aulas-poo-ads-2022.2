import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        long n = scan.nextLong();

        boolean ePrimo = true;
        for (int i = 2; i <= (n / 2); i++) {
            if (n % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (n > 1 && ePrimo) {
            System.out.printf("%d e primo", n);
        } else {
            System.out.printf("%d nao e primo", n);
        }
    }
}
