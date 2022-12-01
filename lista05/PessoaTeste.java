public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        // Não é possível por conta que o atributo nome é privado
        // p.nome = "Antonio";
        // System.out.println("O nome e " + p.nome);
        p.setNome("Ant-onio");
        p.setSobrenome("Goiabeira");
        System.out.println("O nome e " + p.getNome());
        System.out.println(p);
    }
}
