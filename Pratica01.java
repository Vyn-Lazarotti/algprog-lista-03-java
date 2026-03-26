import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este é um programa que lê 3 números inteiros a partir do teclado e apresenta o maior número, o menor número e a média aritmética entre eles");
        int numero1, numero2, numero3, media = (numero1 + numero2 + numero3) / 3;

        System.out.println("Digite o primeiro número inteiro: ");
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        numero2 = teclado.nextInt();
        System.out.println("Digite terceiro número inteiro: ");
        numero3 = teclado.nextInt();

        //Os códigos a seguir comparam os 3 números e decidem qual o maior e o menor dentre eles
        if (numero1 > numero2 && numero1 > numero3){
            if (numero2 > numero3){
                System.out.println("O maior número é " + numero1 + " e o menor número é" + numero3);
            }else {
                System.out.println("O maior número é " + numero1 + " e o menor número é " + numero2);
            }
        }

        if (numero2 > numero1 && numero2 > numero3){
            if (numero1 > numero3){
                System.out.println("O maior número é " + numero2 + " e o menor número é" + numero3);
            }else {
                System.out.println("O maior número é " + numero2 + " e o menor número é " + numero1);
            }
        }

        if (numero3 > numero1 && numero3 > numero2){
            if (numero1 > numero2){
                System.out.println("O maior número é " + numero3 + " e o menor número é" + numero1);
            }else {
                System.out.println("O maior número é " + numero3 + " e o menor número é " + numero2);
            }
        }

        System.out.println("A média entre os três números é " + media); //Esse código imprime na tela qual a média
        
        teclado.close();
    }
}
