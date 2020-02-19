package homework15022020;

import java.util.Scanner;

public class JavaProg2 {

    //main method
    public static void main(String[] args) {

        //using scanner object
        Scanner scan = new Scanner(System.in);
        double r;
        double pi;
        System.out.println("Enter any radius value of r");
        r = scan.nextDouble();
        System.out.println("Enter value of pi=3.14");
        pi = scan.nextDouble();
        System.out.println("Area of a Circle =");
        areacircle(r, pi);

        //object creation for calling instance method
        JavaProg2 cal = new JavaProg2();
        System.out.println("Radius of the Circle =");
        cal.radius(r);
    }

    //enter radius value of a circle
    public void radius(double r) {
        System.out.println(r);
    }

    //calculate area of a circle
    public static void areacircle(double r, double pi) {
        double result = (pi * r * r);
        System.out.println(result);
    }

}
