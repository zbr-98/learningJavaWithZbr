package oOps.thisSuper;

public class Lab023 {
    // super()
    //1. Use of super with Variables
    //2. Use of super with Methods
    //3. Use of super with constructors

    // super keyword in Java is a reference variable that allows
    // a subclass - child class
    // to refer to its parent class.

    public static void main(String[] args) {
        Car c1= new Car();
        c1.message();
        c1.display();
        c1.message(234);

        Vehicle v1 = new Vehicle(456);
        v1.message();
        v1.message(12);

    }

}

 class Car extends Vehicle{
    private int maxSpeed=281;

    Car() {
        super(10);
        System.out.println("Def cons of Car called!");
    }

    public void message(){
        System.out.println("Hello Car");
    }

    void display(){
        System.out.println("Max speed of vehicle is: " + super.maxSpeed);
        System.out.println("Max speed of Car is: " + this.maxSpeed);
    }


}

 class Vehicle{
    protected int maxSpeed=140;

    Vehicle(){
        System.out.println("Def Const called ");
    }

    Vehicle(int a){
        System.out.println("Parameterised const called " + a);

    }

    void message(){
        System.out.println("Hello Vehicle");
    }

    void message(int a){
        System.out.println("Hello Vehicle with parameter "+a);
    }

}


