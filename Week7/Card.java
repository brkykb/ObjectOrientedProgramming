public class Card {

        Suit suit;
        Rank rank;
        int R;

        public enum Suit{
            DIAMOND,CLUB,HEART,SPADE;
        }

        public enum Rank{
            ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;

        }




    Card(Suit suit, Rank rank) {// constructor
        this.suit = suit;
        this.rank = rank;

    }

        public Suit getSuit(Suit suit){
            return suit;
        }

        public Rank getRank(Rank rank){
            return rank;
        }

        public int getValue(Rank rank){
            return R;
        }

        public String toString(){
            return "Rank:"+rank +"Suit:"+suit;
        }


    public static void main(String args[]) {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                System.out.println("SUIT: " + s+ " RANK: " + r);

            }
        }
    }
}
