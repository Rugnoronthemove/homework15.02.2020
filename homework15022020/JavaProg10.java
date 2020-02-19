package homework15022020;

import java.util.Scanner;

public class JavaProg10 {
    //instance variable
    double w = 5.5;
    double l = 8.5;

    //main method
    public static void main(String[] args) {
        //using scanner object
        double w;
        double l;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value for width=");
        w = scan.nextDouble();
        System.out.println("Enter value for lenght=");
        l = scan.nextDouble();
        System.out.println("Area of Rectangle=" + w * l);
        System.out.println("Perimeter of Rectangle=" + 2 * (w + l));

        //printing expected output
        System.out.println("Test Data:");
        System.out.println("Width=5.5 Height=8.5");
        System.out.println("Expected Output:");
        System.out.println("Area is 5.5 * 8.5 = 46.75");
        System.out.println("Perimeter is 2 * (5.5 + 8.5) = 28");

        //printing using calling methods
        arearectangle(w, l);
        JavaProg10 peri = new JavaProg10();
        peri.perimeterrectangle();
    }

    //static method
    public static void arearectangle(double w, double l) {
        JavaProg10 var = new JavaProg10();
        double area = (var.w * var.l);
        System.out.print("5.5 * 8.5 =");
        System.out.print(area);
    }

    //instance method
    public void perimeterrectangle() {
        double perimeter = 2 * (w + l);
        System.out.println("");
        System.out.print("2 * (5.5 + 8.5) =");
        System.out.print(perimeter);
    }
}
