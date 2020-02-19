package homework15022020;

public class Project2 {
    //static variable x2
    static int a = 123;
    static int b = 234;

    //main method
    public static void main(String[] args) {
        //calling static method
        stat();

    }

    //static method calling static variables x 2
    public static void stat() {
        int c = a + b;
        System.out.println(c);

    }

}
