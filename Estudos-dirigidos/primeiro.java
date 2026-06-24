import java.util.Scanner;

public class primeiro{
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
    System.out.println("====== MAT adição ======");
    System.out.print("Escolha um número de 1 a 100: ");
    int n1 = leitor.nextInt();
    System.out.print("Escolha o segundo número de 1 a 100: ");
    int n2 = leitor.nextInt();
    int resultado = n1 + n2;
    System.out.println("Aqui está o resultado: " + resultado);
    System.out.println("===== MAT subtração =====");
    System.out.print("Escolha um número maior que 50: ");
    int n3 = leitor.nextInt();
    System.out.print("Escolha um segundo número menor que 50: ");
    int n4 = leitor.nextInt();
    int resultado2 = n3 - n4;
    System.out.println("Aqui está o resultado: " + resultado2 );
    System.out.println("===== MAT multiplicação =====");
    System.out.print("Escolha um número: ");
    double n5 = leitor.nextDouble();
    System.out.print("Escolha um segundo número: ");
    double n6 = leitor.nextDouble();
    double resultado3 = n5 * n6;
    System.out.println("Aqui está o resultado: " + resultado3);
    System.out.println("===== MAT Divisão =====");
    System.out.print("Escolha um número: ");
    double n7 = leitor.nextDouble();
    System.out.print("Escolha um segundo número: ");
    double n8 = leitor.nextDouble();
    double resultado4 = n7 / n8;
    System.out.println("Aqui está o resultado: " + resultado4 );
    System.out.println("===== Finalizado =====");
        }
    }
}