import java.util.Scanner;

public class MAT {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
        System.out.print("Escolha um número maior que 50: ");
        int n1 = leitor.nextInt();
        System.out.print("Escolha um segundo número menor que 50: ");
        int n2 = leitor.nextInt();
        int resultado = n1 - n2;
        System.out.println("Aqui está a subtração: " + resultado);
        }
    }
}