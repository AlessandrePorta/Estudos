package InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Program;

import InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Entidades.CarRental;
import InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Entidades.Vehicle;
import InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Servicos.BrasilTaxServices;
import InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Servicos.RentalServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");

        System.out.println("Digite os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Data de início (dd/MM/yyyy HH:ss): ");
        Date comeco = sdf.parse(sc.nextLine());
        System.out.print("Data de retorno (dd/MM/yyyy HH:ss: ");
        Date fim = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(comeco, fim, new Vehicle(modelo));

        System.out.print("Digite o preco da hora: ");
        double precoPorHora = sc.nextDouble();
        System.out.print("Digite o preco por dia: ");
        double precoPorDia = sc.nextDouble();

        RentalServices rs = new RentalServices(precoPorDia, precoPorHora, new BrasilTaxServices());

        rs.processInvoice(cr);

        System.out.println("Invoice");
        System.out.println("Pagamento: " + String.format("%.2f", cr.getInvoice().getPagamentoBasico()));
        System.out.println("Taxa: " + String.format("%.2f", cr.getInvoice().getTaxa()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));




        sc.close();
    }
}
