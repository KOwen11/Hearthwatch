import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Kevin on 1/28/2017.
 */
public class Player {
    private static List<Card> playerDeckList;
    private static Deck playerDeck;
    private static Hand playerHand;
    private static String name;
    private static int hp;

    public static void setHp(){
        hp = 30;
    }
    
    public static Card getCard(Card x){
        return playerDeckList.get(x);
    }
    
    public static List<Card> getPlayerDeckList(){
        List<Card> x = playerDeck.getCards();
        return x;
    }

    public static void reduceHp(int x){
        hp = hp - x;
    }

    public static void addHp(int x){
        hp = hp + x;
    }

    public static void setName(String x){
        name = x;
    }
    public static String getName(){
        return name;
    }
    public static void shuffle(List<Card> x){
        Deck.shuffle(x);
    }
    public static void setPlayerDeck(){
        playerDeck.setCards();
    }

    public static Deck getPlayerDeck(){
        return playerDeck;
    }

    public static String draw(){
        if (playerDeck.getDeckSize() == 0){
            reduceHp(1);
        }
        Card x = playerDeck.getCards().get(0);

        if (Hand.isHandFull() == false){
            Hand.addToHand(x);
        }
        Deck.removeFromDeck(x);
        return x.name;
    }

    public static Player newPlayer(){
        Player x = new Player();
        return x;
    }
}
