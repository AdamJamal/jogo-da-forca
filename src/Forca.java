import java.util.Scanner;

public class Forca {
    private static String[] palavras = {"cozinha", "amarelo", "instituto", "abelha"};
    private static String palavra = palavras[(int) (Math.random() * palavras.length)];
    private static String asterisco = new String(new char[palavra.length()]).replace("\0", "*");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Jogo da Forca iniciado!");
    }
}
