public class Exemplo01 {
    public static void main(String[] args) {
        String s = "Curso Java";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        System.out.println(s.charAt(2));
        System.out.println(s.length());
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 5));
        String[] as = "poo usando java".split(" ");
        System.out.println(as[0] + "-" + as[1] + "-" + as[2]);
        System.out.println("a".compareTo("b"));
        System.out.println("-" + " a ".trim() + "-");
    }
}