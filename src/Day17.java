//Array-Problem solving
public class Day17 {

    //Find the Average of array elements
    static int getAverage(int arr[]){
        int sum = 0;
        int n = arr.length;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
        }
        return sum/n;
    }

    //Multiply each Element of array By 10
    static int[] getMultiplyBy10(int arr[]){
        int size = arr.length;
        int newArray[] = new int[size];

        for(int i=0; i<arr.length; i++){
           int elements = arr[i];
           int newElements = elements * 10;
           newArray[i] = newElements;
        }
        return newArray;
    }

    //Search for an element in an aaray(Linear search)
    static boolean getElement(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    //Find the maximum element in an array
    static int maxElement(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
//            if(max < arr[i]) {
//                max = arr[i];
//            }
             max = Math.max(max, arr[i]);
        }
        return max ;
    }

    //Sum of positive and negative numbers
    static int[] getPosNeg(int arr[]){
        int pos = 0;
        int neg = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                pos = pos + arr[i];
            }else{
                neg = neg + arr[i];
            }
        }
        int ans[] = {pos, neg};
        return ans;
    }

    //Count the Number of zeroes and Ones
    static int[] getOnesZeroes(int arr[]){
        int ones = 0;
        int zeroes = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                ones++;
            }else{
                zeroes++;
            }
        }
        int res[] = {ones, zeroes};
        return res;

    }

    //Find First Unsorted element in an array
    static int getUnsorted(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i+1] <= arr[i]){
                return arr[i+1];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int arr[] = {1, 2, 5, 8, 9};
//        System.out.println("Average of the elements of the array: " + getAverage(arr));

//         int arr[] = {1, 2, 3, 4, 5};
//         int ans[] = getMultiplyBy10(arr);
//         System.out.println("Printed elements multiply by 10: ");
//         for(int i: ans){
//            System.out.println(i);
//        }

//        int arr[] = {2, 3, 5, 7, 10};
//        System.out.println(getElement(arr, 7));

//        int arr[] = {2, 4, 12, 25, 15};
//        System.out.println(maxElement(arr));

//        int arr[] = {2, -3, 4, -5, 7};
//        int ans[] = getPosNeg(arr);
//        System.out.println("Positive sum is: " + ans[0]);
//        System.out.println("Negative sum is: " + ans[1]);

//        int arr[] = {0, 1, 0, 1, 1, 1};
//        int res[] = getOnesZeroes(arr);
//        System.out.println("Number of Zeroes: " + res[0]);
//        System.out.println("Number of Ones: " + res[1]);

        int arr[] = {2, 3, 6, 5, 10};
        System.out.println(getUnsorted(arr));

    }
}
