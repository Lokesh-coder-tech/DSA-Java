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

    static void generateParentheses(int open, int close, int n, StringBuilder temp, List<String>res ){
        if(open == n && close == n) {
            res.add(temp.toString());
            return;
        }
        if(open < n){
            temp.append('(');
            generateParentheses(open+1, close, n, temp, res);
            temp.deleteCharAt(temp.length()-1);
        }
        if(close < open){
            temp.append(')');
            generateParentheses(open, close+1, n, temp, res);
            temp.deleteCharAt(temp.length()-1);
        }
    }

    public static void main(String[] args) {
//        int[] a = {1,2,3};
//
//        ArrayList<Integer> temp = new ArrayList<>();
//
//        func(a, a.length, 0, temp);

        int n = 2;
        List<String> res = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        generateParentheses(0, 0, n, temp, res);
        System.out.println(res);
    }
}
