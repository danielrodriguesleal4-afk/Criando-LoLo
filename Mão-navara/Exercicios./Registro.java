import java.util.Scanner;

public class Registro {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // Anúncio 1
    System.out.println("--- Registro. ---");

    // Nome.
    System.out.print("Seu nome: ");
    String nome = leitor.nextLine();

    // Idade.
    System.out.print("Sua idade: ");
    int Ida = leitor.nextInt();

    // Nota.
    System.out.print("Sua nota: ");
    double nota = leitor.nextDouble();

    //Sistema.
    String R = (Ida>=18) ? nome + " Sua nota é: " + nota:"Vc não possui idade suficiente.";

    // Resultado.
    System.out.println(R);

        }
    }
}
