package oOps.abstraction;

public class Firefox extends BaseClass{
    @Override
    String startBrowser(String a) {
        System.out.println("Opening firefox browser!");
        return " ";
    }

    @Override
    String closeBrowser(String b) {
        System.out.println("Closing firefox browser!");
        return " ";
    }
}
