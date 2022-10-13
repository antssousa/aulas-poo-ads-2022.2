import java.util.Scanner;

/*Escreva uma função que recebes 3 valores reais X, Y e Z e que verifique se esses
valores podem ser os comprimentos dos lados de um triângulo e, neste caso, retornar
qual o tipo de triângulo formado. Para que X, Y e Z formem um triângulo é necessário
que a seguinte propriedade seja satisfeita: o comprimento de cada lado de um triângulo
é menor do que a soma do comprimento dos outros dois lados. A função deve
identificar o tipo de triângulo formado observando as seguintes definições:
o Triângulo Equilátero: os comprimentos dos 3 lados são iguais.
o Triângulo Isósceles: os comprimentos de 2 lados são iguais.
o Triângulo Escaleno: os comprimentos dos 3 lados são diferentes. */
public class Questao07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Digite o primeiro lado do triangulo");
        a = scan.nextInt();
        System.out.println("Digite o segundo lado do triangulo");
        b = scan.nextInt();
        System.out.println("Digite o terceiro lado do triangulo");
        c = scan.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if (a == b && b == c) {
                System.out.println("Triangulo equilatero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Triangulo isosceles");
            } else {
                System.out.println("Triangulo escaleno");
            }
        } else {
            System.out.println("Os valores nao formam um triangulo");
        }
    }
}
