public class Estoque {

    String nome;
    int qtdAtual;
    int qtdMinima;

    Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    Estoque() {

    }

    void repor(int qtd) {
        qtdAtual += qtd;
        // qtdAtual = qtdAtual + qtd;
    }

    void darBaixa(int qtd) {
        qtdAtual -= qtd;
        // qtdAtual = qtdAtual - qtd;
    }

    String descricao() {
        return "Produto: " + nome + "\nQuantidade Atual: " + qtdAtual + "\nQuantidade Minima: " + qtdMinima;
    }

    boolean precisaRepor() {
        return qtdAtual < qtdMinima;
        // if (qtdAtual < qtdMinima){
        // return true;
        // } else {
        // return false;
        // }
    }
}
