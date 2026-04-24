import java.util.*;

public class MultiD {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(4);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(8);
        mainList.add(list2);

        System.out.println(mainList);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> current = mainList.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j) + " ");
            }
            System.out.println(" ");
        }

    }
}
