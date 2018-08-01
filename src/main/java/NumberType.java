public enum NumberType {
    ACE(0),
    TWO(1),
    THREE(2),
    FOUR(3),
    FIVE(4),
    SIX(5),
    SEVEN(6),
    EIGHT(7),
    NINE(8),
    TEN(9),
    JACK(10),
    QUEEN(11),
    KING(12);



    private final int rank;

    NumberType(int rank) {
        this.rank = rank;
    }


    // METHOD GETTER FOR CARD NUMBER RANK
    // RETURNS INTEGER for the rank
    public int getRank(){
        return this.rank;
    }
}
