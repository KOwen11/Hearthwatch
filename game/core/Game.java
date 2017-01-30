/**
 * Created by Kevin on 1/29/2017.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Game {
    private static String state; //none, start turn, draw, play, end turn



    public static void main(String[] args){
        Player players = new Player();
        players.setHp();
        players.setName("testName");
        players.setPlayerDeck();
        players.setPlayerDeckList();
        System.out.println(players.getName());



        System.out.println(players.getName() + "'s pre-shuffled deck: ");
        int p1i = 0;
        while (p1i < 30){
            Card testCard = players.getCard(p1i);
            String testVar = testCard.name;
            System.out.println(testVar);
            p1i = p1i + 1;
        }

        players.shuffle(players.getPlayerDeck().getCards());
        System.out.println(players.getName() + "'s post-shuffled deck: ");
        int p2i = 0;
        while (p2i < Deck.getMaxDeckSize()){
            System.out.println(players.getPlayerDeck().getCards().get(p2i));
            p2i = p2i + 1;
        }
    }

}
