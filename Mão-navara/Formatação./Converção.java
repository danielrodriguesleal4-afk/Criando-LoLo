public class Converção {
    public static void main(String[] args) {
    // Metodo "toString" para converter em palavra.
        int idade = 30;
        String valor = Integer.toString(idade);
    // Metodo "parseInt" para converter em número.
    // Para "int" o comando necéssario é "%d".
        String valor2 = "30";
        int idade2 = Integer.parseInt(valor2);
    // Metodo "parseFloat" para números reais. 
        String valor3 = "30.5";
        float idade3 = Float.parseFloat(valor3);
    // Mostrando os resultados.
        System.out.printf("Sua idade é: %s \n", valor);
        System.out.printf("Sua idade é: %d \n", idade2);
        System.out.printf("Sua idade é: %.1f \n", idade3);
    }
}