import java.util.Scanner;

class BebidaAlcoolica {

    public void recomendarBebida() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha sua preferência de sabor:");
        System.out.println("0 - Amargo");
        System.out.println("1 - Doce");
        int preferenciaSabor = scanner.nextInt();

        if (preferenciaSabor == 0) {
            escolherBebidaAmarga();
        } else if (preferenciaSabor == 1) {
            escolherBebidaDoce();
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private void escolherBebidaAmarga() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha entre as bebidas amargas:");
        System.out.println("0 - Cerveja");
        System.out.println("1 - Licor");
        int tipoBebidaAmarga = scanner.nextInt();

        if (tipoBebidaAmarga == 0) {
            System.out.println("Cerveja recomendada. Opte por estilos como IPA, Stout ou Porter para um sabor mais intenso.");
        } else if (tipoBebidaAmarga == 1) {
            System.out.println("Licor recomendado. Opte por sabores como Campari, Fernet ou Jägermeister para um sabor digestivo.");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    private void escolherBebidaDoce() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha entre as bebidas doces:");
        System.out.println("0 - Caipirinha");
        System.out.println("1 - Mojito");
        int tipoBebidaDoce = scanner.nextInt();

        if (tipoBebidaDoce == 0) {
            System.out.println("Caipirinha recomendada. Opte por sabores clássicos como limão, vodka e cachaça.");
        } else if (tipoBebidaDoce == 1) {
            System.out.println("Mojito recomendado. Refrescante e saboroso, com rum, hortelã, limão e açúcar.");
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
