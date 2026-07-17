// importando o Scanner.
import java.util.Scanner;

public class Print2 {
    public static void main(String[] args) {
        /* "leitor" e a criação da variavel.
         * 
         * 
         */
        try (Scanner leitor = new Scanner(System.in)) {
    String nome = leitor.nextLine();
    float nota = leitor.nextFloat();
        System.out.printf("A nota de %s é %.2", nome, nota);
        }
    }
}