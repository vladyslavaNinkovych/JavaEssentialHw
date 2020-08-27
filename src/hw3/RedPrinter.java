package hw3;

public class RedPrinter extends Printer{
    @Override
    void print(String value){
        System.out.print((char) 27 + "[36m" + value);
    }
}
