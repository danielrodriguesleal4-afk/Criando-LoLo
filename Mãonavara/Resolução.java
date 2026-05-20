import java.awt.Dimension;
import java.awt.Toolkit;

public class Resolução {
    public static void main(String[] args) {
Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
double largura = tamanhoTela.getWidth();
double altura = tamanhoTela.getHeight();
System.out.println("===== Resolução =====");
System.out.println("A largura da sua tela é: " + (int) largura + " pixel." );
System.out.println("A altura da sua tela é: " + (int) altura + " pixel." );
    }
}