package homework15022020;

import java.util.Scanner;

public class JavaProg13 {

    //main method
    public static void main(String[] args) {
        //using scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a decimal number: ");
        scan.nextDouble();
        System.out.println("Conversion to Binary number is: ");
        System.out.println(Integer.toBinaryString(15));

    }

}
