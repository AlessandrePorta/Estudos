package Generics.Introduce.Application;

import Generics.Introduce.Services.PrintService;
import Generics.Introduce.Services.PrintServiceString;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        PrintService<String> ps = new PrintService<>();

        System.out.print("Quantidade de números:");
        int p = sc.nextInt();

        for (int i = 0; i < p; i++){
            System.out.print("Digite uma string: ");
            ps.addValues(sc.next());
        }

        ps.print();
        System.out.println();
        System.out.println("Primeiro: " + ps.first());

        sc.close();
    }
}
