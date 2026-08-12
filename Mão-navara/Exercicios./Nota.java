import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // --- Sistema de Nota no térnario. --- //

    // Anúncio 1
    System.out.println("--- Sistema de nota. ---");
    System.out.print("Digite sua nota: ");
    double Nota = leitor.nextDouble();
    
    // Sistema.
    String R = (Nota >= 9) ? "Excelente":
               (Nota >= 7) ? "Bom":
               (Nota >= 5) ? "Regular":
                             "Ruim";

    // Anúncio 2
    System.out.println("Seu resultado é: " + R);
        }
    }
}
