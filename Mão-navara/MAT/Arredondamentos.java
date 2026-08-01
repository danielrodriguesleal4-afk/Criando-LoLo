public class Arredondamentos {
    public static void main(String[] args) {
    // ----- Arredondamentos. ----- //

    // Valor absoluto.
       double A = (-10);
       int R = (int) Math.abs(A);
       System.out.println("Valor absoluto: " + R);

    // Arredonda para baixo.
        double  B = 6.9; 
        int R1 = (int) Math.floor(B);
        System.out.println("O valor para baixo: " + R1);

    // Arredonda para cima.
        double C = 5.4;
        int R2 = (int) Math.ceil(C);
        System.out.println("O valor para cima: " + R2);

    // Arredonda Aritmética.
        double A1 = 5.4;
        double A2 = 5.6;
        int R3 = (int) Math.round(A1);
        int R4 = (int) Math.round(A2);
        System.out.println("O valor é: " + R3);
        System.out.println("O valor é: " + R4);

    // ----- Classe - Math ----- //

    // O valor de PI = 3,1415....
        double P = Math.PI;
        System.out.println("Valor de PI: " + P);

    // Exponenciação. // 5,2 = 25
        double E = Math.pow(2,10);
        System.out.println("A exponenciação é: " + E);

    // Raiz Quadrada.
        double Q = Math.sqrt(25);
        System.out.println("A raiz quadrada: " + Q);

    // Raiz Cúbica.
        double Cub = Math.cbrt(27);
        System.out.println("A raiz cúbica é: " + Cub);
    }
}