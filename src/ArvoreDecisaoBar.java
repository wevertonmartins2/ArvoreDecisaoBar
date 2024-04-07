import java.util.Scanner;

public class ArvoreDecisaoBar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Bar! Por favor, escolha o tipo de bebida desejado:");
        System.out.println("0 - Bebida Alcoólica");
        System.out.println("1 - Bebida Não Alcoólica");
        int tipoBebida = scanner.nextInt();

        if (tipoBebida == 0) {
            BebidaAlcoolica bebidaAlcoolica = new BebidaAlcoolica();
            bebidaAlcoolica.recomendarBebida();
        } else if (tipoBebida == 1) {
            BebidaNaoAlcoolica bebidaNaoAlcoolica = new BebidaNaoAlcoolica();
            bebidaNaoAlcoolica.recomendarBebida();
        } else {
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}