import java.time.LocalDate;
import java.util.ArrayList;

public abstract class PaymentCard implements ICharge{
    private ArrayList<Double> charges;
    private String cardNumber;
    private String expiryDate;
    private String name;
    private String bank;
    private String provider;

    public PaymentCard(String cardNumber, String expiryDate, String name, String bank, String provider){
        this.charges = new ArrayList<>();
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.name = name;
        this.bank = bank;
        this.provider = provider;
    }

    public ArrayList<Double> getCharges(){
        return this.charges;
    }

    public void addCharge(double newCharge){
        this.charges.add(newCharge);
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
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
