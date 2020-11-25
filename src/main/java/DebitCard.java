public class DebitCard extends PaymentCard implements ICharge {
    private String sortCode;
    private String accountNumber;

    public DebitCard(String cardNumber, String expiryDate, String name, String bank, String provider, String sortCode, String accountNumber){
        super(cardNumber, expiryDate, name, bank, provider);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }
    public double calcTransactionFee(double cost){
        return 0.2 * cost;
    }

    public void charge(double newCharge){
         super.addCharge(newCharge);
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
