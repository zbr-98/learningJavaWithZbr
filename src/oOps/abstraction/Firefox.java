package oOps.abstraction;

public class Firefox extends BaseClass{
    @Override
    void startBrowser(String a) {
        System.out.println("Opening firefox browser!");
    }

    @Override
    void closeBrowser(String b) {
        System.out.println("Closing firefox browser!");
    }
}
