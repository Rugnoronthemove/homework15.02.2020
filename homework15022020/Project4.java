package homework15022020;

public class Project4 {
    //instance variable x2
    double a = 1.1;
    float b = 1.01f;

    //static variable x2
    static double c = 10.1;
    static float d = 10.01f;

    //main method
    public static void main(String[] args) {
        //calling static method directly
        stat();
        //calling instance method using object creation
        Project4 ins = new Project4();
        ins.instance();
    }

    //instance method
    public void instance() {
        //calling instance variable directly
        double result = a+b;
        System.out.println(result);
        //calling static variable using class
        //Project4 c;
        //Project4 d;
        double result1 = (c-d);
        System.out.println(result1);
    }

    //static method
    public static void stat() {
        //calling static variable directly
        System.out.println(c);
        System.out.println(d);
        double result2 = (c * d);
        System.out.println(result2);
        //calling instance variable using object creation
        Project4 inst = new Project4();
        System.out.println(inst.a);
        System.out.println(inst.b);
        double result3 = (inst.a / inst.b);
        System.out.println(result3);
    }
}
