public class RunTimePolymorphism {
     public static void main(String[] args) {
          Mammal puchki = new Mammal();
          puchki.eat();
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

class Mammal extends Animal {
    int legs;
        void eat(){
        System.out.println("eats grass");
    }
}