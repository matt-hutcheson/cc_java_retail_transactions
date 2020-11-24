import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCard extends PaymentCard implements ICharge {
    private double riskMultiplier;
    private double creditLimit;
    private long cardNumber;
    private LocalDate expiryDate;
    private String name;
    private String provider;
    private ArrayList<Double> totalCharges;

    public CreditCard(long cardNumber, LocalDate expiryDate, String name, String bank, String provider, double riskMultiplier, double creditLimit){
        super(cardNumber, expiryDate, name, bank, provider);
        this.riskMultiplier = riskMultiplier;
        this.creditLimit = creditLimit;
    }
    public void calcTransactionFee(){

    }

    public void charge(){

    }
}
