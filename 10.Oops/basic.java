public class basic{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);
    }
}


class Pen {
    int tip;
    String color;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculatePer(int phy, int chem, int math ){
        percentage = (phy+chem+math)/3 *100;
    }
}