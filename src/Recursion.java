import java.util.*;

public class Recursion {

    static int find(int n){
        //Base case
        if(n==1){
            return 1;
        }
        //Recursive call
        int ans = find(n - 1);
        //Work after recursive call
        return ans + n;

    }

    static int maxNumber(int[] arr, int n){
        if(n==1) return arr[0];
        int last = arr[n-1];
        int ans = maxNumber(arr, n-1);
        return Math.max(last, ans);
    }

    static boolean palindrome(String s, int low, int high){
        int length = high - low + 1;

        if(length == 0 || length == 1) return true; //Base case

        if(s.charAt(low) != s.charAt(high)) return false;

        return palindrome(s, low+1, high-1); //recursive call
    }

    static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;

        int ans1 = fib(n-1);
        int ans2 = fib(n-2);

        return ans1 + ans2;
    }

    static int sumOfDigits(int n){
        if(n == 0) return 0;
        int d = n % 10;
        n = n/10;
        int ans = sumOfDigits(n);
        return ans + d;
    }

    static int singleDigit(int n){
        if(n < 10){
            return n;
        }
        return singleDigit(sumOfDigits(n));
    }

    static String removeChar(String s, int n, int i, char c){
        if(i==n) return "";
        String ans = removeChar(s, n, i+1, c);
        if(s.charAt(i) == c) return ans;
        return s.charAt(i) + ans;
    }

    static boolean arraySorted(int[] a, int i, int n){
        if(i==n || i==n-1) return true;
        if(a[i] > a[i+1]) return false;
        return arraySorted(a, i+1, n);
    }

    static void combinationSum(int[] arr, int n, int idx, List<Integer> diary,
                              List<List<Integer>> res, int sum, int target ){
        //Base case
        if(idx == n){
            if(sum == target) res.add(new ArrayList<>(diary));
            return;
        }
        //choice1-Exclude current element
        combinationSum(arr, n, idx+1, diary, res, sum, target);

        //choice2-Include current element
        if(arr[idx] + sum <=target){
            diary.add(arr[idx]);
            sum = sum + arr[idx];

            //same index because repetition is allowed
            combinationSum(arr, n, idx, diary, res, sum, target);

            //Backtracking
            diary.remove(diary.size()-1);
            sum = sum - arr[idx];
        }

    }

    public static void main(String[] args) {
//        System.out.println(find(4));

//        int[] arr = {5, 3, 2};
//        System.out.println(maxNumber(arr, 3));

//        String s = "madam";
//        if(palindrome(s, 0, s.length()-1)){
//            System.out.println("Palindrome");
//        }else{
//            System.out.println("not Palindrome");
//        }

//        System.out.println(fib(3));

//        System.out.println(singleDigit(sumOfDigits(598)));

//        String s = "apple";
//        System.out.println(removeChar(s, 5, 0, 'p'));

//        int[] a = {2,7,5,6};
//        System.out.println(arraySorted(a, 0, 4));

        int[] arr = {2,3,6,7};
        int n = arr.length;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combinationSum(arr, n, 0, diary, res, 0, 7 );

        System.out.println(res);


    }

}
