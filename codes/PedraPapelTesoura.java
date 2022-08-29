import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Pedra, papel ou tesoura? ");
        String valor = sc.next().toLowerCase();

        Random gerador = new Random();
        int gerado = gerador.nextInt(3);
        int n = 0;

        switch(valor) {
            case "pedra":
                n = 0;
            case "papel":
                n = 1;
            case "tesoura":
                n = 2;
        }

        if(n == gerado) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu...");
        }

        System.out.println("Jogar novamente? (S/N) ");
        if(sc.next().toLowerCase().equals("s")) {
            main(null);
        }
    }

}
