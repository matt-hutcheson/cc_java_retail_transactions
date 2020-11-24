import org.junit.Before;
import org.junit.Test;

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
        ICharge giftCard = new GiftCard(200, "John Lewis")
        onlineAccount.addPaymentMethod(giftCard);
        assertEquals(1, onlineAccount.getPaymentMethods().size());
    }
}
