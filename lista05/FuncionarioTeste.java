
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f = new Funcionario();
        f.setMatricula(1234);
        f.setNome("Vitoria");
        f.setFuncao("Programadora Senior");
        f.setSalario(20000);
        System.out.println("O salario da " + f.getNome() + " e R$ " + f.getSalario());
        System.out.println(f);
    }
}
