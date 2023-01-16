public class Exemplo06 {
    public static void main(String[] args) {
        int x = 10, y = 5;

        try {
            System.out.println("Inicio do try");
            System.out.println(x / y);
            int n = Integer.parseInt("15");
            System.out.println("Fim do try");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println(e.getCause());
            // System.out.println(e.getMessage());
        } finally {
            System.out.println("Sempre e executado");
        }
        System.out.println("Fim do main");
    }

}
