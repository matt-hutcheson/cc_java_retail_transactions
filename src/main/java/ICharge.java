public interface ICharge {
    double calcTransactionFee(double cost);
    void charge(double newCharge);
}
