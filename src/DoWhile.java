import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner ale = new Scanner(System.in);

        double g;
        char z;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double x = ale.nextDouble();
            g = ((9 * x) / 5) + 32;
            System.out.printf("A temperatura equivalente em Fahrenheit %.1f%n", g);
            System.out.printf("Deseja repetir s/n?");
            z = ale.next().charAt(0);
        } while (z != 'n');
    }
}
