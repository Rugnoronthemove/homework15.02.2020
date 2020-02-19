package homework15022020;

public class Project3 {

    //instance variable
    String name = "Hemal";
    //static variable
    static int age = 35;

    //main method
    public static void main(String[] args) {

        //creation of object for calling instance method in static space
        Project3 inst = new Project3();
        //calling instance method with use of object that is created in earlier step
        inst.instance();

        //calling static method direclty to main method(static space)
        stat();

    }

    //instance method
    public void instance() {
        //calling instance variable directly
        //name = "Hemal";
        System.out.println(name);

        //calling static variable using class
        //Project3 age;
        System.out.println(age);

    }

    //static method
    public static void stat() {
        //calling static variable directly
        System.out.println(age);

        //calling instance variable using object creation
        Project3 name = new Project3();
        System.out.println(name.name);
    }
}

