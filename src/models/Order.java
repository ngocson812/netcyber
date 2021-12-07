package models;

public class Order {
    private String name;
    private int price;

    public Order(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public static final Order[] orders = {
            new Order("Sting", 10000), new Order("Coca", 10000), new Order("Bò húc", 20000), new Order("Vinataba", 20000), new Order("555", 50000), new Order("Marlboro", 3000)
    };
}
