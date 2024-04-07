import java.util.Scanner;

class BebidaNaoAlcoolica {

    public void recomendarBebida() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha sua preferência de temperatura:");
        System.out.println("0 - Fria");
        System.out.println("1 - Quente");
        int preferenciaTemperatura = scanner.nextInt();

        if (preferenciaTemperatura == 0) {
            escolherBebidaFria();
        } else if (preferenciaTemperatura == 1) {
            escolherBebidaQuente();
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private void escolherBebidaFria() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha entre as bebidas frias:");
        System.out.println("0 - Suco");
        System.out.println("1 - Refrigerante");
        int tipoBebidaFria = scanner.nextInt();

        if (tipoBebidaFria == 0) {
            escolherSuco();
        } else if (tipoBebidaFria == 1) {
            System.out.println("Refrigerante recomendado. Escolha entre sabores tradicionais como cola, guaraná ou laranja.");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private void escolherSuco() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de suco:");
        System.out.println("0 - Suco de laranja");
        System.out.println("1 - Suco de abacaxi");
        int tipoSuco = scanner.nextInt();

        if (tipoSuco == 0) {
            System.out.println("Suco de laranja recomendado, rico em vitamina C e refrescante.");
        } else if (tipoSuco == 1) {
            System.out.println("Suco de abacaxi recomendado, com sabor doce e tropical.");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private void escolherBebidaQuente() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha entre as bebidas quentes:");
        System.out.println("0 - Café");
        System.out.println("1 - Chá");
        int tipoBebidaQuente = scanner.nextInt();

        if (tipoBebidaQuente == 0) {
            System.out.println("Café recomendado. Opte por um espresso para um sabor intenso ou um cappuccino para uma bebida cremosa.");
        } else if (tipoBebidaQuente == 1) {
            System.out.println("Chá recomendado. Escolha entre sabores como verde, preto, camomila ou hortelã para um efeito relaxante.");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
