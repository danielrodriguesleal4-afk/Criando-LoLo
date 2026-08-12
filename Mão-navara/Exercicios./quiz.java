import java.util.Scanner;

public class quiz {
    public static void main(String[] args) {

    // --- leitor. --- //
    try (Scanner leitor = new Scanner(System.in)) {

    System.out.println("Tente advinhar o número que estou pensando de 1 a 5.");
    System.out.print("Digite o número: ");
    int N = leitor.nextInt();

    double A = Math.random();
    int X = (int) (1 + A * (6 - 1));

    String R = (N==X) ? "Arcertou":"Errou, estava pensando em " + X;

    System.out.println(R);

        }
    }
}
