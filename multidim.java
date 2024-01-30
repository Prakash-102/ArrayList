
//multi-dimensional Arraylists?:-
import java.util.*;

public class multidim {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            List1.add(i * 1);
            List2.add(i * 2);
            List3.add(i * 3);
        }

        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);
        System.out.println(mainList);
    }
}

/*
 * Output:-
 * [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
 */
