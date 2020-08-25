package hw3;

public class Main {
    public static void main(String[] args) {
        String value = "3";
        Printer printer = new Printer();
        RedPrinter redPrinter = new RedPrinter();
        printer.print(value);
        redPrinter.print(value);
    }
}
