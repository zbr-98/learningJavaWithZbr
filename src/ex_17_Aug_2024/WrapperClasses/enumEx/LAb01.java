package ex_17_Aug_2024.WrapperClasses.enumEx;

import java.sql.SQLOutput;

public class LAb01 {
    public static void main(String[] args) {
        System.out.println("Bug priority is " + BUG.LOW);

        System.out.println("I am working on " + PAGES.DASHBOARDPAGE);

        System.out.println("I am running the test case for " + APIConstants.CHATBOT_PAGE);
        System.out.println("URL of the page is "+ APIConstants.CHATBOT_PAGE.getUrl());
    }
}
