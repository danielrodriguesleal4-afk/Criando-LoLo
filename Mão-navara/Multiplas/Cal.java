import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

    // Anuncio: 1.
    System.out.println(" --- Calculadora personalizada. --- ");

    // Escolhas das opções.
    System.out.println("Digite 1 para soma.");
    System.out.println("Digite 2 para subtração.");
    System.out.println("Digite 3 para mutiplicação.");
    System.out.println("Digite 4 para divição.");

    // Resultado da escolha.
    System.out.print("Digite aqui o número escolhido: ");
    int Esc = leitor.nextInt();

    switch (Esc) {

        case 1: // --- Soma. --- // 

        // Anuncio: Soma.
            System.out.println(" --- Soma escolhida. --- ");

        // Escolhas de valores.
            System.out.print("Digite o primeiro valor: ");
                int so1 = leitor.nextInt();
            System.out.print("Digite o segundo valor: ");
                int so2 = leitor.nextInt();

           // Calculo.
                int R1 = so1 + so2;

        // Resultado.
            System.out.println(" --- Resultado. --- ");
            System.out.println("A soma deu: " + R1);

        // Fim:
            break;


        case 2: // --- Subtração. --- // 

        // Anuncio: Subt.
            System.err.println(" --- Subtração Escolhida. --- ");

        // Escolhas de valores.
            System.out.print("Digite o primeiro valor: ");
                int div1 = leitor.nextInt();
            System.out.print("Digite o segundo valor: ");
                int div2 = leitor.nextInt();

            // Calculo.
                int R2 = div1 - div2;

        // Resultado da subtração.
            System.out.println(" --- Resultado. --- ");
            System.out.println("A subtração deu: " + R2);

        // Fim
            break; 


        case 3: // --- Multiplicação. --- //

        // Anuncio: Mult.
            System.out.println(" --- Multiplicação Escolhido. --- ");

        // Escolhas de valores.
            System.out.print("Digite o primeiro número: ");
                int Mul1 = leitor.nextInt();
            System.out.print("Digite o segundo número: "); 
                int Mul2 = leitor.nextInt();
                
            // Calculo.
                int R3 = Mul1 * Mul2;
            
        // Resultado.
            System.out.println(" --- Resultado. --- ");
            System.out.println("A multiplicação deu: " + R3);

        // Fim 
            break;


        case 4: // --- Divição. --- //

        //Anuncio: Divi.
            System.out.println(" --- Divição Escolhido. --- ");

        // Escolhas de valores. 
            System.out.print("Digite o primeiro número: ");
                double Div1 = leitor.nextDouble();
            System.out.print("Digite o segundo número: ");
                double Div2 = leitor.nextDouble();
                
            // Calculo.
                double R4 = Div1 / Div2;

        // Resultado
            System.out.println(" --- Resultado. --- ");
            System.out.println("A divição deu: " + R4);
 
        // Fim 
            break;

            }
        }
    }
}
