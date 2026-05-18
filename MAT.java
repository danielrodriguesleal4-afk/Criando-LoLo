import java.util.Scanner;

public class MAT {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Escolha o primeiro de 1 a 100: ");
        int n1 = leitor.nextInt();
        System.out.print("Escolha o segundo número de 1 a 100: ");
        int n2 = leitor.nextInt();
        int resultado = n1 + n2;
        System.out.print("Aqui está a soma: " + resultado);
        leitor.close();
    }
}