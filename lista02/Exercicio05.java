import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o salario");
        double salario = scan.nextDouble();
        System.out.println("Digite o valor da casa");
        double valorCasa = scan.nextDouble();
        System.out.println("Digite a quantidade de anos");
        int anos = scan.nextInt();

        double prestacao = valorCasa / (anos * 12);

        System.out.println("O valor da prestacao e de R$ " + prestacao);
        if (prestacao > salario * 0.30) {
            System.out.println("Financiamento reprovado");
        } else {
            System.out.println("Financiamento aprovado");
        }
    }
}
