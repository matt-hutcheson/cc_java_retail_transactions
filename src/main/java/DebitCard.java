import java.time.LocalDate;

public class DebitCard extends PaymentCard implements ICharge {
    private int sortCode;

    private int accountNumber;

    public DebitCard(long cardNumber, LocalDate expiryDate, String name, String bank, String provider, int sortCode, int accountNumber){
        super(cardNumber, expiryDate, name, bank, provider);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }
    public double calcTransactionFee(double cost){
        return 0.2 * cost;
    }

    public void charge(double newCharge){
         this.addCharge(newCharge);
    }

    public int getSortCode() {
        return sortCode;
    }

    public void setSortCode(int sortCode) {
        this.sortCode = sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
