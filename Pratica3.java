import java.util.Scanner;

public class Pratica3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este é um programa simple que calcula uma equação de segundo grau");
        double a, b, c, delta, primeiroGrau, x1, x2;
        System.out.print("\nDigite o valor de A: ");
        a = teclado.nextDouble(); // Guarda o valor de A
        System.out.print("Digite o valor de B: ");
        b = teclado.nextDouble(); // Guarda o valor de B
        System.out.print("Digite o valor de C: ");
        c = teclado.nextDouble(); // Guarda o valor de C
        primeiroGrau = Math.pow(a, 2) + b + c; // Calcula equação de primeiro grau
        delta = Math.pow(b, 2) - 4 * a * c; // Calcula o delta separadamente da equação de segundo grau
        x1 = (-b + Math.sqrt((b * b) - 4 * a * c)) / (2 * a); // Equação de segundo grau com raíz positiva de delta
        x2 = (-b - Math.sqrt((b * b) - 4 * a * c)) / (2 * a); // Equação de segundo grau com raíz negativa de delta
        
        if (a == 0 && b == 0 && c != 0) { // Verifica se A e B são iguais a zero e se C é diferente de zero
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) { // Verifica se A é igual a zero e se B é diferente de zero
            System.out.println("Essa é uma equação de primeiro grau!");
            System.out.println(primeiroGrau);
        } else if (delta < 0) { // Verifica se o delta é negativo
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) { // Verifica se o delta é igual a zero
            System.out.println("Esta equação possui duas raízes iguais.");
            System.out.println(x1);
            System.out.println(x2);
        } else { // Para caso o delta seja positivo e maior do que zero
            System.out.println("Esta equação possui duas raízes diferentes");
            System.out.println(x1);
            System.out.println(x2);
        }

        teclado.close();
    }
}
