package ex_08_07_2024;

public class secondMaxSalary {
    public static void main(String[] args) {
        int[] Salaries ={4, 5, 16, 8, 12, 10, 15, 13, 18, 22, 21, 19, 27};

        int max=0;
        int secMax=0;

        for(int i:Salaries) if(i>max) max=i;
        for(int i: Salaries) if(i<max && i>secMax) secMax=i;

        System.out.println("Maximum salary is: "+max);
        System.out.println("Second maximum salary is: "+secMax);
    }
}
