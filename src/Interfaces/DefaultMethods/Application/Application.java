package Interfaces.DefaultMethods.Application;

import Interfaces.DefaultMethods.Entities.BrasilInterestServices;
import Interfaces.DefaultMethods.Entities.InterestServices;
import Interfaces.DefaultMethods.Entities.UsaInterestServices;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Quantidade: ");
        double quantidade = sc.nextDouble();
        System.out.println("Meses: ");
        int meses = sc.nextInt();

        InterestServices is = new BrasilInterestServices(2.0);
        Double p = is.pagamento(quantidade, meses);
        InterestServices us = new UsaInterestServices(1.0);
        Double p1 = us.pagamento(quantidade, meses);

        System.out.println("Valor a ser pago depois de "+ meses +" meses:");
        System.out.println(p);
        System.out.println(p1);
    }
}
