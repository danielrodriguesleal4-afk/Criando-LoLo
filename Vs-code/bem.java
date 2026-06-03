import java.util.Scanner;

public class bem {
    static public void main(String[] args) {
try (Scanner leitor =new Scanner(System.in)) {
    System.out.println("===== Nota da prova. =====");
    System.out.print("Qual foi a sua nota?: ");
        String escolha = leitor.next();
    if (escolha.equalsIgnoreCase("a")) {
        System.out.println("Vc foi exelente. Parabéns");
    }
    else if (escolha.equalsIgnoreCase("b")) {
        System.out.println("Ótimo!. Continue melhorando.");
    }
    else if (escolha.equalsIgnoreCase("c")) {
        System.out.println("Bom. Bom desempenho.");
    }
    else if (escolha.equalsIgnoreCase("d")) {
        System.out.println("Regular. Vc precisa melhorar.");
    }
    else if (escolha.equalsIgnoreCase("e")) {
        System.out.println("Suficiente. Aprovado, mas precisa melhorar.");
    }
    else if (escolha.equalsIgnoreCase("f")) {
        System.out.println("Insuficiente. Estude mais.");
    }
    else if(escolha.equalsIgnoreCase("g") || escolha.equalsIgnoreCase("j")) {
        System.out.println("Crítico. Atenção!!! Vc precisa de ajuda.");
    }
    else {
        System.out.println("Opção inválida. Por favor, escolha uma letra de A a J.");
    }
}
    }
}