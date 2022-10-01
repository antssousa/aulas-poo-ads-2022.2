import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario");
        double salario = scan.nextDouble();
        System.out.println("Digite a porcentagem do aumento");
        double porcentagem = scan.nextDouble();
        double aumento = salario * porcentagem / 100;
        double novoSalario = salario + aumento;
        System.out.printf("O aumento foi de R$ %.2f\n", aumento);
        System.out.printf("O novo salario e R$ %.2f\n", novoSalario);
    }
}
