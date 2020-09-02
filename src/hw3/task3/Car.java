package hw3.task3;

public class Car extends Vehicle {
    public Car(){
        super(600.00, 200,1);
    }

    @Override
    void getInfo() {
        System.out.println("CAR INFO");
        super.getInfo();
    }
}
