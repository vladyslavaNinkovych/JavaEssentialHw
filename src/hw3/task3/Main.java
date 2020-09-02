package hw3.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane(2,3);
        Vehicle ship = new Ship("Port", 7);
        Vehicle car = new Car();
        ship.getInfo();
        plane.getInfo();
        car.getInfo();
    }
}
