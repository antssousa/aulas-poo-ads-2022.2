import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digit a velocidade do carro");
        double vel = scan.nextDouble();
        if (vel > 80) {
            double multa = (vel - 80) * 5;
            System.out.printf("Voce foi multado em R$ %.2f", multa);
        } else {
            System.out.println("Voce e top, nao foi multado");
        }
    }
}
