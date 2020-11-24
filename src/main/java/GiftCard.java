import java.util.ArrayList;

public class GiftCard implements ICharge{
    private double balance;
    private String storeName;
    private ArrayList<Double> charges;

    public GiftCard(double balance, String storeName){
        this.balance = balance;
        this.storeName = storeName;
        this.charges = new ArrayList<>();
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void charge(double newCharge){
        this.charges.add(newCharge);
    }

    public double calcTransactionFee(double newCharge){
        return 0;
    }

    public ArrayList<Double> getCharges(){
        return this.charges;
    }
}
