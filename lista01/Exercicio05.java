import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        int hora = scan.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        double valor = scan.nextDouble();
        double salario = hora * valor;
        System.out.printf("O salário do funcionário é: R$ %.2f", salario);
        scan.close();
    }
}
