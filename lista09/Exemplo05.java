public class Exemplo05 {
    public static void main(String[] args) {
        int x = 10, y = 0;

        try {
            System.out.println("Inicio do try");
            System.out.println(x / y);
            int n = Integer.parseInt("15b");
            System.out.println("Fim do try");
        } catch (ArithmeticException e) {
            System.out.println("Divisao por zero");
        } catch (NumberFormatException e) {
            System.out.println("Erro no formato do numero");
        }
        System.out.println("Fim do main");
    }
}
