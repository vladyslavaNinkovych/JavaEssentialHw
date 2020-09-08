package hw8;

public class Calculator {
    int add(int a, int b){
        return a+b;
    }

    int sub(int a, int b){
        return a-b;
    }

    int mul(int a, int b){
        return a*b;
    }

    int div(int a, int b){
        try {
            return a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            return -1;
        }
    }
}
