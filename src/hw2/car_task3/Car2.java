package hw2.car_task3;

public class Car2 {
    int year;
    double speed;
    int weight;
    String color;

    public Car2() {

    }

    public Car2(int year) {
        this.year = year;
    }

    public Car2(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car2(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }

    public Car2(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }

}
