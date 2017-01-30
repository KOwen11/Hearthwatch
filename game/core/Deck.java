import java.util.*;

/**
 * Created by Kevin on 1/28/2017.
 */
public class Deck {
    private static List<Card> cards;
    private static int maxDeckSize;
    private static int deckSize;


    public static int getMaxDeckSize() {
        return maxDeckSize;
    }

    public static int getDeckSize(){
        return deckSize;
    }

    public static List<Card> getCards(){
        return cards;
    }

    public static void setCards(){

        cards.add(Card.newTracer());
        cards.add(Card.newTracer());
        cards.add(Card.newSoldier());
        cards.add(Card.newSoldier());
        cards.add(Card.newReaper());
        cards.add(Card.newReaper());
        cards.add(Card.newMei());
        cards.add(Card.newMei());
        cards.add(Card.newReinhardt());
        cards.add(Card.newReinhardt());
        cards.add(Card.newWinston());
        cards.add(Card.newWinston());
        cards.add(Card.newRoadhog());
        cards.add(Card.newRoadhog());
        cards.add(Card.newDva());
        cards.add(Card.newDva());
        cards.add(Card.newMercy());
        cards.add(Card.newMercy());
        cards.add(Card.newZenyatta());
        cards.add(Card.newZenyatta());
        cards.add(Card.newPharah());
        cards.add(Card.newPharah());
        cards.add(Card.newLucio());
        cards.add(Card.newLucio());
        cards.add(Card.newAna());
        cards.add(Card.newAna());
        cards.add(Card.newGenji());
        cards.add(Card.newGenji());
        cards.add(Card.newTracer());
        cards.add(Card.newSoldier());
    }

    public static void removeFromDeck(Card x){
        cards.add(x);
    }

    public static void addToDeck(Card x){
        cards.remove(x);
    }

    public static void shuffle(List<Card> x){
        long seed = System.nanoTime();
        Collections.shuffle(x, new Random(seed));
    }
/*
      public static Card[] newRandDeck(){
        Card[] deck = new Card[20];
            int z = 0;
            while(z < 20){
            double r = Math.random()*24;
            long y = Math.round(r);
            int x = (int) y;
            if (x != 0 && x != 24){
                deck[z] = new Card();
                deck[z].id = x;
                if (deck[z].id == 1){
                    deck[z] = HeroCard.newAna();
                    z = z + 1;
                }else if(deck[z].id == 2){
                    deck[z] = HeroCard.newBastion();
                    z = z + 1;
                }else if(deck[z].id == 3){
                    deck[z] = HeroCard.newDva();
                    z = z + 1;
                }else if(deck[z].id == 4){
                    deck[z] = HeroCard.newGenji();
                    z = z + 1;
                }else if(deck[z].id == 5){
                    deck[z] = HeroCard.newHanzo();
                    z = z + 1;
                }else if(deck[z].id == 6){
                    deck[z] = HeroCard.newJunkrat();
                    z = z + 1;
                }else if(deck[z].id == 7){
                    deck[z] = HeroCard.newLucio();
                    z = z + 1;
                }else if(deck[z].id == 8){
                    deck[z] = HeroCard.newMccree();
                    z = z + 1;
                }else if(deck[z].id == 9){
                    deck[z] = HeroCard.newMei();
                    z = z + 1;
                }else if(deck[z].id == 10){
                    deck[z] = HeroCard.newMercy();
                    z = z + 1;
                }else if(deck[z].id == 11){
                    deck[z] = HeroCard.newPharah();
                    z = z + 1;
                }else if(deck[z].id == 12){
                    deck[z] = HeroCard.newReaper();
                    z = z + 1;
                }else if(deck[z].id == 13){
                    deck[z] = HeroCard.newReinhardt();
                    z = z + 1;
                }else if(deck[z].id == 14){
                    deck[z] = HeroCard.newRoadhog();
                    z = z + 1;
                }else if(deck[z].id == 15){
                    deck[z] = HeroCard.newSoldier();
                    z = z + 1;
                }else if(deck[z].id == 16){
                    deck[z] = HeroCard.newSombra();
                    z = z + 1;
                }else if(deck[z].id == 17){
                    deck[z] = HeroCard.newSymmetra();
                    z = z + 1;
                }else if(deck[z].id == 18){
                    deck[z] = HeroCard.newTorbjorn();
                    z = z + 1;
                }else if(deck[z].id == 19){
                    deck[z] = HeroCard.newTracer();
                    z = z + 1;
                }else if(deck[z].id == 20){
                    deck[z] = HeroCard.newWidowmaker();
                    z = z + 1;
                }else if(deck[z].id == 21){
                    deck[z] = HeroCard.newWinston();
                    z = z + 1;
                }else if(deck[z].id == 22){
                    deck[z] = HeroCard.newZarya();
                    z = z + 1;
                }else if(deck[z].id == 23){
                    deck[z] = HeroCard.newZenyatta();
                    z = z + 1;
                }
            }else {
                z = z;
            }
        }
        return deck;

        int cardTest = 0;
        while(cardTest < 20){
            System.out.println("Slot " + (cardTest+1) + ":");
            System.out.println("Name: " + deck[cardTest].name);
            System.out.println("HP: " + deck[cardTest].hp);
            System.out.println("Attack: " + deck[cardTest].dmg);
            System.out.println("Ability: " + deck[cardTest].abilityName);
            System.out.println();
            cardTest = cardTest + 1;
        }

    }
*/



}
