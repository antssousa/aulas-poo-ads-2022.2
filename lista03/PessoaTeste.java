public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Antonio Sousa", 37, 1.58, 73);
        System.out.printf("O %s tem imc de %.2f e esta com %s\n", p1.nome, p1.imc(), p1.classificar());
        Pessoa p2 = new Pessoa("Lucas Renu", 22, 1.68, 50);
        System.out.printf("O %s tem imc de %.2f e esta com %s\n", p2.nome, p2.imc(), p2.classificar());
        Pessoa p3 = new Pessoa("Herisson", 18, 1.68, 57);
        System.out.printf("O %s tem imc de %.2f e esta com %s\n", p3.nome, p3.imc(), p3.classificar());

    }

}
