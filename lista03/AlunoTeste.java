import java.util.Scanner;

public class AlunoTeste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Aluno aluno = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scan.nextLine();
        System.out.println("Digite a nota da prova 1: ");
        aluno.prova1 = scan.nextDouble();
        System.out.println("Digite a nota da prova 2: ");
        aluno.prova2 = scan.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        aluno.trabalho = scan.nextDouble();
        System.out.printf("O aluno %s ficou com media de %.2f e ele precisa %.2f pontos no exame final", aluno.nome,
                aluno.media(), aluno.exameFinal());
    }
}
