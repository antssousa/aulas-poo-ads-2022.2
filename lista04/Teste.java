import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        Random random = new Random();
        String s1 = "ABCDEFGHI";
        String s2 = "123456789";

        int corte = random.nextInt(s1.length() - 1);
        System.out.println("corte = " + corte);
        String s3 = s1.substring(0, corte);
        String s4 = s2.substring(corte);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

        String s5 = s1.substring(0, corte) + s2.substring(corte);
        String s6 = s2.substring(0, corte) + s1.substring(corte);
        System.out.println("s5 = " + s5);
        System.out.println("s6 = " + s6);

    }
}
