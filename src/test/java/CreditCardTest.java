import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;
    @Before
    public void before(){
        LocalDate myDate =LocalDate.parse("2014-02-14");
        creditCard = new CreditCard(4444444444444444L, myDate, "Alan Johnson", "RBS", "Mastercard", 0.2, 1000);
    }
    @Test
    public void totalChargesStartsEmpty(){
        assertEquals(0, creditCard.getTotalCharges().size());
    }

}
