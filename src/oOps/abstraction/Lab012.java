package oOps.abstraction;

public class Lab012 {

    public static void main(String[] args) {
        Chrome c1= new Chrome();
        c1.startBrowser("Chrome version 98");
        c1.closeBrowser("version 98");
        c1.takeScreenshot();

        Firefox f1= new Firefox();
        f1.startBrowser("abc");
        f1.closeBrowser("bjhs");
        f1.takeScreenshot();
    }
}
