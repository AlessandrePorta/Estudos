package Interfaces.DefaultMethods.Entities;

public class BrasilInterestServices implements InterestServices{

    private Double interestRate;

    public BrasilInterestServices(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
