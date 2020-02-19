package homework15022020;

import java.util.Scanner;

public class JavaProg14 {
    //main method
    public static void main(String[] args) {
        //variable with more than one digit seperated by comma
        int x,y, sum=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number:");
        x = scan.nextInt();
        while (x > 0) {
         y = x % 10;
         sum = sum + y;
         x = x / 10;
        }
        System.out.println("Sum of Digits of an Integer:" + sum);
    }
}
