import java.util.Scanner;

public class atv6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = leitor.nextLine();

        System.out.println("Ola, "+nome+", "+sobrenome+"!");
    }
}
