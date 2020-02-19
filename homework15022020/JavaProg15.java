package homework15022020;

import java.util.Scanner;

public class JavaProg15 {

    //main method
    public static void main(String[] args) {
        //using scanner object
        String text;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the following string in uppercase:");
        System.out.println(">THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG<");
        text = scan.next();
        System.out.println("Expected Output in all lowercase:");
        uppertolower();
    }

    //static method
    public static void uppertolower() {
        String text = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        System.out.println(text.toLowerCase());
    }

}
