public class basic {
    public static void main(String[] args) {
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(4);
        // System.out.println(p1.tip);
        Student s1 = new Student();
        s1.name = "rahul";
        s1.age = 24;
        s1.marks[0] = 45;
        s1.marks[1] = 50;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        s1.marks[1] = 100;

        System.out.println("After Change");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Pen {
    int tip;
    String color;

    void setColor(String newColor) {
        color = newColor;
    }

    String getColor() {
        return this.color;
    }

    void setTip(int newTip) {
        tip = newTip;
    }

    int getTip() {
        return this.tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;
    int marks[];

    // shallow copy constuctor
    // Student (Student s1){
    // this.name = s1.name;
    // this.age = s1.age;
    // }/

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];

        System.out.println("Student constuctor was called...");
    }

    void calculatePer(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3 * 100;
    }
}