public class Card {

    private String name;
    private String suit;
    private int value = 0;

    public Card(String name, String suit) {
        this.name = name;
        this.suit = suit;
        this.value = cardValue(this.name);
    }

    public String getCardName(){
        return this.name;
    }

    public String getCardSuit(){
        return this.suit;
    }

    public int getCardValue(){
        return this.value;
    }

    //Method to take in a string of what our card is and return the value of that card.
    public int cardValue(String cardName){
        int value = 999;
        switch(cardName){
            case "Ace": value = 1; break;
            case "Two": value = 2; break;
            case "Three": value = 3; break;
            case "Four": value = 4; break;
            case "Five": value = 5; break;
            case "Six": value = 6; break;
            case "Seven": value = 7; break;
            case "Eight": value = 8; break;
            case "Nine": value = 9; break;
            case "Ten": value = 10; break;
            case "Jack": value = 10; break;
            case "Queen": value = 10; break;
            case "King": value = 10; break;
        }
        //If our starting value is not between 1-10 then there is an error and close.
        if(value > 10 || value < 1){
            System.out.println("Invalid card number, exiting.");
            System.exit(0);
        }
        return value;
    }
}
