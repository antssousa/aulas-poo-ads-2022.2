import java.util.Scanner;

public class VeiculoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Veiculo v = new Veiculo();
        System.out.println("Digite o modelo do carro");
        v.setModelo(scan.nextLine());
        System.out.println("Digite a cor do carro");
        v.setCor(scan.nextLine());
        System.out.println("Digite o tipo do carro");
        v.setTipo(scan.nextLine());
        System.out.println("Digite o ano do carro");
        v.setAno(scan.nextInt());
        System.out.println(v);
    }
}
