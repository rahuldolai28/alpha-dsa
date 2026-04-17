import java.util.ArrayList;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        // int max = Integer.MIN_VALUE;
        // System.out.println(max);
        // for (int i = list.size() - 1; i >= 0; i--) {
        // // if (list.get(i)>max) {
        // // max = list.get(i);
        // // }
        // max = Math.max(max, list.get(i));
        // }
        // System.out.println(max);

        // swap two numbers
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
        System.out.println(list);
    }

}
