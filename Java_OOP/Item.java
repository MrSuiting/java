package Java_OOP;

class Item {

    private static int counterId = 0;
    private final int id;
    private final String name;
    private final double price;
    private int rate;
    private int count;


    Item(String name, int price, int count) {
        counterId++;
        this.id = counterId;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public static int getCounterId() {
        return counterId;
    }

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    double getPrice() {
        return price;
    }

    int getRate() {
        return rate;
    }

    int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Item {" +
                "identif. = '" + this.id + "', " +
                "name = '" + this.name + "', " +
                "price = '" + this.price + "', " +
                "rate = '" + this.rate + "', " +
                "quant. = '" + this.count + '\'' +
                '}';
    }

    void saleItem(int count) {
        this.rate++;
        this.count -= count;
    }

}