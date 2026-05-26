import java.util.Scanner;

public class opera {
   public static void main(String[] args) {
      try (Scanner leitor = new Scanner(System.in)) {
   System.out.print("Escolha um número entre 1,2 é 3: ");
      int escolha = leitor.nextInt();
   switch (escolha) {
      case 1:
   System.out.println("Vc escolheu 1. Aqui está o resultado: 700");
         break;
      case 2:
   System.out.println("VC escolheu 2. Aqui está o resultado: 1400");
         break;
      case 3:
   System.out.println("Vc escolheu 3. Aqui está o resultado: 2100");
      default:
   System.out.println("Erro! Opção invalida.");
         break;
         }
       }
    }
}