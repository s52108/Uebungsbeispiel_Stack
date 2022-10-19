public class DemoApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Card card = new Card(5, "red");

        System.out.println(card.toString());

        Card[] array = new Card[3];
        CardStack cardStack = new CardStack(array);

        cardStack.push(new Card(3, "yellow"));
        cardStack.push(card);
        cardStack.push(new Card(7, "green"));

        Card c1 = cardStack.pop();
        System.out.println("c1 = " + c1);


    }
}
