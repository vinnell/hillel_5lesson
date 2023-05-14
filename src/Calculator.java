import java.util.Scanner;

public class Calculator {

    public static double Add(double x, double y) {
        return x+y;
    }
    public static double Remove(double x, double y) {
        return x-y;
    }
    public static double Multiply(double x, double y) {
        return x*y;
    }
    public static double Divide(double x, double y) {
        return x/y;
    }
    public static void main(String[] args) {
        Scanner value1 = new Scanner(System.in);
        System.out.println("Enter x: ");
        Scanner value2 = new Scanner(System.in);
        System.out.println("Enter y: ");
        double x = value1.nextDouble();
        double y = value2.nextDouble();
        double resultOfAdd = Calculator.Add(x,y);
        double resultOfRemove = Calculator.Remove(x,y);
        double resultOfMultiply = Calculator.Multiply(x,y);
        double resultOfDivide = Calculator.Divide(x,y);

        System.out.println("result Of Add = " + resultOfAdd);
        System.out.println("result Of Divide =  " + resultOfRemove);
        System.out.println("result Of Multiply = " + resultOfMultiply);
        System.out.println("result Of Divide = " + resultOfDivide);

    }
}

