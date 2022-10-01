import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quantos dias o carro foi alugado");
        int dias = scan.nextInt();
        System.out.println("Digite a quantidade de quilômetros");
        int km = scan.nextInt();
        double aluguel = dias * 60 + km * 0.15;
        System.out.printf("O aluguel do sera de R$ %.2f", aluguel);
    }
}
