// Minhas importações.
import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
    // Anúncio 1.
        System.out.println(" ----- Calculadora ----- ");

    // A onde o número desejado será escolhido.
        System.out.print("Digite um número inteiro: ");

    // A criação da variavel do número desejado.
        double P = leitor.nextInt();
   
    // Anúncio 2.
        System.out.println(" ----- Resultados ----- ");

    // Calculos.

    // Resto da Divisão por 2.
        int D = (int) P % 2;

    // Elevado ao Cubo.
        int C = (int) Math.pow(P, 3);

    // Raiz Quadrada.
        double Q = Math.sqrt(P);

    // Raiz Cúbica.
        double Cub = Math.cbrt(P);

    // Valor Absoluto.
        int VA = (int) Math.abs(P);

    // Resultados.
        System.out.println("O resto da divisão por 2: " + D);
        System.out.println("Elevado ao Cubo: " + C);
        System.out.println("Raiz quadrada: " + Q);
        System.out.println("Raiz Cúbica: " + Cub);
        System.out.println("Valor Absoluto: " + VA);
        }
    }
}
