import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Você deseja jogar? ");
        String resposta = sc.next().toLowerCase();

        if(resposta.equals("s")) {
            System.out.print("Digite o número máximo a ser gerado: ");
            int n_max = sc.nextInt();
            int n;
            while(true) {
                System.out.print("Chute o número: ");
                n = sc.nextInt();

                if(n > n_max) {
                    System.out.print("O número informado é maior que o número máximo. Tente novamente.\n");
                } else {
                    break;
                }
            }

            Random gerador = new Random();
            int gerado = gerador.nextInt(n_max);

            if(gerado == n) {
                System.out.print("Você ganhou!");
                return;
            }
            System.out.print("Você perdeu. ;(\nO número gerado foi " + gerado);

        } else {
            System.out.print("Programa finalizado.");
        }


    }

}
