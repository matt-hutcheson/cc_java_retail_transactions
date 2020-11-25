import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;
    LocalDate myDate;
    @Before
    public void before(){
        creditCard = new CreditCard("4444444444444444", "12/25", "Alan Johnson", "RBS", "Mastercard", 0.2, 1000);
    }
    @Test
    public void chargesStartsEmpty(){
        assertEquals(0, creditCard.getCharges().size());
    }
    @Test
    public void hasCardNumber(){
        assertEquals("4444444444444444", creditCard.getCardNumber());
    }
    @Test
    public void canSetNumber(){
        creditCard.setCardNumber("5555555555555555");
        assertEquals("5555555555555555", creditCard.getCardNumber());
    }
    @Test
    public void hasExpiryDate(){
        assertEquals("12/25", creditCard.getExpiryDate());
    }
    @Test
    public void canSetExpiryDate(){
        creditCard.setExpiryDate("11/25");
        assertEquals("11/25", creditCard.getExpiryDate());
    }
    @Test
    public void hasName(){
        assertEquals("Alan Johnson", creditCard.getName());
    }
    @Test
    public void canSetName(){
        creditCard.setName("Broke Bob");
        assertEquals("Broke Bob", creditCard.getName());
    }
    @Test
    public void hasBank(){
        assertEquals("RBS", creditCard.getBank());
    }
    @Test
    public void canSetBank(){
        creditCard.setBank("Halifax");
        assertEquals("Halifax", creditCard.getBank());
    }
    @Test
    public void hasProvider(){
        assertEquals("Mastercard", creditCard.getProvider());
    }
    @Test
    public void canSetProvider(){
        creditCard.setProvider("Visa");
        assertEquals("Visa", creditCard.getProvider());
    }
    @Test
    public void hasRiskMultiplier(){
        assertEquals(0.2, creditCard.getRiskMultiplier(), 0.01);
    }
    @Test
    public void canSetRiskMultiplier(){
        creditCard.setRiskMultiplier(0.4);
        assertEquals(0.4, creditCard.getRiskMultiplier(), 0.01);
    }
    @Test
    public void hasCreditLimit(){
        assertEquals(1000, creditCard.getCreditLimit(), 0.01);
    }
    @Test
    public void canSetCreditLimit(){
        creditCard.setCreditLimit(2000);
        assertEquals(2000, creditCard.getCreditLimit(), 0.01);
    }
    @Test
    public void canCalcTransactionFee(){
        assertEquals(80, creditCard.calcTransactionFee(200), 0.01);
    }
    @Test
    public void canCharge(){
        creditCard.charge(200);
        assertEquals(1, creditCard.getCharges().size());
    }

}
