package homework15022020;

public class JavaProg11 {

    //main method
    public static void main(String[] args) {
        float a = 1.2f;
        float b = 2.4f;
        System.out.println("----Before Swap-----"  );
        System.out.println("Enter first number:"+a );
        System.out.println("Enter second number:"+b);

        a = a-b;
        b = a+b;
        a = b-a;

        System.out.println("-------After Swap------");
        System.out.println("Enter first number:"+a);
        System.out.println("Enter second number:"+b);
    }

}
