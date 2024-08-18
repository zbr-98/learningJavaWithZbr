package oOps.abstraction;

public abstract class BaseClass extends GrandBaseClass{

    abstract String startBrowser(String a);
    abstract String closeBrowser(String b);

    void takeScreenshot(){
        System.out.println("Taking screenshot by base class itself!");
    }
}
