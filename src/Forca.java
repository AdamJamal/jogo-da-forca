if (adivinha.length() != 1) {
    System.out.println("Digite apenas uma letra por vez.");
    continue;
}

if (!Character.isLetter(adivinha.charAt(0))) {
    System.out.println("Isso não é uma letra. Tente novamente.");
    continue;
}
