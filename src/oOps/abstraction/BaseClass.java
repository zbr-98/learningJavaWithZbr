package oOps.abstraction;

public abstract class BaseClass extends GrandBaseClass{

    String a="zbr";

    abstract void startBrowser(String a);
    abstract void closeBrowser(String b);

    void takeScreenshot(){
        a=a+"abc";
        System.out.println("Taking screenshot by base class itself! "+a);
    }
}
