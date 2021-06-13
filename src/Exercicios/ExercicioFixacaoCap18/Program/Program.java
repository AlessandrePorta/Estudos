package Exercicios.ExercicioFixacaoCap18.Program;

import Exercicios.ExercicioFixacaoCap18.Entities.Contract;
import Exercicios.ExercicioFixacaoCap18.Entities.Installment;
import Exercicios.ExercicioFixacaoCap18.Services.ContractService;
import Exercicios.ExercicioFixacaoCap18.Services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato.");
        System.out.print("Numero: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Data: ");
        Date data = sdf.parse(sc.nextLine());
        System.out.print("Valor do contrato: ");
        Double valorTotal = sc.nextDouble();

        Contract contract = new Contract(numero, data, valorTotal);

        System.out.print("Digite o número de parcelas:");
        int quantidade = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.contractProcessing(contract, quantidade);

        System.out.println("Parcelas.");
        for(Installment i : contract.getInstallment()){
            System.out.println(i);
        }
    }
}
