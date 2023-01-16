package ifpi.poo;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class Main {
    public static void main(String[] args) {
        AlunoDAO dao = new AlunoDAO();
        Scanner scan = new Scanner(System.in);
        Aluno aluno;
        Long id;
        String nome;
        String curso;
        double media;
        List<Aluno> alunos;

        for (;;) {
            System.out.println("1 - inserir aluno");
            System.out.println("2 - procurar aluno por id");
            System.out.println("3 - listar todos os alunos");
            System.out.println("4 - listar alunos por nome");
            System.out.println("5 - atualizar dados do aluno");
            System.out.println("6 - apagar um aluno");
            System.out.println("0 - sair");
            System.out.print("E ai, qual e? >");
            switch (scan.nextInt()) {
                case 0:
                    System.out.println("Sainnnnndddddooooooo.......");
                    System.exit(0);
                    break;
                case 1:
                    scan.nextLine();
                    System.out.println("Digite o nome do aluno");
                    nome = scan.nextLine();
                    System.out.println("Digite o curso do aluno");
                    curso = scan.nextLine();
                    System.out.println("Digite a media do aluno");
                    media = scan.nextDouble();
                    aluno = new Aluno(nome, curso, media);
                    if (dao.insert(aluno)) {
                        System.out.println("O aluno " + nome + " foi inserido com sucesso");
                    } else {
                        System.out.println("Nao conseguimos inserir o aluno " + nome);
                    }

                    break;
                case 2:
                    System.out.println("Digite o id do aluno que deseja procurar");
                    id = scan.nextLong();
                    aluno = dao.selectById(id);
                    if (aluno != null) {
                        System.out.println("Aluno encontrado");
                        System.out.println(aluno);
                    } else {
                        System.out.println("Aluno com id " + id + " nao foi encontrado");
                    }

                    break;
                case 3:
                    System.out.println("Listando todos os alunos");
                    alunos = dao.selectAll();
                    if (alunos.isEmpty()) {
                        System.out.println("Nao existe alunos cadastrados");
                    } else {
                        for (Aluno a : alunos) {
                            System.out.println("----------------------------");
                            System.out.println(a);
                        }
                    }
                    System.out.println("----------------------------");

                    break;
                case 4:
                    scan.nextLine();
                    System.out.println("Digite o nome dos alunos que deseja procurar");
                    nome = scan.nextLine();
                    alunos = dao.selectByName(nome);
                    if (alunos.isEmpty()) {
                        System.out.println("Nao existem alunos com o nome " + nome);
                    } else {
                        System.out.println("Listando os alunos com o nome " + nome);
                        for (Aluno a : alunos) {
                            System.out.println("------------------------");
                            System.out.println(a);
                        }
                    }

                    break;
                case 5:
                    System.out.println("Digite o id do aluno que deseja atualizar os dados");
                    id = scan.nextLong();
                    scan.nextLine();
                    aluno = dao.selectById(id);
                    if (aluno != null) {
                        System.out.println("Digite o novo nome do aluno");
                        aluno.setNome(scan.nextLine());
                        System.out.println("Digite o novo curso  do aluno");
                        aluno.setCurso(scan.nextLine());
                        System.out.println("Digite a nova media do aluno");
                        aluno.setMedia(scan.nextDouble());
                        if (dao.update(aluno)) {
                            System.out.println("O aluno " + aluno.getNome() + " foi atualizado");
                        } else {
                            System.out.println("Nao foi possivel atualizar os dados do aluno");
                        }

                    } else {
                        System.out.println("O aluno do id " + id + " nao existe");
                    }
                    break;
                case 6:
                    System.out.println("Digite o id do aluno que deseja apagar");
                    id = scan.nextLong();
                    aluno = dao.selectById(id);
                    if (aluno != null) {
                        System.out.println("Deseja remover o aluno " + aluno.getNome() + " s - sim ou n - nao");
                        String opcao = scan.next().toLowerCase();
                        if (opcao.equals("s")) {
                            if (dao.delete(aluno)) {
                                System.out.println("Aluno removido");
                            } else {
                                System.out.println("Nao foi possivel remover o aluno");
                            }
                        }
                    } else {
                        System.out.println("Aluno com id " + id + " nao foi encontrado");
                    }
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        }

    }
}
