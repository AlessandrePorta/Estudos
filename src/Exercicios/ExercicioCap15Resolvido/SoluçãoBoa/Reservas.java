package Exercicios.ExercicioCap15Resolvido.SoluçãoBoa;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservas {

    private Integer numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservas(Integer numeroQuarto, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new ExcecoesDeDominio("Check-Out não pode ser menor que a data de Check-In.");
        }
        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duracao() {
        long diferenca = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date checkIn, Date checkOut) {
        Date agora = new Date();
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new ExcecoesDeDominio( "As datas de reservas devem ser para datas futuras.");
        }
        if (!checkOut.after(checkIn)) {
            throw new ExcecoesDeDominio("Check-Out não pode ser menor que a data de Check-In.");
        }
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Sala: " + numeroQuarto + ", Check-In: " + sdf.format(checkIn) + ", Check-Out: " + sdf.format(checkOut) + ", " + duracao() + " noites";
    }
}
