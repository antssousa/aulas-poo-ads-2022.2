public class Exemplo01 {
    static int x = 10, y = 0;

    public static void main(String[] args) {
        // Exceções
        System.out.println("Antes");
        metodo1();
        System.out.println("Depois");
    }

    private static void metodo1() {
        System.out.println("Começo do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    private static void metodo2() {
        System.out.println("Inicio do método 2");
        System.out.println(x / y);
        System.out.println("Fim do método 2");

    }
}
