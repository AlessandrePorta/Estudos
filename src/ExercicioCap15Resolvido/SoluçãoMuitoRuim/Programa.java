package ExercicioCap15Resolvido.SoluçãoMuitoRuim;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Número da sala: ");
        int numeroSala = sc.nextInt();
        System.out.print("Check-In: ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-Out: ");
        Date checkOut = sdf.parse(sc.next());

        if (!checkOut.after(checkIn)) {
            System.out.println("Erro na reserva: Check-Out não pode ser menor que a data de Check-In.");
        } else {
            Reservas reservas = new Reservas(numeroSala, checkIn, checkOut);
            System.out.println("Reservas" + reservas);

            System.out.println();
            System.out.println("Entre os dados para atualizar a reserva.");
            System.out.print("Check-In (DD/MM/YYYY): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-Out (DD/MM/YYYY): ");
            checkOut = sdf.parse(sc.next());

            Date agora = new Date();

            if (checkIn.before(agora) || checkOut.before(agora)) {
                System.out.println("Erro na reserva: As datas de reservas devem ser para datas futuras.");
            }
            else if (!checkOut.after(checkIn)) {
                System.out.println("Erro na reserva: Check-Out não pode ser menor que a data de Check-In.");
            }
            else {
                reservas.atualizarDatas(checkIn, checkOut);
                System.out.println("Reservas" + reservas);
            }
        }
        sc.close();
    }
}

