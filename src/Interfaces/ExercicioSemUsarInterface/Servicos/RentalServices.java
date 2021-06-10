package Interfaces.ExercicioSemUsarInterface.Servicos;

import Interfaces.ExercicioSemUsarInterface.Entidades.CarRental;
import Interfaces.ExercicioSemUsarInterface.Entidades.Invoice;

public class RentalServices {

    private Double precoPorDia;
    private Double precoPorHora;

    private BrasilTaxServices brasilTaxServices;

    public RentalServices(Double precoPorDia, Double precoPorHora, BrasilTaxServices brasilTaxServices) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.brasilTaxServices = brasilTaxServices;
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
        double taxaServicos = brasilTaxServices.taxa(pagamentoBasico);

        carRental.setInvoice(new Invoice(pagamentoBasico, taxaServicos));
    }
}
