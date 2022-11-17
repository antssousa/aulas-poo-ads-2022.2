import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scan.nextLine();

        // Tamanho de uma String
        System.out.printf("A string tem %d caracteres\n", frase.length());

        // Mostrar a string com todas as letras em maiúscula
        System.out.printf("A string em maiuscula %s\n", frase.toUpperCase());

        // Número de vogais da String
        int contVog = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.toLowerCase().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contVog++;
            }
        }
        System.out.printf("A string tem %d vogais\n", contVog);

        // Se a string começa com UNI
        if (frase.toLowerCase().startsWith("uni")) {
            System.out.println("A string comeca com UNI");
        } else {
            System.out.println("A string nao comeca com UNI");
        }

        // Se a string termina com RIO
        if (frase.toLowerCase().endsWith("rio")) {
            System.out.println("A string termina com RIO");
        } else {
            System.out.println("A string nao termina com RIO");
        }
        System.out
                .printf("A string %s", frase.toLowerCase().endsWith("rio") ? "termina com RIO" : "nao termina com RIO");

        // Quantos dígitos de 0 a 9 existem na String
        int contDig = 0;
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.toLowerCase().charAt(i);
            if (Character.isDigit(letra)) {
                contDig++;
            }
        }
        System.out.printf("A string tem %d dígitos de 0 a 9\n", contDig);
    }
}
