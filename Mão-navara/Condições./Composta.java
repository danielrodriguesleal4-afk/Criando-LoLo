import java.util.Scanner;

public class Composta {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // --- Data de nacimento --- //

    // Anuncio 1.
    System.out.print("Me fale o ano em que vc nasceu: ");
    int data = leitor.nextInt();

    // Sistema

    // Calculo 1.
    int I = 2026 - data;

    // Estrutura 1.
    if (I>=18) {
        System.out.println("Maior de idade.");
    }
    else {
        System.out.println("Menor de idade.");
    }

    // --- Ímpar ou Par --- //

    // Anúncio 2.
    System.out.print
    ("Digite um número e saberei se ele e par ou ímpar: ");
    int num = leitor.nextInt();

    // Sistema

    // Calculos 2.
    int R = num%2;

    // Estrutura 2.
    if (R==0) {
        System.out.println("Número par.");
    }
    else {
        System.out.println("Número Ímpar.");
    }
        }
    }
}
