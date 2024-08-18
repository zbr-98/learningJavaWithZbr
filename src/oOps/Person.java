package oOps;

public class Person {
    String name;

//    Special Method -Constructor
    Person(){
        System.out.println("Hi, I will be automatically called when object is created!");
        //Here I can write any code which I want to execute
//        before start
    }

    void talk(){
        System.out.println("I am talking!");
    }
}
