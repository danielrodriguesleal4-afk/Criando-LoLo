import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {

    // Leitor da entrada.
    try (Scanner leitor = new Scanner(System.in)) {

    // --- Anuncio 1. --- //   

    // Começo.
    System.out.println(" --- Equação de Segundo grau. --- "); 
    System.out.println(" --- ( Ax² + Bx + C = 0 ) --- ");
    System.out.println("Subistitua o valor de A,B é C.");

    // Variaveis das escolha:

    // Variavel A;
    System.out.print("Valor de A: ");
    int A = leitor.nextInt();

    // Variavel B;
    System.out.print("Valor de B: ");
    int B = leitor.nextInt();

    // Variavel C;
    System.out.print("Valor de C: ");
    int C = leitor.nextInt();

    // --- Anuncio 2. --- //

    // Montando equação.
    System.out.println(" --- Calculo de Delta. --- ");
    System.out.println("\u0394" + " = " + "(" + B + "²) " + "-4" + " . " + A + " . " + C);

    // --- Equação. --- //

    // Valor de Delta.
    double D = Math.pow(B,2) - 4 * A * C;

    // --- Anuncio 3. --- //

    // Resultado final:
    System.out.println(" --- Resultado. --- ");
    // Resultado de Delta.
    System.out.println("O valor de " + "\u0394" + " : " + D);

    // Raiz real ou não.
    if (D<0) {
        System.out.println("Não existe raiz real.");
    } 
    else {
        System.out.println("Existe raiz real.");
    }
        }
    }
}
