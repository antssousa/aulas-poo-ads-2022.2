import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um nome completo");
        String nome = scan.nextLine();
        String[] vetorNome = nome.toUpperCase().split(" ");
        String iniciais = "";
        // for (String palavra : vetorNome) {
        // if (palavra.length() > 3) {
        // iniciais += palavra.charAt(0);
        // }
        // }
        for (String palavra : vetorNome) {
            if (!(palavra.length() <= 3 && (palavra.startsWith("D") || palavra.equals("E")))) {
                iniciais += palavra.charAt(0);
            }
        }
        System.out.printf("As iniciais do %s e %s\n", nome, iniciais);
    }
}