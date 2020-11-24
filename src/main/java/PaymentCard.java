import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PaymentCard {
    private ArrayList<Double> charges;
    private long cardNumber;
    private LocalDate expiryDate;
    private String name;
    private String bank;
    private String provider;

    public PaymentCard(long cardNumber, LocalDate expiryDate, String name, String bank, String provider){
        this.charges = new ArrayList<>();
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.name = name;
        this.bank = bank;
        this.provider = provider;
    }

    public abstract void calcTransactionFee();

    public abstract void charge();
}
