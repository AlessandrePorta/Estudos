package Interfaces.DefaultMethods.Entities;

public class UsaInterestServices implements InterestServices{

    private Double interestRate;

    public UsaInterestServices(Double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
