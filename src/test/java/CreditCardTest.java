import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;
    @Before
    public void before(){
        creditCard = new CreditCard();
    }
    @Test
    public void totalChargesStartsEmpty(){
        assertEquals(0, creditCard.getTotalCharges().size());
    }

}
