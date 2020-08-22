package hw1;

public class Rectangle {
    double side1;
    double side2;

    public double areaCalculator() {
        return this.side1 * this.side2;
    }

    public double perimeterCalculator() {
        return 2 * (this.side1 + this.side2);
    }
}
