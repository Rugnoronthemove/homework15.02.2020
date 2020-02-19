package homework15022020;

import java.util.Scanner;

public class JavaProg4 {

    //main method
    public static void main(String[] args) {

        //using scanner object
        Scanner scan = new Scanner(System.in);
        double b;
        double h;
        int x;
        System.out.println("Enter any value for base of the triangle b=");
        b = scan.nextDouble();
        System.out.println("Enter any value for height of the triangle h=");
        h = scan.nextDouble();
        System.out.println("Enter value of x=2");
        x = scan.nextInt();
        System.out.println("Area of Triangle =");
        areatriangle(b,h,x);
    }

    //calculate area of a triangle
    public static void areatriangle(double b, double h, int x) {
        double result =(b * h) / x;
        System.out.println(result);
    }
}
