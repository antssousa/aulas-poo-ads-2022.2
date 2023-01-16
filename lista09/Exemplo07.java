public class Exemplo07 {

    public static double div(double x, double y) throws Exception {
        if (y == 0) {
            throw new Exception("Divisao por zero");
        }
        return x / y;
    }

    public static void main(String[] args) {
        div(10, 0);

    }
}
