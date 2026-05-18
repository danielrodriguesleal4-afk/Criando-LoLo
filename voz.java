import java.util.Scanner;

public class voz {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
    System.out.println("=========== Cadastro ============");
    System.out.print("Qual é o seu nome? :" );
    String name = leitor.nextLine();
    System.out.println("Boa tarde! " + name + ", Sejá bem vindo.");
    System.out.println("Quantos anos vc tem?");
    String name = leitor.nextLine();
        }
    }
}