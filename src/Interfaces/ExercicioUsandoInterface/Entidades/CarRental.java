package Interfaces.ExercicioUsandoInterface.Entidades;

import java.util.Date;

public class CarRental {

    private Date começo;
    private Date fim;

    private Vehicle vehicle;
    private Invoice invoice;

    public CarRental(){}

    public CarRental(Date começo, Date fim, Vehicle vehicle) {
        this.começo = começo;
        this.fim = fim;
        this.vehicle = vehicle;
    }

    public Date getComeço() {
        return começo;
    }

    public void setComeço(Date começo) {
        this.começo = começo;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}