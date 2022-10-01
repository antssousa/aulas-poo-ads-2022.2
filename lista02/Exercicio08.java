import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o deposito inicial");
        double capital = scan.nextDouble();
        System.out.println("Digite a taxa de juros");
        double taxa = scan.nextDouble();
        taxa /= 100; // taxa = taxa / 100;

        double montante = 0;
        double juros = 0;

        montante = capital;
        for (int i = 1; i <= 24; i++) {
            juros = montante * taxa; // j = ci
            montante += juros;
            System.out.printf("O total ganho no mes %d foi de R$ %.2f\n", i, juros);
        }
        System.out.printf("O montante foi de R$ %.2f\n", montante);
        System.out.printf("O valor ganho no periodo foi de R$ %.2f\n", (montante - capital));

    }
}
