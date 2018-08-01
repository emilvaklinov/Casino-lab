public enum SuitType {
    SPADE(3, "Spade"),
    HEART(2, "Heart"),
    DIAMOND(1, "Diamond"),
    CLUB(0, "Club");

    private final int rank;
    private final String name;

    SuitType(int rank, String name){
        this.rank = rank;
        this.name = name;
    }

    //METHOD GETTER
    // RETURN RANK as an integer
    public int getRank(){
        return this.rank;
    }

    //METHOD GETTER
    // RETURN STRING name
    public String getName(){
       return this.name;
    }


}
