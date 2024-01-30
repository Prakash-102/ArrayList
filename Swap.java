
//Swap 2 Number ?:-
import java.util.*;

public class Swap {

    public static void Swap(ArrayList<Integer> List, int idx1, int idx2) {
        int temp = List.get(idx1);
        List.set(idx1, List.get(idx2));
        List.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(2);
        List.add(5);
        List.add(9);
        List.add(3);
        List.add(6);
        int idx1 = 1, idx2 = 3;
        System.out.println("prev list = " + List);
        Swap(List, idx1, idx2);
        System.out.println("Swap list = " + List);
    }
}

/*
 * Output:-
 * prev list = [2, 5, 9, 3, 6]
 * Swap list = [2, 3, 9, 5, 6]
 */
