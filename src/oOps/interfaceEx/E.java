package oOps.interfaceEx;


public interface E {

// Interface variables will be inherited to subclasses.
//interface is a keyword which is used to define User Defined Datatypes.
//Interfaces can be used to achieve multiple inheritance in Java.
//One interface can extend one or more interfaces.
//One class can implement one or more interfaces.
//Interface can contain the following members:
/* 1. public final static variables and methods
   2. public abstract methods
   3. public static inner classes  */
//Variables declared in the interface are by default public final and static.
//Methods declared in the interface are by default public and abstract.

    /*Default Methods in interfaces-
       1. Default methods are methods that can have a body.
       2. They provide additional functionality to a given type without breaking down the implementing classes.
       3. If a new method was introduced in an interface then all the implementing classes used to break. */

    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart() {
        System.out.println("Halt the Engine");
    }

    default void haltingEngineJustStop() {
        System.out.println("Halt the Engine");
    }

    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();

//   void m4(){
//       System.out.println("Not possible");
//   }
}
