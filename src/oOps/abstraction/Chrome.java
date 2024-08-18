package oOps.abstraction;

public class Chrome extends BaseClass{

    @Override
    String startBrowser(String a) {
        System.out.println("Starting chrome browser- "+a);
        return " ";
    }

    @Override
    String closeBrowser(String b) {
        System.out.println("Closing chrome browser- "+b);
        return " ";
    }

    void takeScreenshot(){
        super.takeScreenshot();
        System.out.println("Taking screenshot by chrome!");
    }
}
