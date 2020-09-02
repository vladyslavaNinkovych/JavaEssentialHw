package hw3.task3;

public class Vehicle {
    Double price;
    int speed;
    int year;

    public Vehicle(){
    };

    public Vehicle(Double price, int speed, int year){
        this.price = price;
        this.speed = speed;
        this.year = year;
    };

    void getInfo(){
        System.out.println("price: "+ price);
        System.out.println("speed: " + speed);
        System.out.println("year: " + year);
    }
}
