import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero");
        double n1 = scan.nextDouble();
        System.out.println("Digite outro numero");
        double n2 = scan.nextDouble();

        System.out.println("Digite a operacao que vc deseja?");
        System.out.println("+ = soma\n- = subtracao\n* = multiplicacao\n/ = divisao");
        String op = scan.next();

        switch (op) {
            case "+":
                // System.out.println("a soma e " + (n1 + n2));
                System.out.printf("%.2f + %.2f = %.2f", n1, n2, (n1 + n2));
                break;
            case "-":
                // System.out.println("a subtracao e " + (n1 - n2));
                System.out.printf("%.2f - %.2f = %.2f", n1, n2, (n1 - n2));
                break;
            case "*":
                System.out.println("a multplicacao e " + (n1 * n2));
                break;
            case "/":
                System.out.println("a divisao e " + (n1 / n2));
                break;
            default:
                System.out.println("Operacao invalida");
        }
        // if (op.equals("+")) {
        // System.out.println("a soma e " + (n1 + n2));
        // } else {
        // System.out.println("Operacao invalida");
        // }
    }
}
