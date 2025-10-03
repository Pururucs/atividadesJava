import java.util.Scanner;

public class atv7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = leitor.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double numero2 = leitor.nextDouble();

        System.out.println("--- Resultados ---");
        System.out.println("Soma: " + (numero1+numero2));
        System.out.println("Subtração: " + (numero1 - numero2));
        System.out.println("Multiplicação" + (numero1 * numero2));
        System.out.println("Divisão: " + (numero1 / numero2));
        System.out.println("Resto: " + (numero1 % numero2));

        leitor.close();
    }
}
