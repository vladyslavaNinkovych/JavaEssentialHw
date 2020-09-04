package hw5;

public class Main {
    public static void main(String[] args) {
        Device device = new Device();
        Device device1 = new Monitor(234, 345);
        Device device2 = new Monitor(22, 34);
        Monitor monitor = new Monitor(234,345);
        EthernetAdepter ethernetAdepter = new EthernetAdepter(300, "mac");

        System.out.println(device.toString() + "\n" + monitor.toString() + "\n" + ethernetAdepter.toString());
        System.out.println(device.equals(device1));
        System.out.println(monitor.equals(device1));
        System.out.println(monitor.equals(device2));

    }
}
