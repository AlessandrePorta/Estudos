package _1PastaDeEstudos;

import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class dateCalendar {
    public static void main(String[] args){

        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(d1.format(d));

        Calendar cal = Calendar.getInstance();

        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        int minutos = cal.get(Calendar.MINUTE);
        int mes = 1 + cal.get(Calendar.MONTH);

        System.out.println(d);
        System.out.println(minutos);
        System.out.println(mes);

    }
}
