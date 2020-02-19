package homework15022020;

public class Project1 {

    //instance variable x2
    int a = 10;
    int b = 20;

    //main method
    public static void main(String[] args) {
        //creating object to call instance method
        Project1 inst = new Project1();
        inst.instance();

    }

    //instance method
    public void instance() {
        //calling instance variable x2
        int result = a+b;
        System.out.println(result);

    }
}
