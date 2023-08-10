import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> myDeck = new ArrayList<Card>();
    private static final String[] suit = new String[] {"Clubs", "Spades", "Hearts", "Diamonds"};
    private static final String[] name = new String[] {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                                          "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    //Initializes our original deck with 52 cards, and then shuffles them.
    public void initalizeDeck() {

        for (String suits : suit) {
            for (String names : name) {
                Card currentCard = new Card(names, suits);
                myDeck.add(currentCard);
            }
        }
        Collections.shuffle(myDeck);
    }

    //Refreshes our deck, and removes what would be any duplicate cards before shuffling.
    public void shuffleDeck(ArrayList<Card> deck){
        for (String suits : suit) {
            for (String names : name) {
                Card currentCard = new Card(names, suits);
                myDeck.add(currentCard);
            }
        }
        //Removing what would be duplicate cards in our deck.
        for(int i = 0; i < deck.size(); i++) {
            if (myDeck.contains(deck.get(i))) {
                myDeck.remove(deck.get(i));
            }
        }
        //Shuffle, then add the remaining cards from our old deck to the front of the new deck.
        Collections.shuffle(myDeck);
        for(int i = deck.size() - 1; i >= 0; i--){
            myDeck.add(0, deck.get(i));
        }
    }

    public ArrayList<Card> getDeck(){
        return myDeck;
    }
}
