public class Conta {
    private String nome;
    private double saldo;

    private static int totalDeContas;

    public Conta() {
        Conta.totalDeContas++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    @Override
    public String toString() {
        return "Conta [nome=" + nome + ", saldo=" + saldo + "]";
    }

}
