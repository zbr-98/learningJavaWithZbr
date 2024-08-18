package oOps.realTest;

public class TestCase2 extends BaseTest{
    void testCase2(){
        startBrowser();  //base test
        getDataFromSql(); //grand base test
        System.out.println(gold); //grand base test
//

       closeBwroser(); //base test
    }

    public static void main(String[] args) {
        new TestCase2().testCase2();
    }
}
