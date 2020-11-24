import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;
    LocalDate myDate;
    @Before
    public void before(){
        myDate = LocalDate.parse("2014-02-14");
        creditCard = new CreditCard(4444444444444444L, myDate, "Alan Johnson", "RBS", "Mastercard", 0.2, 1000);
    }
    @Test
    public void chargesStartsEmpty(){
        assertEquals(0, creditCard.getCharges().size());
    }
    @Test
    public void hasCardNumber(){
        assertEquals(4444444444444444L, creditCard.getCardNumber());
    }
    @Test
    public void canSetNumber(){
        creditCard.setCardNumber(5555555555555555L);
        assertEquals(5555555555555555L, creditCard.getCardNumber());
    }
    @Test
    public void hasExpiryDate(){
        assertEquals(myDate, creditCard.getExpiryDate());
    }
    @Test
    public void canSetExpiryDate(){
        myDate = LocalDate.parse("2025-09-01");
        creditCard.setExpiryDate(myDate);
        assertEquals(myDate, creditCard.getExpiryDate());
    }

}
