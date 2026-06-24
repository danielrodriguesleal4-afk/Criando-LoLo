import java.util.Scanner;

public class programa{
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
    System.out.println("=== Um determinado grupo de pessoas foram ao restaurante ===");
    System.out.println("=== Esse foi o valor da conta...... ===");
    System.out.print("Escolha um número aléatorio: ");
    double n1 = leitor.nextDouble();
    System.out.println("A conta será dividida igualmente para cada um: ");
    System.out.print("Quantas pessoas foram ao restaurante?: ");
    double n2 = leitor.nextDouble();
    double resultado = n1 / n2;
    System.out.println("Aqui está o valor pago por cada um: " + resultado );
        }
    }
}