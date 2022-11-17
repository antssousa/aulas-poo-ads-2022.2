import java.util.Scanner;

/*
 * Exercício para contar a quantidade de palavras e caracteres.
 */
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = scan.nextLine();
        // Removendo os espaços do começo e do fim da string
        frase = frase.trim();
        // Variável para contar a quantidade de espaços
        // int contEspaco = 0;
        // for (int i = 0; i < frase.length(); i++) {
        // if (frase.charAt(i) == ' ') {
        // contEspaco++;
        // }
        // }
        // // A quantidade de palavras é igual a quantidade de espaços mais 1
        // int quantPalavras = contEspaco + 1;
        // split em uma string transforma a string em uma array usando um caractere como
        // separador
        // Usando o split para dividir a string em um vetor e contando quantas posiçoes
        // o vetor tem

        int quantPalavras = frase.split(" ").length;
        System.out.printf("A frase tem %d caracteres e %d palavras\n", frase.length(), quantPalavras);

    }
}
