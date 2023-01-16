public class App {
    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        c1.depositar(1000);
        ContaEspecial c2 = new ContaEspecial();
        c2.depositar(2000);
        c2.setLimite(1000);
        try {
            c1.sacar(-1500);
            c2.sacar(-1500);
        } catch (ContaException ex) {
            System.out.println("Erro");
        }

        System.out.println(c1.sacar(4000));
    }
}
