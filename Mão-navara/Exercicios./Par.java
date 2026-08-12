import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
        
    // --- Par ou Ímpar --- //

    // Anúncio 1
    System.out.println("Descobrirei se o número é ímpar ou par.");
    System.out.print("Digite um número: ");
    int N = leitor.nextInt();

    // Sistema.
    String R = (N % 2 == 0) ? "Par":"Ímpar";

    // Anúncio 2
    System.out.println("Esse número é " + R);

        }
    }
}