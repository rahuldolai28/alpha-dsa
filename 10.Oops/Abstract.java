public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        Chicken c = new Chicken();
        h.eat();
        h.walk();
        c.eat();
        c.walk();
        h.ChangeColor();


        // Can't create
        // Animal a = new Animal();
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walks on 4 legs");
    }
    void ChangeColor(){
        color = "dark brown";
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}