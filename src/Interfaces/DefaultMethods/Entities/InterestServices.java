package Interfaces.DefaultMethods.Entities;

public interface InterestServices {

    double getInterestRate();
    default double pagamento(Double quantidade, int meses){
        return quantidade * Math.pow(1 + getInterestRate()/100, meses);
    }
}
