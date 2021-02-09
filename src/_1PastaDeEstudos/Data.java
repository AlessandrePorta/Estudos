package _1PastaDeEstudos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat d1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat d2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date x1 = d1.parse("25/06/2018");
        Date x2 = d2.parse("25/06/2018 15:42:07");

        System.out.println(x1);
        System.out.println(x2);

    }
}
