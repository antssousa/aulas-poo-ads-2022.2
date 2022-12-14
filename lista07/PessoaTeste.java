
public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa("Breno", "Rua A", "(86)9999-9090");
        System.out.println(p1); // p1.toString()
        System.out.println(p2); // p2.toString()
    }
}
