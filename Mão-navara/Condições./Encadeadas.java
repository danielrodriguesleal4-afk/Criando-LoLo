import java.util.Scanner;

public class Encadeadas {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // --- Anuncio 1. --- //

    // Pergunta C.R
    System.out.print("Em que ano vc nasceu? ");
    int data = leitor.nextInt();

    // Calculo de idade.
    int idade = 2026 - data;

    // Condição de "Se" começo.
    if (idade<16) {
        System.out.println("Não pode votar.");
    }
    // Condição "Se não" na criação de variação.
    else {
        // Condição "Se" em variação.
        if ((idade>=16 && idade<=18) || (idade>70)) {
            System.out.println("Voto opicional.");
        }
        // Condição de "Se não" em variação.
        else {
            System.out.println("Voto obrigatório.");
        }
    }
        }
    }
}
