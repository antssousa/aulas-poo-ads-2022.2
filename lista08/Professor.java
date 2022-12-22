public class Professor extends Pessoa {
    private String formacao;
    private String area;
    private String anoAdmissao;
    private int qtdHoras;

    public Professor() {
    }

    public Professor(String nome, String cpf, String dataNascimento, String telefone, String formacao, String area,
            String anoAdmissao, int qtdHoras) {
        super(nome, cpf, dataNascimento, telefone);
        this.formacao = formacao;
        this.area = area;
        this.anoAdmissao = anoAdmissao;
        this.qtdHoras = qtdHoras;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAnoAdmissao() {
        return anoAdmissao;
    }

    public void setAnoAdmissao(String anoAdmissao) {
        this.anoAdmissao = anoAdmissao;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    @Override
    public String toString() {
        return super.toString() + " Professor [formacao=" + formacao + ", area=" + area + ", anoAdmissao=" + anoAdmissao
                + ", qtdHoras="
                + qtdHoras + "]";
    }

}
