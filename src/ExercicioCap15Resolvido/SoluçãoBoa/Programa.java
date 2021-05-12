package ExercicioCap15Resolvido.SoluçãoBoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Número da sala: ");
            int numeroSala = sc.nextInt();
            System.out.print("Check-In: ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out: ");
            Date checkOut = sdf.parse(sc.next());

            Reservas reservas = new Reservas(numeroSala, checkIn, checkOut);
            System.out.println("Reservas" + reservas);

            System.out.println();
            System.out.println("Entre os dados para atualizar a reserva.");
            System.out.print("Check-In (DD/MM/YYYY): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out (DD/MM/YYYY): ");
            checkOut = sdf.parse(sc.next());

            reservas.atualizarDatas(checkIn, checkOut);
            System.out.println("Reservas" + reservas);
        } catch(ParseException a){
            System.out.println("Data invalida");
        } catch(ExcecoesDeDominio b){
            System.out.println("Erro na reserva: " + b.getMessage());
        } catch(InputMismatchException c){
            System.out.println("Erro inesperado");
        }
        sc.close();
    }
}