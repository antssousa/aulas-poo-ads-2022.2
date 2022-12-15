import java.util.ArrayList;
import java.util.Scanner;

public class PessoaTeste {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        Scanner scan = new Scanner(System.in);
        for (;;) {
            System.out.println("Menu");
            System.out.println("1 - Cadastrar Pessoa");
            System.out.println("2 - Cadastrar Empregado");
            System.out.println("3 - Cadastrar Operario");
            // System.out.println("4 - Cadastrar Vendedor");
            // System.out.println("5 - Cadastrar Administrador");
            System.out.println("6 - Listar");

            System.out.println("0 - Sair");
            System.out.print("Digite sua opcao> ");
            int op = scan.nextInt();

            switch (op) {
                case 0:
                    System.out.println("Sainnnnnddddooooo ....");
                    System.exit(0);
                    break;
                case 1:
                    scan.nextLine();
                    System.out.println("Cadastrando Pessoa");
                    System.out.println("Digite o nome da pessoa");
                    String nome = scan.nextLine();
                    System.out.println("Digite o endereco da pessoa");
                    String endereco = scan.nextLine();
                    System.out.println("Digite o telefone da pessoa");
                    String telefone = scan.nextLine();
                    Pessoa p = new Pessoa(nome, endereco, telefone);
                    pessoas.add(p);
                    break;
                case 2:
                    scan.nextLine();

                    System.out.println("Cadastrando Empregado");
                    System.out.println("Digite o nome da empregado");
                    nome = scan.nextLine();
                    System.out.println("Digite o endereco da empregado");
                    endereco = scan.nextLine();
                    System.out.println("Digite o telefone da empregado");
                    telefone = scan.nextLine();
                    System.out.println("Digite o codigo do setor da empregado");
                    int codigoSetor = scan.nextInt();
                    System.out.println("Digite o salario base da empregado");
                    double salarioBase = scan.nextDouble();
                    System.out.println("Digite o imposto da empregado");
                    double imposto = scan.nextDouble();
                    Empregado e = new Empregado(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
                    pessoas.add(e);
                    break;
                case 3:

                    break;
                case 6:
                    for (Pessoa pessoa : pessoas) {
                        System.out.println(pessoa);
                        if (pessoa instanceof Empregado) {
                            Empregado empregado = (Empregado) pessoa;
                            System.out.printf("O salario e %.2f\n", empregado.calcularSalario());
                        }
                        System.out.println("---------------------------------");
                    }
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

    }
}
