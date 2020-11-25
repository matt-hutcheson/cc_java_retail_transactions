import org.junit.Before;
import org.junit.Test;

import javax.smartcardio.Card;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {
    OnlineAccount onlineAccount;

    @Before
    public void before(){
        onlineAccount = new OnlineAccount();
    }

    @Test
    public void paymentMethodsStartEmpty(){
        assertEquals(0, onlineAccount.getPaymentMethods().size());
    }
    @Test
    public void transactionFeesStartsEmpty(){
        assertEquals(0, onlineAccount.getTransactionFees().size());
    }
    @Test
    public void canAddPaymentMethod(){
        ICharge giftCard = new GiftCard(200, "John Lewis");
        onlineAccount.addPaymentMethod(giftCard);
        assertEquals(1, onlineAccount.getPaymentMethods().size());
    }
    @Test
    public void canAddTransactionFee(){
        onlineAccount.addTransactionFee(80);
        assertEquals(1, onlineAccount.getTransactionFees().size());
    }
    @Test
    public void canChargeCard(){
        LocalDate myDate = LocalDate.parse("2014-02-14");
        ICharge debitCard = new DebitCard(3333333333333333L, myDate, "Alan Johnson", "RBS", "Visa", 440022, 87654321);
        onlineAccount.addPaymentMethod(debitCard);
        onlineAccount.charge(40, debitCard);
        assertEquals(1, onlineAccount.getPaymentMethods().size());
        assertEquals(1, onlineAccount.getTransactionFees().size());
        assertEquals(8, onlineAccount.getTransactionFees().get(0), 0.01);
    }
}
