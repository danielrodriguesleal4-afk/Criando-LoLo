import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        // --- Sistema de idade. --- //
    
        // Scanner = leitor.
    try (Scanner leitor = new Scanner(System.in)) {

        // Saudações.
        System.out.println("Olá, Seja bem vindo ao sistema.");
        System.out.print("Qual o seu nome? ");
        String nome = leitor.nextLine();
        System.out.println("Prazer em te conhecer " + nome);

        // Sistema para descobrir sua idade.
        System.out.print("Que ano vc nasceu? ");
        int ano = leitor.nextInt();
        int idade = 2026 - ano;
        Integer.toString(idade);
        String sit = (idade>=18) ? "Maior":"Menor";

        // Resultado
        System.out.println(" --- Resultado. ---");
        System.out.println("Sua idade é: " + idade);
        System.out.println("Vc é de " + sit);


        }
    }
}