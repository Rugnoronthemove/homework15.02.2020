package homework15022020;

import java.util.Scanner;

public class JavaProg8 {
    //main method
    public static void main(String[] args) {
        //using scanner object
        double a;
        double b;
        double c;
        double d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a=25.5");
        a = scan.nextDouble();
        System.out.println("Enter value of b=3.5");
        b = scan.nextDouble();
        System.out.println("Enter value of c=40.5");
        c = scan.nextDouble();
        System.out.println("Enter value of d=4.5");
        d = scan.nextDouble();
        System.out.println("Computing the below expression:");
        System.out.println("((25.5*3.5-3.5*3.5)/(40.5-4.5))=");
        expression(a, b, c, d);

    }

    //static method
    public static void expression(double a, double b, double c, double d) {
        double result = ((a * b - b * b) / (c - d));
        System.out.println(result);
    }

}
