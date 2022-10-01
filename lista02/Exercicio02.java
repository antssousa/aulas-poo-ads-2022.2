import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario, aumento, novoSalario; // Declaração
        System.out.println("Digite o salario");
        salario = scan.nextDouble();

        if (salario > 1250) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }
        novoSalario = salario + aumento;

        System.out.printf("O aumento foi de R$ %.2f\n", aumento); // %s String, %d inteiros
        System.out.printf("O novo salario ficou de R$ %.2f", novoSalario);
    }
}
