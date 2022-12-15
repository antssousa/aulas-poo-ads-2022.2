public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario() {
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
            double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return super.toString() + "\nvalorProducao=" + valorProducao + "\ncomissao=" + comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + valorProducao * comissao / 100;
    }

}
