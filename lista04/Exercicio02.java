import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scan.nextLine();
        String semEspaco = "";
        // for (int i = 0; i < frase.length(); i++) {
        // if (frase.charAt(i) != ' ') {
        // semEspaco += frase.charAt(i);
        // }
        // }
        semEspaco = frase.replaceAll(" ", "").toLowerCase();
        // System.out.println("Frase sem espacos: " + semEspaco);
        boolean ePalindromo = true;
        int tam = semEspaco.length();
        for (int i = 0, j = tam - 1; i < tam / 2; i++, j--) {
            if (semEspaco.charAt(i) != semEspaco.charAt(j)) {
                ePalindromo = false;
                break;
            }
        }
        if (ePalindromo) {
            System.out.printf("A frase \"%s\" e um palindromo\n", frase);
        } else {
            System.out.printf("A frase \"%s\" nao e um palindromo\n", frase);

        }
    }
}
