public class Ternário {
    public static void main(String[] args) {

    // --- Operadores Relacionais: v1 --- //
    System.out.println(" --- Operadores Relacionais. ---");

    // Maior que. ">":
        int n1 = 8, n2 = 14, r1;
        r1 = (n1>n2) ? n1:n2; 
        System.out.println("É maior? " + r1);

    // Menor que. "<":
        int n3 = 9, n4 = 10, r2;
        r2 = (n3<n4) ? n3:n4;
        System.out.println("Menos é: " + r2);

    // Maior ou igual ">=":
        int n5 = 8, n6 = 6, r3;
        r3 = (n5>=n6) ? n5:n6;
        System.out.println("Maior ou igual: " + r3);

    // Menor ou igual "<=":
        int n7 = 10, n8 = 18, r4;
        r4 = (n7<=n8) ? n7:n8;
        System.out.println("Menor ou igual: " + r4);

    // Igual "==":
        int n9 = 10, n10 = 10, r5;
        r5 = (n9==n10) ? n9:n10;
        System.out.println("Igual a: " + r5);

    // Diferente "!=":
        int n11 = 5, n12 = 6, r6;
        r6 = (n11!=n12) ? n11:n12;
        System.out.println("Diferente: " + r6);

    // --- Operadores Lógicos: v2 --- //
    System.out.println(" --- Operadores Lógicos. ---");

    // "&&" Quero os dois certos.
        int x = 4, y = 7, z = 12;
        boolean r;
        r = (x<y && y<z) ? true:false;
        System.out.println("Os dois estão certos? " + r);

    // "||" Quero pelo menos um certo.
        int x1 = 4, y1 = 3, z1 = 30;
        boolean rp;
        rp = (x1==y1 || z1>y1) ? true:false;
        System.out.println("Pelo menos um certo? " + rp);

    // "^" Quero exclusivamente um certo.
        int x2 = 6, y2 = 14, z2 = 69;
        boolean ex;
        ex = (x2<y2 ^ y2<z2) ? true:false;
        System.out.println("Só um ta certo? " + ex);
    }
}