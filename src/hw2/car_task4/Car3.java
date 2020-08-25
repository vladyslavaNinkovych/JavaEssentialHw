package hw2.car_task4;

public class Car3 {
    int year;
    double speed;
    int weight;
    String color;

    public Car3() {
    }

    public Car3(int year) {
        this.year = year;
    }

    public Car3(int year, double speed) {
        this(year);
        this.speed = speed;
    }

    public Car3(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }

    public Car3(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }

}
