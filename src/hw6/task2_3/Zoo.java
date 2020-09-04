package hw6.task2_3;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Elephant");
        animals.add("Fox");
        animals.add("Rabbit");
        animals.add("Horse");
        animals.add("Wolf");
        animals.add("Snake");
        animals.add("Dog");
        animals.add("Cat");

        System.out.println(animals);

        // Task 3
        animals.remove(7);
        animals.remove(5);
        animals.remove(3);

        System.out.println("size: " + animals.size());
    }
}
