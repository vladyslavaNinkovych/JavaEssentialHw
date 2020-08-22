package hw1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setCounry("Ukraine");
        adress.setCity("Kyiv");
        adress.setIndex(1010101);
        adress.setStreet("Test");
        adress.setHouse(23);
        adress.setApartment(44);

        System.out.println(
                adress.getCounry() + ", "
                        + adress.getCity() + ", "
                        + adress.getIndex() + ", "
                        + adress.getStreet() + ", "
                        + adress.getHouse() + ", "
                        + adress.getApartment()
        );

        // Task 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rectangle sides:");
        Rectangle rectangle = new Rectangle();
        rectangle.side1 = sc.nextDouble();
        rectangle.side2 = sc.nextDouble();

        System.out.println("Area: " + rectangle.areaCalculator()
                + ", perimeter: " + rectangle.perimeterCalculator()
        );

        // Task 4
        Computer[] computers = new Computer[5];

        for (int i = 0; i < computers.length; i++) {
            computers[i] = new Computer("comp"+i , 22+i);
        }

        for (Computer computer : computers) {
            System.out.println("name: " + computer.name + " price: " + computer.price);
        }
    }
}
