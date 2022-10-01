import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hex = "0123456789ABCDEF";
        System.out.println("Digite um numero");
        int n = scan.nextInt();
        System.out.println("Digite a base que deseja");
        int base = scan.nextInt();
        int aux = n;
        String nHex = "";
        while (aux != 0) {
            int resto = aux % base;
            aux = (int) (aux / base);
            nHex += hex.charAt(resto);
        }
        System.out.printf("%d na base %d e ", n, base);
        for (int i = nHex.length() - 1; i >= 0; i--) {
            System.out.print(nHex.charAt(i));
        }

    }
}
