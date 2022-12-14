
public class FornecedorTeste {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor("Miqueias", "Rua Norte", "(86)999996363", 50000, 10000);
        System.out.println(f1);
        System.out.println("O saldo e " + f1.obterSaldo());

        Object f2 = new Fornecedor();
        Pessoa f3 = new Fornecedor();

        Pessoa[] pessoas = new Pessoa[100];
        pessoas[0] = f1;
    }
}
