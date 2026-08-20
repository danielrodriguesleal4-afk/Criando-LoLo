import java.util.Scanner;

public class Pernas {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner(System.in)) {

        // Anuncio 1.
        System.out.println(" --- Classificação de pernas. --- ");
        System.out.print("Quantas pernas possuí o ser vivo escolhido? ");
        int P = leitor.nextInt();

        String tipo;

        switch (P) {
            case 1:
                tipo = "Saci";
                    break;
            case 2:
                tipo = "Bípede";
                    break;
            case 4:
                tipo = "Quadrúpede";
                    break;
            case 6,8:
                tipo = "Aranha";
                    break;
            default:
                tipo = "ET";
            }
        
        // --- Resultado. --- //
        System.out.println("O seu ser vivo é " + tipo);
        
        }
    }
}
