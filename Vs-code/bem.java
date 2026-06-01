import java.util.Scanner;

public class bem {
    static public void main(String[] args) {
try (Scanner leitor =new Scanner(System.in)) {
    System.out.println("===== Nota da prova. =====");
    System.out.print("Qual foi a sua nota?: ");
        String escolha = leitor.next();
    if (escolha.equalsIgnoreCase("a")) {
        System.out.println("");
        System.out.println("Vc foi exelente. Parabéns");
    }
    else if (escolha.equalsIgnoreCase("b")) {
        System.out.println("Vc foi bem. Continue melhorando.");
    }
    else if (escolha.equalsIgnoreCase("c")) {
        System.out.println("Hummmm... Preocupante.");
    }
        }
    }
}
