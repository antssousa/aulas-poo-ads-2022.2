
public class Funcionario {
    private int matricula;
    private String nome;
    private String funcao;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(int matricula, String nome, String funcao, double salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String toString() {
        return "Matricula: " + matricula + "\nNome: " + nome + "\nFuncao: " + funcao + "\nSalario: R$ " + salario;
    }

}
