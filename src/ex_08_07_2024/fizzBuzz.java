package ex_08_07_2024;

public class fizzBuzz {
    public static void main(String[] args) {
        FizzBuzz();
    }

    private static void FizzBuzz(){
        int i=1;

        while (i <= 100) {
            if(i%3==0) System.out.println(i+" : Fizz");
            if(i%5==0) System.out.println(i+" : Buzz");
            if(i%3==0 && i%5==0) System.out.println(i+" : FizzBuzz");

            i++;
        }
    }
}
