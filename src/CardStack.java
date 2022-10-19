public class CardStack {
    private Card[] cards;
    private int counter;

    public CardStack(Card[] cards) {
        this.cards = cards;
        this.counter = -1;
        //counter = -1;
    }

    public void push(Card newElement) {
        if (cards.length > counter + 1) {
            counter++;
            cards[counter] = newElement;
        } else System.out.println("Stack ist voll: " + newElement);
    }

    public Card pop() {
        Card result = cards[counter];
        if (counter >= 0) {
            counter--;
            return result;
        }
        else System.out.println("Stack ist bereits leer");
        return null;
    }
}
