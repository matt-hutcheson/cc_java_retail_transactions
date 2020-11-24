import java.time.LocalDate;

public class CreditCard extends PaymentCard implements ICharge {
    private double riskMultiplier;

    private double creditLimit;

    public CreditCard(long cardNumber, LocalDate expiryDate, String name, String bank, String provider, double riskMultiplier, double creditLimit){
        super(cardNumber, expiryDate, name, bank, provider);
        this.riskMultiplier = riskMultiplier;
        this.creditLimit = creditLimit;
    }
    public double calcTransactionFee(double cost){
        return 2 * cost * riskMultiplier;
    }

    public void charge(double newCharge){
         this.addCharge(newCharge);
         this.creditLimit -= newCharge;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }

    public void setRiskMultiplier(double riskMultiplier) {
        this.riskMultiplier = riskMultiplier;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
}
