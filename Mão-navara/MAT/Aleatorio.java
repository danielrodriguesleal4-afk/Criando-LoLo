public class Aleatorio {
    public static void main(String[] args) {
    // ----- Class Random. -----
    
    // Número aleatório entre 0 é 1.
        double A = Math.random();
        System.out.println("Número : " + A);

    // Número inteiro aleatório entre 5 é 10. 
        double B = Math.random();
        int n = (int) (5 + B * (10 - 5));
        System.out.println("Número+ : " + n);

    // Número aleatório inteiro entre 15 é 50.
        double C = Math.random();
        int ale = (int) (15 + C * (50 - 15));
        System.out.println("Número++ : " + ale);
    }
}
