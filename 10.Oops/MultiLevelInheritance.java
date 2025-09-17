public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dog lalu = new Dog();
        lalu.color = "red";
        lalu.breed ="Indian";
        System.out.println(lalu.color);
        System.out.println(lalu.breed);
    }
}
//base class
class Animal {
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//1st level
class Mammal extends Animal {
    int legs;
}
//2nd level
class Dog extends Mammal{
    String breed;
}