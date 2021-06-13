package Interfaces.InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Servicos;

import Interfaces.InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Entidades.CarRental;
import Interfaces.InversaoDeControleEInjecaoDeIndependencia.ExercicioUsandoInterface.Entidades.Invoice;

public class RentalServices {

    private Double precoPorDia;
    private Double precoPorHora;

    private TaxService taxService;

    public RentalServices(Double precoPorDia, Double precoPorHora, TaxService taxService) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        long t1 = carRental.getComeço().getTime();
        long t2 = carRental.getFim().getTime();
        double horas = (double) (t2-t1)/1000/60/60;
        double pagamentoBasico;
        if(horas<=12){
            pagamentoBasico = Math.ceil(horas)* precoPorHora;
        }else{
            pagamentoBasico = Math.ceil(horas/24) * precoPorDia;
        }
        double taxa = taxService.taxa(pagamentoBasico);

        carRental.setInvoice(new Invoice(pagamentoBasico, taxa));
    }
}
