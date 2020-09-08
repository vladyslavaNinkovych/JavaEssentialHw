package hw8;

public class Calculator {
    void add(int a, int b){
        System.out.println(a+b);
    }

    void sub(int a, int b){
        System.out.println(a-b);
    }

    void mul(int a, int b){
        System.out.println(a*b);
    }

    void div(int a, int b){
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }
    }
}
