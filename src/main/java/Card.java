import java.util.ArrayList;

public class Card {
    private SuitType suit;
    private NumberType number;

    public Card(SuitType suit, NumberType number){
        this.suit = suit;
        this.number = number;
    }

    //METHOD GETTER FOR number
    public NumberType getNumber() {
        return this.number;
    }

//    Mothod getter for suit
    public SuitType getSuit(){
        return this.suit;
    }

}

