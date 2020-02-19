package homework15022020;

import java.util.Scanner;

public class JavaProg9 {

    //main method
    public static void main(String[] args) {

        //using scanner object
        double a;
        double b;
        double c;
        int d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numerical value for a=");
        a = scan.nextDouble();
        System.out.println("Enter a numerical value for b=");
        b = scan.nextDouble();
        System.out.println("Enter a numerical value for c=");
        c = scan.nextDouble();
        System.out.println("Enter value for d=3");
        d = scan.nextInt();
        System.out.println("Calculate and print the average of three numbers:");
        average(a,d,c,d);

    }
    public static void average(double a, double b, double c,int d) {
        double result = (a + b + c) / d;
        System.out.println(result);
    }
}
