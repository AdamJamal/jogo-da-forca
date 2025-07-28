public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (asterisco.contains("*")) {
        System.out.println("Adivinhe uma letra:");
        System.out.println(asterisco);

        String adivinha = sc.next().toLowerCase();
    }

    sc.close();
}
