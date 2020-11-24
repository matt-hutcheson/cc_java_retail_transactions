import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {
    GiftCard giftCard;
    @Before
    public void before(){
        giftCard = new GiftCard(100, "John Lewis");
    }
    @Test
    public void chargesStartsEmpty(){
        assertEquals(0, giftCard.getCharges().size());
    }
    @Test
    public void hasBalance(){
        assertEquals(100, giftCard.getBalance(), 0.01);
    }
    @Test
    public void canSetBalance(){
        giftCard.setBalance(150);
        assertEquals(150, giftCard.getBalance(), 0.01);
    }
    @Test
    public void hasStoreName(){
        assertEquals("John Lewis", giftCard.getStoreName());
    }
    @Test
    public void canSetStoreName(){
        giftCard.setStoreName("Jenners");
        assertEquals("Jenners", giftCard.getStoreName());
    }
    @Test
    public void canCharge(){
        giftCard.charge(20);
        assertEquals(1, giftCard.getCharges().size());
    }
    @Test
    public void canCalcTransactionFee(){
        assertEquals(0, giftCard.calcTransactionFee(150), 0.01);
    }

}
