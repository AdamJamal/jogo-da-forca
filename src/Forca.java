import java.util.Scanner;

public class Forca {

    private static String[] palavras = {"cozinha", "amarelo", "instituto", "abelha"};
    private static String palavra = palavras[(int) (Math.random() * palavras.length)];
    private static String asterisco = new String(new char[palavra.length()]).replace("\0", "*");
    private static String letrasDigitadas = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (asterisco.contains("*")) {
            System.out.println("Adivinhe uma letra:");
            System.out.println(asterisco);

            String adivinha = sc.next().toLowerCase();

            if (adivinha.length() != 1) {
                System.out.println("Digite apenas uma letra por vez.");
                continue;
            }

            if (!Character.isLetter(adivinha.charAt(0))) {
                System.out.println("Isso não é uma letra. Tente novamente.");
                continue;
            }

            if (letrasDigitadas.contains(adivinha)) {
                System.out.println("Você já tentou essa letra. Tente outra.");
                continue;
            }

            letrasDigitadas += adivinha;
        }

        sc.close();
    }
}
