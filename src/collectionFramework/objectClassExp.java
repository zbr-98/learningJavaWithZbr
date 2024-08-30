package collectionFramework;

public class objectClassExp {
    public static void main(String[] args) {
        Person p1 = new Person("Zubair", "Mirzapur");
        Person p2 = new Person("Ayan", "Varanasi");

        System.out.println(p1);
    }
}

 class Person extends Object{
    String name;
    String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

//    public String toString() {
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());
//    }

//     When we try to print the object directly it prints the 'classname@hashcode' after converting it to
//     string using this toString method in Object class
//
//     So, we need to overrrided toString method to directly print the class in sout
     @Override
     public String toString(){
        return "Name-> " + this.name + ", Address-> " + this.address;
     }
}
