import java.util.Arrays;
import java.util.Random;

public class ValidadorCPF {
    // /^\d{3}\.\d{3}\.\d{3}\-\d{2}$/
    String cpf;

    public String gerar() {
        Random random = new Random();
        int[] vetorCPF = new int[11];
        for (int i = 0; i < 9; i++) {
            vetorCPF[i] = random.nextInt(10);
        }
        int somaD1 = 0;
        for (int i = 0, j = 10; i < 9; i++, j--) {
            somaD1 += vetorCPF[i] * j;
        }
        int resto1 = 11 - somaD1 % 11;
        int d1 = resto1;
        if (resto1 >= 10) {
            d1 = 0;
        }
        vetorCPF[9] = d1;
        int somaD2 = 0;
        for (int i = 0, j = 11; i < 10; i++, j--) {
            somaD2 += vetorCPF[i] * j;
        }

        int resto2 = 11 - somaD2 % 11;
        int d2 = resto2;
        if (resto2 >= 10) {
            d2 = 0;
        }
        vetorCPF[10] = d2;
        return Arrays.toString(vetorCPF).replaceAll("\\[", "").replaceAll(",", "").replaceAll("\\]", "").replaceAll(" ",
                "");
    }

    // 123.456.768-90 1234567890
    public boolean validarCPF() {
        String cpfSemCarEsp = cpf.replaceAll("\\.", "").replaceAll("-", "");

        if (checharFormato() && eTudoNumero(cpfSemCarEsp)) {
            int[] vetorCPF = stringToArrayNumero(cpfSemCarEsp);
            int somaD1 = 0;
            for (int i = 0, j = 10; i < 9; i++, j--) {
                somaD1 += vetorCPF[i] * j;
            }
            int resto1 = 11 - somaD1 % 11;
            int d1 = resto1;
            if (resto1 >= 10) {
                d1 = 0;
            }
            int somaD2 = 0;
            for (int i = 0, j = 11; i < 10; i++, j--) {
                somaD2 += vetorCPF[i] * j;
            }

            int resto2 = 11 - somaD2 % 11;
            int d2 = resto2;
            if (resto2 >= 10) {
                d2 = 0;
            }

            // if (d1 == vetorCPF[9] && d2 == vetorCPF[10]){
            // return true;
            // } else {
            // return false;
            // }
            return d1 == vetorCPF[9] && d2 == vetorCPF[10];
        } else {
            return false;
        }

    }

    private boolean checharFormato() {
        if (cpf.length() == 14) {
            return (cpf.charAt(3) == '.' && cpf.charAt(7) == '.' && cpf.charAt(11) == '-');
        } else {
            return cpf.length() == 11;
        }
    }

    private boolean eTudoNumero(String n) {
        for (int i = 0; i < n.length(); i++) {
            if (!Character.isDigit(n.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private int[] stringToArrayNumero(String numeros) {
        int[] n = new int[numeros.length()];
        for (int i = 0; i < n.length; i++) {
            n[i] = Integer.parseInt(numeros.charAt(i) + "");
        }
        return n;
    }

    public static void main(String[] args) {
        ValidadorCPF v = new ValidadorCPF();
        v.cpf = "01619265339";
        System.out.println(v.validarCPF());
        v.cpf = "016.192.653-38";
        System.out.println(v.validarCPF());
        v.cpf = "612.926.290-61";
        System.out.println(v.validarCPF());
        v.cpf = "25857787033";
        System.out.println(v.validarCPF());
        System.out.println("CPF Gerado: " + v.gerar());
        v.cpf = v.gerar();
        System.out.println(v.validarCPF());
        String teste = "016.192.653-312";
        System.out.println(teste.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$"));
    }
}