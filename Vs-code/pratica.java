import java.util.Scanner;

public class pratica {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)){
            // Menu de opções do sistema.
    System.out.println("===== Calculadora =====");
    System.out.println("Se vc deseja multiplicação, coloque N 1");
    System.out.println("Se deseja soma, N 2");
    System.out.println("É se for Divisão, N 3");
    System.out.print("Digite aqui: ");
      String escolha = leitor.next();
    switch (escolha) {

       // Tabela de multiplicação
        case "1":
            System.out.print("Me fale o primeiro valor: ");
            int n1 = leitor.nextInt();
            System.out.print("Agora me fale um segundo valor: ");
            int n2 = leitor.nextInt();
            int n3 = n1 * n2;
            System.out.println("Aqui está o resultado: " + n3);
    break;

        // Tabela de soma
        case "2":
            System.out.print("Me fale um valor inteiro: ");
            int n4 = leitor.nextInt();
            System.out.print("Um segundo valor: ");
            int n5 = leitor.nextInt();
            int n6 = n4 + n5;
            System.out.println("Aqui está o resultado: " + n6);
    break;

        // Tabela de divisão
        case "3":
            System.out.print("Me fale um valor: ");
            double n7 = leitor.nextDouble();
            System.out.print("Me fale um segundo valor: ");
            double n8 = leitor.nextDouble();
            double n9 = n7 / n8;
            System.out.println("Aqui esta o resultado: " + n9);
    break;
        default:
            System.out.println("Opção invalida!!!");
    }
        }
    }
}
