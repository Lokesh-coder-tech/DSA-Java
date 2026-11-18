import java.util.*;

public class Backtracking {

    static void func(int[] a, int n, int idx, ArrayList<Integer> temp){
        //Base case
        if(idx == n){
            System.out.println(temp);
            return;
        }
        //Take/include
        temp.add(a[idx]);
        func(a, n, idx+1, temp);

        //Backtracking
        temp.remove(temp.size()-1);

        //Not take/exclude
        func(a, n, idx+1, temp);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3};

        ArrayList<Integer> temp = new ArrayList<>();

        func(a, a.length, 0, temp);
    }
}
