package oOps.interfaceEx.diamondProblem;

/* The Diamond Problem occurs in programming languages like Java when multiple inheritance creates ambiguity,
   specifically when a class implements two or more interfaces that provide the same default method.
   Java solves this issue with the use of the Interface.super.methodName() syntax to specify which interface's
   method should be used.

       Scenario:
       Assume you have two interfaces, InterfaceA and InterfaceB, both of which provide a default method defaultMethod().
       If a class MyClass implements both InterfaceA and InterfaceB, the compiler will not know which defaultMethod() to use.
       This is where Interface.super.methodName() comes into play.
 */

public interface InterfaceA {

    default void defMethod(){
        System.out.println("I am a method from interface A");
    }
}

interface InterfaceB{
    default void defMethod(){
        System.out.println("I am a method from interface B");
    }
}
class ClassA implements InterfaceA, InterfaceB{
    @Override
    public void defMethod() {
        InterfaceB.super.defMethod();
    }
}

class Lab0012{
    public static void main(String[] args) {
        ClassA c1 =new ClassA();
        c1.defMethod();
    }
}
