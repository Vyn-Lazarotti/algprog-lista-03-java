import java.util.Scanner;

public class Pratica5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este é um programa que simula uma calculadora de números reais");
        System.out.println("Opções: \n1 - Adição\n2 -Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Potenciação");
        System.out.println("Escolha sua opção: ");
        int operador = teclado.nextInt();
        double numberOne, numberTwo, conta;

        switch (operador) {
            case 1:
                System.out.println("Adição selecionada!");
                System.out.println("Digite o primeiro número: ");
                numberOne = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                numberTwo = teclado.nextDouble();
                conta = numberOne + numberTwo;
                System.out.println("Resultado: " + conta);
            
            case 2:
                System.out.println("Subtração selecionada!");
                System.out.println("Digite o primeiro número: ");
                numberOne = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                numberTwo = teclado.nextDouble();
                conta = numberOne - numberTwo;
                System.out.println("Resultado: " + conta);

            case 3:
                System.out.println("Multiplicação selecionada!");
                System.out.println("Digite o primeiro número: ");
                numberOne = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                numberTwo = teclado.nextDouble();
                conta = numberOne * numberTwo;
                System.out.println("Resultado: " + conta);

            case 4:
                System.out.println("Divisão selecionada!");
                System.out.println("Digite o primeiro número: ");
                numberOne = teclado.nextDouble();
                System.out.println("Digite o segundo número: ");
                numberTwo = teclado.nextDouble();
                conta = numberOne / numberTwo;
                System.out.println("Resultado: " + conta);

            case 5:
                System.out.println("Potenciação selecionada!");
                System.out.println("Digite o número: ");
                numberOne = teclado.nextDouble();
                double potencia = Math.pow(numberOne, 2);
                System.out.println("Resultado: " + potencia);

            default:
                System.out.println("Opção inválida!");
        }

        teclado.close();
    }
}
