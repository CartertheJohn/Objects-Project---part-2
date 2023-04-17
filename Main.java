// The cat object is heavier when it runs because it is being healthy and active. 

public class Main {
    // This cat object accesses the rest of the object code from the Cat.java file.
    
    public static void main(String[] args) {
        Cat cat1 = new Cat(20, "Jeff", 12, false);
        Cat cat2 = new Cat(22, "Jerry", 6, true);
        Cat cat3 = new Cat(19, "Joel", 9, false);

        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
    }
}
