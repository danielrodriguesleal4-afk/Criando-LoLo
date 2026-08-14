import java.util.Scanner;

public class Composta {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // --- Data de nacimento --- //

    // Anuncio 1.
    System.out.print("Me fale o ano em que vc nasceu: ");
    int data = leitor.nextInt();

    // Sistema

    // Calculo.
    int I = 2026 - data;

    // Estrutura.
    if (I>=18) {
        System.out.println("Maior de idade.");
    }
    else {
        System.out.println("Menor de idade.");
    }
        }
    }
}
