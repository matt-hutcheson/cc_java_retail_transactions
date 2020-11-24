import java.util.ArrayList;

public class OnlineAccount {
    private ArrayList<ICharge> paymentMethods;
    private ArrayList<Double> transactionFees;

    public OnlineAccount(){
        this.paymentMethods = new ArrayList<>();
        this.transactionFees = new ArrayList<>();
    }

    public ArrayList<ICharge> getPaymentMethods() {
        return paymentMethods;
    }

    public ArrayList<Double> getTransactionFees() {
        return transactionFees;
    }

    public void addPaymentMethod(ICharge newPaymentMethod){
        this.paymentMethods.add(newPaymentMethod);
    }

    public void addTransactionFee(double newTransactionFee){
        this.transactionFees.add(newTransactionFee);
    }
}
