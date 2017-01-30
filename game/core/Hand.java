/**
 * Created by Kevin on 1/28/2017.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
    private static List<Card> cards;
    private static int handSize;
    private static int handMax;


    static{
        handSize = cards.size();
        handMax = 6;
    }

    public static boolean isHandFull(){
        if (handSize >= handMax) {
            return true;
        }else{
            return false;
        }
    }

    public static List<Card> getCardList(){
        return cards;
    }

    public static int getHandSize(){
        return handSize;
    }

    public static void addToHand(Card x){
        cards.add(x);
    }

    public static void removeFromHand(Card x){
        cards.remove(x);
    }
}
