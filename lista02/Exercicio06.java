import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = scan.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        int j = 1;
        while (j <= n) {
            System.out.println(j); // System.out.println(j++);
            j++;
        }

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= n);

    }
}
