import java.util.Scanner;

public class voz {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {
    System.out.println("=========== MAT 2V ============");
    System.out.print("Qual o seu nome?:" );
    String name = leitor.nextLine();
    System.out.println("Boa tarde! " + name + ", Sejá bem vindo.");
    System.out.println("Vamos comprar laranjas em uma feira: ");
    System.out.print("Quantas laranjas vc deseja comprar?: " );
    int n1 = leitor.nextInt();
    System.out.println("Está tendo uma promoção nas maçãs também.");
    System.out.println("Quantas maçãs deseja comprar?: ");
    int n2 = leitor.nextInt();
    System.out.println("Ó valor pago será a quantidades de maçãs multiplicadas pelo dos da laranja: ");
    int resultado = n1 * n2;
    System.out.println("Ó resultado será: " + resultado );
        }
    }
}