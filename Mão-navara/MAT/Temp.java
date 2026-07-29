public class Temp {
    public static void main(String[] args) {
    //  O "+" e o incremento, que adicionar mais 1
        int n1 = 5;
        n1++;
    // O "--" é o decremento, que diminuir menos 1
        int n2 = 5;
        n2--;
    // Variaveis.
        int n3 = 5;
        int n4 = 5;
    // Pós.
        int valor = 5 + n3++;
    System.out.println("O valor é igual a: " + valor);
    System.out.println("N1 e igual a: " + n3);
    // Pré.
        int valor2 = 5 + ++n4;
    System.out.println("O valor é: " + valor2);
  }
}
