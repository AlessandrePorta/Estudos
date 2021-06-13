package Exercicios.ExercicioFixacaoCap18.Services;

public class PaypalService implements OnlineService{

    @Override
    public Double paymentTax(Double quantidade) {
        return quantidade * 0.02;
    }

    @Override
    public Double paypalTax(Double quantidade, Integer date){
        Double t = 0.01;
        return quantidade * t * date;
    }
}
