
public class Veiculo {
    private String modelo;
    private String cor;
    private String tipo;
    private int ano;

    public Veiculo() {
    }

    public Veiculo(String modelo, String cor, String tipo, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + "\ncor: " + cor + "\ntipo: " + tipo + "\nano: " + ano;
    }

}
