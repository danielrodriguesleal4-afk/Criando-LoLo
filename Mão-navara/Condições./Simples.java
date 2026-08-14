import java.util.Scanner;

public class Simples {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // Inicio.

    // Anuncio 1
    System.out.println("Media de notas.");

    // Nota 1
    System.out.print("Digite sua nota da materia 1: ");
    int N1 = leitor.nextInt();

    // Nota 2
    System.out.print("Digite sua nota da materia 2: ");
    int N2 = leitor.nextInt();

    // Calculo
    double R = (N1+N2)/2;

    // Anuncio 2
    System.out.println("Sua média é: " + R);

    // Condição = "Se"
    if (R>=9) {
        System.out.println("Parábens.");
    }
    
        }
    }
}
