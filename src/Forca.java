import java.util.Scanner;

public class Forca {

    private static String[] palavras = {"cozinha", "amarelo", "instituto", "abelha"};
    private static String palavra = palavras[(int) (Math.random() * palavras.length)];
    private static String asterisco = new String(new char[palavra.length()]).replace("\0", "*");
    private static String letrasDigitadas = "";
    private static int contagem = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (contagem < 6 && asterisco.contains("*")) {
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
            forca(adivinha);
        }

        sc.close();
    }

    public static void forca(String adivinha) {
        String novoasterisco = "";
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) == adivinha.charAt(0)) {
                novoasterisco += adivinha.charAt(0);
            } else if (asterisco.charAt(i) != '*') {
                novoasterisco += palavra.charAt(i);
            } else {
                novoasterisco += "*";
            }
        }

        if (asterisco.equals(novoasterisco)) {
            contagem++;
            System.out.println("Letra incorreta.");
            forcaImagem();
        } else {
            asterisco = novoasterisco;
            System.out.println("Boa! Você acertou uma letra.");
        }

        if (asterisco.equals(palavra)) {
            System.out.println("Correto! Você ganhou! A palavra era " + palavra + "!");
        }

        if (contagem == 6) {
            forcaImagem();
            System.out.println("FIM DE JOGO! A palavra era " + palavra + "!");
        }
    }

    public static void forcaImagem() {
        if (contagem == 1) {
            System.out.println("Errado, tente novamente");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         ");
            System.out.println("   |        ");
            System.out.println("   |         ");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (contagem == 2) {
            System.out.println("Errado, tente novamente");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (contagem == 3) {
            System.out.println("Errado, tente novamente");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |");
            System.out.println("___|___");
        }
        if (contagem == 4) {
            System.out.println("Errado, tente novamente");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |           |");
            System.out.println("   |           |");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (contagem == 5) {
            System.out.println("Errado, tente novamente");
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        |     |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
        }
        if (contagem == 6) {
            System.out.println("   ____________");
            System.out.println("   |          _|_");
            System.out.println("   |         /   \\");
            System.out.println("   |        | X  X |");
            System.out.println("   |         \\_ _/");
            System.out.println("   |          _|_");
            System.out.println("   |         / | \\");
            System.out.println("   |          / \\ ");
            System.out.println("___|___      /   \\");
            System.out.println("FIM DE JOGO! A palavra era " + palavra + "!");
        }
    }
}
