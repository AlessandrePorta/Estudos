package ExercicioEnumExemplo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");

        System.out.print("Entre com o nome do departamento: ");
        String nomeDepartamento = sc.nextLine();
        System.out.println("Entre com os dados do funcionario.");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Nível: ");
        String nivel = sc.nextLine();
        System.out.print("Salário base: ");
        double salarioBase = sc.nextDouble();
        Colaborador colaborador = new Colaborador(nome, NivelColaborador.valueOf(nivel), salarioBase, new Departamento(nomeDepartamento));

        System.out.print("Quantos contratos esse colaborador terá: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            System.out.println("Entre com contrato #"+ i +":");
            System.out.print("Data (DD/MM/YYYY): ");
            Date dataContrato = sdf.parse(sc.next());
            System.out.print("Valor por hora: ");
            double valorPorHora = sc.nextDouble();
            System.out.print("Duração do contrato: ");
            int horas = sc.nextInt();
            ContratoPorHora contrato = new ContratoPorHora(dataContrato, valorPorHora, horas);
            colaborador.addContrato(contrato);
        }
        System.out.println();
        System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
        String mesEAno = sc.next();
        int mes = Integer.parseInt(mesEAno.substring(0,2));
        int ano = Integer.parseInt(mesEAno.substring(3));
        System.out.println("Nome: "+ colaborador.getNome());
        System.out.println("Departamento: "+ colaborador.getDepartamento().getNomeDepartamento());
        System.out.println("Salário do mês de: "+ mesEAno +", "+ String.format("%.2f", colaborador.totalSalario(ano,mes)));
    }
}
