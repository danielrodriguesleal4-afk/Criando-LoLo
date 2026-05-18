import java.util.Scanner;

public class voz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
    System.out.print("Qual é o seu nome? :" );
    String name = leitor.nextLine();
    System.out.println("Seja bem vindo " + name );
        leitor.close();
    }
}