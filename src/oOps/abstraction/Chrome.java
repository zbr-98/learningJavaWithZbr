package oOps.abstraction;

public class Chrome extends BaseClass{

    @Override
    void startBrowser(String a) {
        System.out.println("Starting chrome browser- "+a);
    }

    @Override
    void closeBrowser(String b) {
        System.out.println("Closing chrome browser- "+b);
    }

    void takeScreenshot(){
        super.takeScreenshot();
        System.out.println("Taking screenshot by chrome!");
    }
}
