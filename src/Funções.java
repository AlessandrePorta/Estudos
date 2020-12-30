import java.util.Scanner;

public class Funções {
    public static void main(String[] args) {

        Scanner ale = new Scanner(System.in);

        System.out.printf("Digite 3 números: ");
        int a = ale.nextInt();
        int b = ale.nextInt();
        int c = ale.nextInt();

        int maior = max(a, b, c);

    }

    public static int max(int x, int y, int z) {
        int res;
        if (x > y && x > z) {
            res = x;
        } else if (y > z) {
            res = y;
        } else {
            res = z;
        }

    }
}
