package homework15022020;

import java.util.Scanner;

public class JavaProg1 {
    //calculator
    //int a = 1;
    //int b = 2;
    //int c = 3;
    //int d = 4;
    //main method
    public static void main(String[] args) {
        //using scanner object
        int a;
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = scan.nextInt();
        System.out.println("Enter second number:");
        b = scan.nextInt();

        JavaProg1 add = new JavaProg1();
        System.out.println("Addition:");
        add.addition(a,b);
        System.out.println("Subtraction:");
        add.subtraction(a,b);
        System.out.println("Multiplication:");
        multiplication(a,b);
        System.out.println("Divison:");
        division(a,b);
    }

    //instance method
    public void addition(int a, int b) {
    int result = a + b;
    System.out.println(result);
    }

    //instance method
    public void subtraction(int a, int b) {
        int result1 = a - b;
        System.out.println(result1);
    }

    //static method
    public static void multiplication(int a, int b) {
        //JavaProg1 cal = new JavaProg1();
        int result2 = a * b;
        System.out.println(result2);
    }

    //static method
    public static void division(int a, int b) {
        //JavaProg1 cal = new JavaProg1();
        int result3 = a / b;
        System.out.println(result3);
    }
}
