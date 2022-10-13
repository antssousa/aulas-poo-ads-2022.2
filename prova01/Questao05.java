
/*Faça um Programa que peça dois números e imprima a soma de todos os números pares no intervalo entre os dois números. */
import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio, fim, soma = 0;
        System.out.println("Digite o inicio da sequencia");
        inicio = scan.nextInt();
        System.out.println("Digite o fim da sequencia");
        fim = scan.nextInt();
        if (inicio > fim) {
            int aux = inicio;
            inicio = fim;
            fim = aux;
        }
        for (int i = inicio; i <= fim; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.printf("A soma dos numeros pares e %d", soma);

    }
}