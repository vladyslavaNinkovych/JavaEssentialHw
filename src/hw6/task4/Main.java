package hw6.task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        System.out.println(numbers);

        ListIterator<Integer> listIterator = numbers.listIterator();

        while (listIterator.hasNext()){
          listIterator.set(listIterator.next()+1);
        }

        System.out.println(numbers);
    }
}
