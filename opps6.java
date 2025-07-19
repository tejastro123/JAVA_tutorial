// Abstraction in Java
/*2. Interfaces */

interface Animal {
    int eyes = 2;
    void walk();
}

interface Herbivore {
    void eat();
}

class Horse implements Animal, Herbivore {
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
    Horse() {
        System.out.println("Wow, you have created a Horse!");
    }
    public void eat() {
        System.out.println("Horse eats grass");
    }
}


class Chicken implements Animal, Herbivore {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }
    public void eat() {
        System.out.println("Chicken eats seeds");
    }
}


public class opps6 {
    public static void main(String args[]) {
       Horse horse = new Horse();
       horse.walk();
    }
}
