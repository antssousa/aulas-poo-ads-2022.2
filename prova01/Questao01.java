import java.util.Scanner;

/*Um número é dito ser capicua quando lido da esquerda para a direita é o mesmo que quando  lido  da  direita  para  a  esquerda.  O  ano  2002,  por  exemplo,  é capicua.  Então, elabore  um algoritmo para verificar se um número é capicua. Atenção só podem ser feito usando operações matemáticas. */

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n = scan.nextInt();
        // int exp = -1;
        int exp = (int) Math.log10(n);
        int aux = n;
        // while (aux != 0) {
        // exp++;
        // aux = aux / 10;
        // }
        // Math.log10(n);
        aux = n;
        int resto = 0;
        int nInverto = 0;
        while (aux != 0) {
            resto = aux % 10;
            aux = aux / 10;
            nInverto += resto * Math.pow(10, exp);
            exp--;
        }

        if (n == nInverto) {
            System.out.printf("%d e capicua", n);
        } else {
            System.out.printf("%d e %d nao sao capicuas", n, nInverto);
        }
    }
}
