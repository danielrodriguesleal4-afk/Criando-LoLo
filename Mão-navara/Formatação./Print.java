public class Print {
    public static void main(String[] args) { 
        // ======== Variaveis. ==========
    String nome = "Daniel";
    float nota = 8.5f;
        // Comando "print" com "f" de formatado.
    System.out.println("========= Variação. ==========");
    System.out.printf("A nota de %s é %.2f \n", nome, nota);
        /* A palavra "nome" é "nota", representão as variaveis.
         * Ó "%" representa o comando para colocar a formatação.
         * Ó ".?" representa casas decimais
         * A "?" será substituida pôr um numero de
           quantas casas decimais deseja mostrar.
         * O comando "%s" é para palavras, o comando "%." é para numeros.
         * O comando "\n" e para pular uma linha.
         */
    System.out.println("========= Oãçairav. ==========");
    System.out.format("A nota de %.2f é %s \n", nota, nome);
         // O comando "format" é "printf" são a mesma coisa.
    }
}