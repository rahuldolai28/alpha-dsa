
import java.util.Arrays;

// Chocola Problem
// We are given a bar of chocolate composed of mxn square pieces. One should
// break the chocolate into single squares. Each break of a part of the chocolate
// is charged a cost expressed by a positive integer. This cost does not 
// depend on the size of the part that is being broken but only depends on
// the line the break goes along. Let us denote the costs of breaking along
// consecutive vertical lines
// with x1, x2, ... , xm-1 and along horizontal lines with y1, y2, ... , yn-1.
// Compute the minimal cost of breaking the whole chocolate into single squares.

public class ChocolaProblem {

    public static void main(String[] args) {
        int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 }; // m-1
        Integer costHor[] = { 4, 1, 2 }; // n-1

        Arrays.sort(costHor);
        Arrays.sort(costVer);

        int h = costHor.length - 1, v = costVer.length - 1;
        int hp = 1, vp = 1;
        int cost = 0;

        while (v >= 0 && h >= 0) {
            if (costHor[h] > costVer[v]) {
                cost += costHor[h] * vp;
                h--;
                hp++;
            } else {
                cost += costVer[v] * hp;
                v--;
                vp++;
            }
        }
        while (h >= 0) {
            cost += costHor[h] * vp;
            h--;
            hp++;
        }
        while (v >= 0) {
            cost += costVer[v] * hp;
            v--;
            vp++;
        }
        System.out.println("Min cost of cut = " + cost);

    }

}
