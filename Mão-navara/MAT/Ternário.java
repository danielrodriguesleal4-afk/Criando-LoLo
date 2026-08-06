public class Ternário {
    public static void main(String[] args) {
    // ----- Vaiaveis ----- //

    // Ternário v1.
        int n1 = 8, n2 = 14, r1;
        int n3 = 9, n4 = 10, r2;
        int n5 = 8, n6 = 6, r3;
        int n7 = 10, n8 = 18, r4;
        int n9 = 10, n10 = 10, r5;
        int n11 = 5, n12 = 6, r6;
    
    // Operadores Relacionais: v1

    // Maior que ">":
        r1 = (n1>n2) ? n1:n2; 
        System.out.println("Mais é: " + r1);

    // Menor que "<":
        r2 = (n3<n4) ? n3:n4;
        System.out.println("Menos é: " + r2);

    // Maior ou igual ">=":
        r3 = (n5>=n6) ? n5:n6;
        System.out.println("Maior ou igual: " + r3);

    // Menor ou igual "<=":
        r4 = (n7<=n8) ? n7:n8;
        System.out.println("Menor ou igual: " + r4);

    // Igual a "==":
        r5 = (n9==n10) ? n9:n10;
        System.out.println("Igual a: " + r5);

    // Diferente de "!=":
        r6 = (n11!=n12) ? n11:n12;
        System.out.println("Diferente: " + r6);
        
    }
}