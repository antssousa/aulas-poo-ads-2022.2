import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o tamanho da sequencia");
        int n = scan.nextInt();
        System.out.println("Digite um numero");
        int ant = scan.nextInt();
        int atual;
        int quantSeg = 1;
        for (int i = 1; i < n; i++) {
            System.out.println("Digite um numero");
            atual = scan.nextInt();
            if (atual != ant) {
                quantSeg++;
                ant = atual;
            }
        }
        System.out.println("Quantidade de sequencias: " + quantSeg);
    }

}
