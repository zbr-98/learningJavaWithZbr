package oOps.encapsulation;

public class lab01 {

    public static void main(String[] args) {

        SbiBank zubair= new SbiBank("Zubair", 100000);

        zubair.setName("zbr", false);
        System.out.println(zubair.getName());

        SbiBank admin =  new SbiBank("admin", 10000);
        admin.setName("zbr", true);
        admin.setBalance(20000, true);
        System.out.println("Name: "+admin.getName() + " \nBalance: " +admin.getBalance());
    }
}
