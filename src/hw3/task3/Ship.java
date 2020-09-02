package hw3.task3;

public class Ship extends Vehicle{
    String port;
    int passengersNumber;

    public Ship (String port, int passengersNumber){
        super(900.00, 70,16);
        this.port = port;
        this.passengersNumber = passengersNumber;
    }

    @Override
    void getInfo() {
        System.out.println("SHIP INFO");
        super.getInfo();
        System.out.println("port: " + port);
        System.out.println("passengersNumber: " + passengersNumber);
    }
}
