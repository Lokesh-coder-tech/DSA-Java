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

    public static void main(String[] args) {
//        System.out.println(find(4));

        int[] arr = {5, 3, 2};
        System.out.println(maxNumber(arr, 3));
    }

}
