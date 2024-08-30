package oOps.staticKeyword;


public class StaticLab {
    // Static
    // block
    // Data member
    // Function
    // Class

    public static void main(String[] args) {
        ATB a1 = new ATB("amit");
        ATB.doAssignment();  //static member is called by its classsname. We do not need to create an object for static members.
        System.out.println(ATB.courseName);
    }
}


class ATB{

    {/*(Instance Initialization block) It is automatically called when an object is created. If obejcts are created two times, it will load two times*/
        System.out.println("IIB");

        System.out.println("Reading from CSV file");
    }

    static {  /* Static block- It is called when an class is loaded. It is called only once nop matter how many objects of this class is created*/
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    private String phone;
    static String courseName = "ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("Do Assignment");
    }

    static class A{

    }
}
