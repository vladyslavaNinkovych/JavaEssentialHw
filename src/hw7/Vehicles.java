package hw7;

public enum Vehicles {
    CAR(100, "yellow"), PLANE(200, "black"), TRAIN(400, "red"), BOAT(500, "green");

    private int price;
    private String colour;

    Vehicles(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "price=" + price +
                ", colour='" + colour + '\'' +
                '}';
    }
}
