package hw3.task2;

public class BadPupil extends Pupil {
    @Override
    void read() {
        System.out.println("Bad");
    }

    @Override
    void study() {
        System.out.println("Bad");
    }

    @Override
    void relax() {
        System.out.println("Good");
    }

    @Override
    void write() {
        System.out.println("Bad");
    }
}
