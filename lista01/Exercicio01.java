import java.util.Scanner; // Importe de uma classe

// O nome da classe deve ser igual ao nome do arquivo
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Instanciação do objeto
        int dia, hora, min, seg, total; // Declaração de variável
        System.out.println("Digite a quantidade de dias");
        dia = scan.nextInt(); // int dia = scan.nextInt();
        System.out.println("Digite as horas");
        hora = scan.nextInt();
        System.out.println("Digite os minutos");
        min = scan.nextInt();
        System.out.println("Digite os segundos");
        seg = scan.nextInt();

        total = dia * 24 * 60 * 60 + hora * 60 * 60 + min * 60 + seg;

        System.out.println("O total em segundos e " + total);
    }
}