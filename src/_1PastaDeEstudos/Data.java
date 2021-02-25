package _1PastaDeEstudos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat d3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        d3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = d1.parse("25/06/2018");
        Date x2 = d2.parse("25/06/2018 15:42:07");

        Date y1 = new Date();
        Date y2 = new Date(System.currentTimeMillis());
        Date y3 = new Date(0L);
        Date y4 = new Date(1000L * 60L * 60L *5L);
        Date y5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(d3.format(x1));
        System.out.println(d3.format(x2));
        System.out.println(d3.format(y1));
        System.out.println(d3.format(y2));
        System.out.println(d3.format(y3));
        System.out.println(d3.format(y4));
        System.out.println(d3.format(y5));

    }
}
