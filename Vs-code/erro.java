import java.util.Scanner;

public class erro {
    public static void main(String[] args) {
try (Scanner leitor = new Scanner(System.in)) {
    System.out.println("===== Escolhas de valor =====");
    System.out.print("Escolha uma letra de A,B,C,D,E,F,G,H,I é J: ");
String escolha = leitor.next();
    if (escolha.equals("A")) {
        System.out.println("Letra A, Valor 1.");
    }
    else if (escolha.equals("B")) {
        System.out.println("Letra B, Valor 2.");
    }
        else if (escolha.equals("C")) {
            System.out.println("Letra C, Valor 3.");
        }
        else if (escolha.equals("D")) {
            System.out.println("Letra D, Valor 4.");
        }
        else if (escolha.equals("E")) {
            System.out.println("Letra E, Valor 5.");
        }
        else if (escolha.equals("F")) {
            System.out.println("Letra F, Valor 6.");
        }
        else if (escolha.equals("G")) {
            System.out.println("Letra G, Valor 7.");
        }
        else if (escolha.equals("H")) {
            System.out.println("Letra H, Valor 8.");
        }
        else if (escolha.equals("I")) {
            System.out.println("Letra I, Valor 9.");
        }
        else if (escolha.equals("J")) {
            System.out.println("Letra J, Valor 10.");
        }
        else {
            System.out.println("Valor inválido! Escolha uma letra na tabela.");
    }
}
    }
}