package homework15022020;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class JavaProg3 {

    //main method
    public static void main(String[] args) {

        //using scanner object
        Scanner scan = new Scanner(System.in);
        double a;
        int b;
        int c;
        int d;
        System.out.println("Enter any temperature value in fahrenheit °F=");
        a = scan.nextDouble();
        System.out.println("Enter value of b=32");
        b = scan.nextInt();
        System.out.println("Enter value of c=5");
        c = scan.nextInt();
        System.out.println("Enter value of d=9");
        d = scan.nextInt();
        System.out.println("Temperature value converted to celsius °C=");
        celsius(a, b, c, d);

        //object creation for calling instance method
        JavaProg3 cal = new JavaProg3();
        System.out.println("Temperature value in Fahrenheit °F=");
        cal.fahrenheit(a);
    }

    //enter temp value in degree Fahrenheit
    public void fahrenheit(double a) {
        System.out.println(a);
    }

    //convert any temp value into degree Celsius
    public static void celsius(double a, int b, int c, int d) {
        double result = (a - b) * c / d;
        System.out.println(result);
    }
}
