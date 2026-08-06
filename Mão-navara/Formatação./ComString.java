public class ComString {
    public static void main(String[] args) {
        
    // --- Variaveis de classes String. --- //

    // V : 1
        String nome1 = "Gustavo";
    // V : 2
        String nome2 = "Gustavo";
    // V : 3
        String nome3 = new String("Gustavo");

        String r1;
    // "equals" para objetos.
        r1 = (nome2.equals(nome3)) ? "sim":"não";
        System.out.println("Eles são diferentes: " + r1);
    }
}
