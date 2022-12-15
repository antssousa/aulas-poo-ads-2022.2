public class Vendedor extends Empregado {
    private double valorVenda;
    private double comissao;

    public Vendedor() {
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
            double valorVenda, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVenda = valorVenda;
        this.comissao = comissao;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvalorVenda=" + valorVenda + "\ncomissao=" + comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorVenda * comissao / 100;
    }
}
