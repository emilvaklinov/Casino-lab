import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    Card aceOfDiamonds;

    @Before
    public void before(){
        aceOfDiamonds = new Card(SuitType.DIAMOND, NumberType.ACE);
    }

//    test if a card has a number i.e. ACE, TWO, THREE
   @Test
    public void hasThisCardHasNumber(){
        assertEquals( NumberType.ACE, aceOfDiamonds.getNumber());
   }

    @Test
    public void getDeck(){
        assertEquals(52, Deck.getDeck().size());
    }

}
