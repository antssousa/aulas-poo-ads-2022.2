import java.util.Scanner;

import javafx.css.SimpleStyleableDoubleProperty;

/*Faça um programa que deve ser informado o preço do litro do combustível e o valor em
dinheiro que se deseja abastecer. O programa mostra quantos litros serão comprados.*/

public class Questao06 {
    public static void main(String[] args) {
        // System.out.printf("R$ %10.2f\n", 5.1123456789);
        // System.out.printf("| %06d\n", 1);
        // System.out.printf("| %06d\n", 12);
        // System.out.printf("| %06d\n", 123);
        // System.out.printf("| %06d\n", 1234);
        // System.out.printf("| %06d\n", 12345);
        // System.out.printf("| %06d\n", 1234567);
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o preço do litro do combustivel: ");
        double precoComb = scan.nextDouble();
        System.out.println("Digite o valor em dinheiro que deseja abastecer: ");
        double valorAbast = scan.nextDouble();
        double litrosComb = valorAbast / precoComb;
        System.out.printf("Voce ira comprar %.2f litros de combustivel", litrosComb);
    }
}
