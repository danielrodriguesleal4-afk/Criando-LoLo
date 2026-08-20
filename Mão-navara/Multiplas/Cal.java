import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // Escolhas.
    System.out.println(" --- Calculadora personalizada. --- ");
    System.out.println("Digite 1 para soma.");
    System.out.println("Digite 2 para subtração.");
    System.out.println("Digite 3 para mutiplicação.");
    System.out.println("Digite 4 para divição.");

    // Resultado da escolha.
    System.out.print("Digite aqui o número escolhido: ");
    int Esc = leitor.nextInt();

    switch (Esc) {

        case 1: // --- Soma. --- // 

            System.out.println(" --- Soma escolhida. --- ");
            System.out.print("Digite o primeiro valor: ");
            int so1 = leitor.nextInt();
            System.out.print("Digite o segundo valor: ");
            int so2 = leitor.nextInt();
            int R1 = so1 + so2;
            System.out.println(" --- Resultado. --- ");
            System.out.println("A soma deu: " + R1);

        case 2: // --- Subtração. --- // 

            System.err.println(" --- Subtração. --- ");

        case 3: // --- Multiplicação. --- //

            System.out.println(" --- Multiplicação. --- ");

        case 4: // --- Divição. --- //

            System.out.println(" --- Divição. --- ");
    }

        }
    }
}
