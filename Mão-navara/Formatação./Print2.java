// importando o Scanner.
import java.util.Scanner;

public class Print2 {
    public static void main(String[] args) {
        /* "leitor" e a criação da variavel.
         * 
         * 
         */
        try (Scanner leitor = new Scanner(System.in)) {
        System.out.print("O nome do aluno: ");
    String nome = leitor.nextLine();
        System.out.print("A nota do aluno: ");
    float nota = leitor.nextFloat();
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        }
    }
}