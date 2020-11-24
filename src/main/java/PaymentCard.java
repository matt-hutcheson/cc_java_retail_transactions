import java.util.ArrayList;
import java.util.Date;

public abstract class PaymentCard {
    private ArrayList<Double> totalCarges;
    private int cardNumber;
    private Date expiryDate;
    private String name;
    private String bank;
    private String provider;

    public PaymentCard(ArrayList<Double> totalCarges, int cardNumber, Date expiryDate, String name, String bank, String provider){
        this.totalCarges = totalCarges;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.name = name;
        this.bank = bank;
        this.provider = provider;
    }

    public abstract void calcTransactionFee();

    public abstract void charge();
}
