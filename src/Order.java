import java.util.Arrays;

public class Order {
    private String number;
    private OrderLine[] arrayOfOrderline;

    public String getNumber() {
        return number;
    }

    public OrderLine[] getArrayOfOrderline() {
        return arrayOfOrderline;
    }

    public Order(String number, OrderLine[] arraayOfOrderline) {
        this.number = number;
        this.arrayOfOrderline = arraayOfOrderline;
    }

    public void printBestellung() {

        System.out.println("order has " + arrayOfOrderline.length + " lines.");
        for (int i = 0; i < arrayOfOrderline.length; i++) {
            System.out.println(arrayOfOrderline[i].toString());

        }
    }

    public double getCosts() {

        double costs = 0;
        for (int i = 0; i < arrayOfOrderline.length; i++) {
            costs = costs + arrayOfOrderline[i].getCosts();

        }
        return costs;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", arraayOfOrderline=" + Arrays.toString(arrayOfOrderline) +
                '}';
    }
}
