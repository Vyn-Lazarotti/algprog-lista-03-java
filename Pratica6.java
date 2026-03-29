import java.util.Scanner;

public class Pratica6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este é um programa que lê define o maior dentre 2 números inteiros e realiza o sorteio de um número aleatório que pode ser par ou ímpar.");
        
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = teclado.nextInt(); // Guarda o primeiro número digitado
        System.out.println("Digite o segundo número: ");
        int segundoNumero = teclado.nextInt(); // Guarda o segundo número digitado
        
        if (primeiroNumero > segundoNumero) { // Verifica se o primeiro número é maior do que o segundo número digitado
          System.out.println(primeiroNumero + " é maior do que " + segundoNumero);
        } else { // Para caso o segundo número seja maior do que o primeiro número digitado
          System.out.println(segundoNumero + " é maior do que " + primeiroNumero);
        }
        
        System.out.println("Hora do sorteio!");
        int randomInt = (int)(Math.random() * 101); // Gera um número aleatório entre 0 e 100
        System.out.println("Número sorteado: " + randomInt); // Mostra qual foi o número gerado
        if (randomInt % 2 == 0) { // Verifica se o número é par ou ímpar
              System.out.println(randomInt + " é par");
            } else {
              System.out.println(randomInt + " é ímpar");
        }
        
        teclado.close();
    }
}
