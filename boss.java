import java.util.Scanner;

public class boss {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
    System.out.println("=========== Cadastro ============");
    System.out.print("Qual é o seu nome? :" );
    String name = leitor.nextLine();
    System.out.println("Boa tarde! " + name + ", Sejá bem vindo.");
    System.out.println("Quantos anos vc tem?");
    int n1 = leitor.nextInt();
    System.out.println("Qual é a sua altura?");
    double n2 = leitor.nextDouble();
    System.out.println("=========== Cadastro finalizado =========");
    System.out.println("=========== Informações do Cadastro =======");
    System.out.println("Seu nome é: " + name + ".");
    System.out.println("Vc tem:" + n1 + " anos.");
    System.out.println("É sua altura é:" + ".");
        }
    }
}