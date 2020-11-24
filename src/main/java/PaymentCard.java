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

    public ArrayList<Double> getCharges(){
        return this.charges;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

}
