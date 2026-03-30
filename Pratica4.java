import java.util.Scanner;

public class Pratica4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este é um programa de cálculos envolvendo círculos.");
        System.out.print("Opções: \n1 - Calcula o perímetro \n2 - Calcula a área \n3 - Calcula o volume");
        System.out.println("\nQual operação você quer fazer? Digite 1, 2 ou 3: ");
        int opcao = teclado.nextInt(); // Guarda a opção escolhida
        System.out.println("Digite o valor do raio: ");
        double raio = teclado.nextDouble(); // Guarda o valor do raio desse círculo

        switch(opcao) {
            case 1:
                double perimetro = 2 * 3.141592 * raio;
                System.out.println("Perímetro do círculo: " + perimetro);
                break;
            
            case 2:
                double area = 3.141592 * Math.pow(raio, 2);
                System.out.println("Área do círculo: " + area);
                break;

            case 3:
                double volume = 4 / 3 * (3.141592 * Math.pow(raio, 3));
                System.out.print("Volume do círculo: " + volume);
                break;

            default:
                System.out.print("Erro. Código de operação inválido.");
        }


        teclado.close();
    }
}
