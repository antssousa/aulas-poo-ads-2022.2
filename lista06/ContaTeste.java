import java.util.Scanner;

public class ContaTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();
        Conta c4 = new Conta();
        Conta c5 = new Conta();
        Conta c6 = new Conta();
        Conta c7 = new Conta();

        Conta c8 = new Conta();
        System.out.println("Digite o nome do titular da conta");
        c8.setNome(scan.nextLine());
        System.out.println("Digite o saldo da conta");
        c8.setSaldo(scan.nextDouble());

        System.out.println(c8);
        System.out.println("Foram instanciadas " + Conta.getTotalDeContas() + " contas");
    }

}
