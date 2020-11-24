import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    DebitCard debitCard;
    LocalDate myDate;
    @Before
    public void before(){
        myDate = LocalDate.parse("2014-02-14");
        debitCard = new DebitCard(4444444444444444L, myDate, "Alan Johnson", "RBS", "Mastercard", 441122, 12345678);
    }
    @Test
    public void chargesStartsEmpty(){
        assertEquals(0, debitCard.getCharges().size());
    }
    @Test
    public void hasCardNumber(){
        assertEquals(4444444444444444L, debitCard.getCardNumber());
    }
    @Test
    public void canSetNumber(){
        debitCard.setCardNumber(5555555555555555L);
        assertEquals(5555555555555555L, debitCard.getCardNumber());
    }
    @Test
    public void hasExpiryDate(){
        assertEquals(myDate, debitCard.getExpiryDate());
    }
    @Test
    public void canSetExpiryDate(){
        myDate = LocalDate.parse("2025-09-01");
        debitCard.setExpiryDate(myDate);
        assertEquals(myDate, debitCard.getExpiryDate());
    }
    @Test
    public void hasName(){
        assertEquals("Alan Johnson", debitCard.getName());
    }
    @Test
    public void canSetName(){
        debitCard.setName("Broke Bob");
        assertEquals("Broke Bob", debitCard.getName());
    }
    @Test
    public void hasBank(){
        assertEquals("RBS", debitCard.getBank());
    }
    @Test
    public void canSetBank(){
        debitCard.setBank("Halifax");
        assertEquals("Halifax", debitCard.getBank());
    }
    @Test
    public void hasProvider(){
        assertEquals("Mastercard", debitCard.getProvider());
    }
    @Test
    public void canSetProvider(){
        debitCard.setProvider("Visa");
        assertEquals("Visa", debitCard.getProvider());
    }
    @Test
    public void hasSortCode(){
        assertEquals(441122, debitCard.getSortCode());
    }
    @Test
    public void canSetSortCode(){
        debitCard.setSortCode(554433);
        assertEquals(554433, debitCard.getSortCode());
    }
    @Test
    public void hasAccountNumber(){
        assertEquals(12345678, debitCard.getAccountNumber());
    }
    @Test
    public void canSetAccountNumber(){
        debitCard.setAccountNumber(87654321);
        assertEquals(87654321, debitCard.getAccountNumber());
    }
    @Test
    public void canCalcTransactionFee(){
        assertEquals(40, debitCard.calcTransactionFee(200), 0.01);
    }
    @Test
    public void canCharge(){
        debitCard.charge(200);
        assertEquals(1, debitCard.getCharges().size());
    }

}
