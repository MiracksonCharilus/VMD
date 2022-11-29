public class Item {
    private String name;
    private int itemId;
    private double price;
    private double discountPercent;
    private double discountFlat;
    private int quantity;

    public Item(){

    }

    public Item(String name, int itemId, double price, double discountPercent, double discountFlat, int quantity) {
        this.name = name;
        this.itemId = itemId;
        this.price = price;
        this.discountPercent = discountPercent;
        this.discountFlat = discountFlat;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public double getDiscountFlat() {
        return discountFlat;
    }

    public void setDiscountFlat(double discountFlat) {
        this.discountFlat = discountFlat;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
