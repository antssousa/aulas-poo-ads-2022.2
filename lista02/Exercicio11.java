import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String hex = "0123456789ABCDEF";
        System.out.println("Digite um numero");
        int n = scan.nextInt();
        int aux = n;
        String nHex = "";
        while (aux != 0) {
            int resto = aux % 16;
            aux = (int) (aux / 16);
            nHex += hex.charAt(resto);
        }
        System.out.print(n + " em hexadecimal e ");
        for (int i = nHex.length() - 1; i >= 0; i--) {
            System.out.print(nHex.charAt(i));
        }

    }
}
