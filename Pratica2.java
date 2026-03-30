import java.util.Scanner;

public class Pratica2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este é um programa que simula uma máquina automatizada de venda de lanchinhos");
        int troco, valorCompra, pagamento, nota50, nota20, nota10, nota5, nota2, moeda1;

        System.out.println("Bem-vindo ao Gavv Snack! :D");
        System.out.println("Esta máquina aceita apenas notas de R$ 50,00, R$ 20,00, R$ 10,00, R$ 5,00, R$ 2,00 e R$ 1,00.");
        System.out.println("Produtos escolhidos!");
        System.out.print("\n Valor total da compra: R$ ");
        valorCompra = teclado.nextInt();
        System.out.println("Insira as notas");
        System.out.print("Nota de 50: ");
        nota50 = teclado.nextInt();
        System.out.print("Nota de 20: ");
        nota20 = teclado.nextInt();
        System.out.print("Nota de 10: ");
        nota10 = teclado.nextInt();
        System.out.print("Nota de 5: ");
        nota5 = teclado.nextInt();
        System.out.print("Nota de 2: ");
        nota2 = teclado.nextInt();
        System.out.print("Moeda de 1: ");
        moeda1 = teclado.nextInt();

        pagamento = (nota50 * 50) + (nota20 * 20) + (nota10 * 10) + (nota5 * 5) + (nota2 * 2) + (moeda1 * 1);

        troco = pagamento - valorCompra;

        System.out.println("Troco: R$ " + troco);
        System.out.println("Agradecemos a preferência! :D");

        teclado.close();
    }
}
