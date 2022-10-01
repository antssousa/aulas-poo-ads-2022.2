import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a distancia em km");
        double dist = scan.nextDouble();

        double passagem;
        if (dist <= 200) {
            passagem = dist * 0.50;
        } else {
            passagem = dist * 0.45;
        }
        System.out.printf("A passagem custou R$ %.2f", passagem);
    }
}
