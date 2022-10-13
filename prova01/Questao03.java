import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero binario: ");
        int n = scan.nextInt();

        int aux = n;
        int dec = 0;
        int exp = 0;
        // int exp = 1;
        while (aux != 0) {
            int resto = aux % 10;
            aux = aux / 10;
            dec += resto * Math.pow(2, exp);
            // dec += resto * exp;
            // exp = exp * 2;
            exp++;
        }
        System.out.printf("%d em decimal e %d", n, dec);
    }
}
