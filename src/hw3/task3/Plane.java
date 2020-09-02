package hw3.task3;

public class Plane extends Vehicle{
    int hight;
    int passengersNumber;

    public Plane (int hight, int passengersNumber){
        super(1000.00, 230,3);
        this.hight = hight;
        this.passengersNumber = passengersNumber;
    }

    @Override
    void getInfo() {
        System.out.println("PLANE INFO");
        super.getInfo();
        System.out.println("hight: " + hight);
        System.out.println("passengersNumber: " + passengersNumber);
    }
}
