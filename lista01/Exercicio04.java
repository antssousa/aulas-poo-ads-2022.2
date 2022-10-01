import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Fahrenheit");
        double fah = scan.nextDouble();
        double cel = 5 * ((fah - 32) / 9);
        System.out.printf("A temperatura em graus Celsius e %.2f e em Fahrenheit e %.2f", cel, fah);
    }
}
