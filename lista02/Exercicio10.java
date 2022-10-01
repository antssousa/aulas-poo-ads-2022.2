import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero em base 10");
        int n = scan.nextInt();
        int aux = n;
        String bin = "";
        while (aux != 0) {
            int resto = aux % 2;
            bin += resto;
            aux = (int) (aux / 2);
        }
        System.out.print(n + " na base binaria e ");
        for (int i = bin.length() - 1; i >= 0; i--) {
            System.out.print(bin.charAt(i));
        }
    }
}
