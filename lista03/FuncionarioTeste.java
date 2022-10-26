import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Funcionario f1 = new Funcionario("Joao", 20, 3.50);
        Funcionario f2 = new Funcionario("Matheus", 40, 5.50);
        Funcionario f3 = new Funcionario("Lucas", 40, 13.50);
        System.out.printf("O funcionario %s recebe R$ %.2f\n", f1.nome, f1.calcularSalario());
        System.out.printf("O funcionario %s recebe R$ %.2f\n", f2.nome, f2.calcularSalario());
        System.out.printf("O funcionario %s recebe R$ %.2f\n", f3.nome, f3.calcularSalario());

        System.out.println("Digite o nome do funcionario: ");
        String nome = scan.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        double valorHora = scan.nextDouble();
        scan.nextLine();
        Funcionario f4 = new Funcionario(nome, horasTrabalhadas, valorHora);
        System.out.printf("O funcionario %s recebe R$ %.2f\n", f4.nome, f4.calcularSalario());
        Funcionario f5 = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        f5.nome = scan.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        f5.horasTrabalhadas = scan.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        f5.valorHora = scan.nextDouble();
        scan.nextLine();
        System.out.printf("O funcionario %s recebe R$ %.2f\n", f5.nome, f5.calcularSalario());
        Funcionario f6 = new Funcionario();
        System.out.println("Digite o nome do funcionario: ");
        f6.nome = scan.nextLine();
        System.out.println("Digite as horas trabalhadas: ");
        f6.horasTrabalhadas = scan.nextInt();
        System.out.println("Digite o valor da hora trabalhada: ");
        f6.valorHora = scan.nextDouble();

        System.out.printf("O funcionario %s recebe R$ %.2f\n", f6.nome, f6.calcularSalario());
        scan.close();

    }
}
