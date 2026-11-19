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

        System.out.println(fib(3));

    }

}
