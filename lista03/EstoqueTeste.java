public class EstoqueTeste {
    public static void main(String[] args) {
        Estoque estoque1 = new Estoque();
        estoque1.nome = "Impressora Jato de Tinta";
        estoque1.qtdAtual = 13;
        estoque1.qtdMinima = 6;
        Estoque estoque2 = new Estoque();
        estoque2.nome = "Monitor LCD 17 polegadas";
        estoque2.qtdAtual = 11;
        estoque2.qtdMinima = 13;
        Estoque estoque3 = new Estoque();
        estoque3.nome = "Mouse Otico";
        estoque3.qtdAtual = 6;
        estoque3.qtdMinima = 2;
        estoque1.darBaixa(5);
        estoque2.repor(7);
        estoque3.darBaixa(3);

        if (estoque1.precisaRepor()) {
            System.out.println("O produto " + estoque1.nome + " precisa ser reposto");
        } else {
            System.out.println("O produto " + estoque1.nome + " nao precisa ser reposto");
        }
        if (estoque2.precisaRepor()) {
            System.out.println("O produto " + estoque2.nome + " precisa ser reposto");
        } else {
            System.out.println("O produto " + estoque2.nome + " nao precisa ser reposto");
        }
        if (estoque3.precisaRepor()) {
            System.out.println("O produto " + estoque3.nome + " precisa ser reposto");
        } else {
            System.out.println("O produto " + estoque3.nome + " nao precisa ser reposto");
        }

        System.out.println(estoque1.descricao());
        System.out.println(estoque2.descricao());
        System.out.println(estoque3.descricao());
    }
}
