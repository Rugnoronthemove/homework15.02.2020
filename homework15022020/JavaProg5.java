package homework15022020;

import java.util.Scanner;

public class JavaProg5 {

    //main method
    public static void main(String[] args) {
        //using scanner object
        String text;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any text in upper case:");
        text = scan.next();
        System.out.println("Upper case text converted to Lower case:");
        uppertolower(text);
    }

    //static method
    public static void uppertolower(String text) {
        System.out.println(text.toLowerCase());
    }
}


