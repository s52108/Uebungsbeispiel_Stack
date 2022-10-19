public class OrderLine {

    private String name;
    private double price;
    private int amount;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }

    public OrderLine(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public double getCosts() {
        return price * amount;
    }


    @Override
    public String toString() {
        return "OrderLine{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
