public class Card {
    private int value;
    private String colour;

    /*    public Card(int value, String colour) {
            if (value < 1 || value > 9) {
                System.out.println("Nicht erlaubter Wert: " + value);
                return;
            }
            if (colour.equals("blue") || colour.equals("green") || colour.equals("red") || colour.equals("yellow")) {
                this.value = value;
                this.colour = colour;
            } else System.out.println("Nicht erlaubte Farbe: " + colour);
        }*/

    public Card(int value, String colour) {
        if (value < 1 || value > 9) {
            System.out.println("Nicht erlaubter Wert: " + value);
            return;
        }
        if (!(colour.equals("blue") || colour.equals("green") || colour.equals("red") || colour.equals("yellow"))) {
            System.out.println("Nicht erlaubte Farbe: " + colour);
            return;
        }
        this.value = value;
        this.colour = colour;
    }

    public int getValue() {
        return value;
    }

    public String getColour() {
        return colour;
    }

    public String toString() {
        return "Card{" +
                "value=" + value +
                ", colour='" + colour + '\'' +
                '}';
    }
}
