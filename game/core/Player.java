/**
 * Created by Kevin on 1/28/2017.
 */
public class Player {
    private static Card[] myDeck;
    private static Card[] myHand;
    private static Card draw;
    private static Card rndFromMyDeck;

    static {
        myDeck = Deck.newDeck();
        draw = Deck.drawCard();
        rndFromMyDeck = getRndCardFromDeck(5);
    }

    public static Card getRndCardFromDeck(int x){
        return myDeck[x];
    }

    public static Card addCard(){
        return null;
    }

    public static Card[] getMyDeck(){
        return myDeck;
    }

}
