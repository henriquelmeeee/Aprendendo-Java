import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número para calcular o fatorial: ");
        int n = sc.nextInt();
        int result = n;
        System.out.print("Fatorial: " + n + " x ");
        for(int i=n-1; i > 0; i--) {
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + " x ");
            }
            result *= i;
        }
        System.out.println("\nResultado: " + result);

    }

}
