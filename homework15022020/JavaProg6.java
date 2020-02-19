package homework15022020;

import java.util.Scanner;

public class JavaProg6 {

    //main method
    public static void main(String[] args) {
        //using scanner object
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number for times table:");
        int n = s.nextInt();
        //creating a loop
        for (int y = 1; y <= 10; y++) {
            System.out.println(n + " * " + y + " = " + n * y);
        }

        //creating a second loop
        System.out.println("Enter next number:");
        int y = s.nextInt();
        int z;
        for (z = 1; z <= 10; z++) {
            System.out.println(y + "*" + z + "=" + y * z);
        }

    }
}
