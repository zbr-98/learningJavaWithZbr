package ex_07_07_2024;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int N = sc.nextInt();

        if(N%2==0) System.out.println("Number is even");
        else System.out.println("Number is Odd");

    }
}
