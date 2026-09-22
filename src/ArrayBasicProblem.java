import java.util.Scanner;

public class ArrayBasicProblem {

    public static void main(String[] args) {

 //Find the maximun element and minimum elements--------->

//        int[] arr = {10, 20, 40, 30, 70, 15, 12, 19};
//        int max = arr[0];
//        for(int i=0; i< arr.length; i++){
//            if(arr[1] > max){
//                max = arr[1];
//            };
//            if(arr[2] > max){
//                max = arr[2];
//            };
//            if(arr[3] > max){
//                max = arr[3];
//            };
//        };
//        System.out.println(max);

//        int[] arr = {10, 20, 4, 50};
//        int min = arr[0];
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            };
//        };
//        System.out.println(min);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Size of the Array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Elements of Array: ");
//        for(int i=0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        };
//        int min = arr[0];
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] < min){
//                min = arr[i];
//            };
//        }

//        int min  = Integer.MAX_VALUE;
//        for(int i = 0; i<n; i++){
//            int num = sc.nextInt();
//            if(num < min){
//                min = num;
//            };
//        };
//        System.out.println(min);
//

//        System.out.println("Elements of the Array: ");
//        int max = Integer.MIN_VALUE;
//        for(int i = 0; i<n; i++){
//            int num  = sc.nextInt();
//            if(num > max){
//                max = num;
//            };
//        };
//        System.out.println("maximum element out of the array: " + max);

//
//        System.out.println("Minimum element out of the Array: " + min);

//Find the sum------------>

//        int[] arr = {1, 2, 3, 4, 5};
//        int sum = 0;
//        for(int i = 0; i< arr.length; i++){
//            sum = sum + arr[i];
//        }
//        System.out.println(sum );

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        int sum  = 0;
//        for(int i = 0; i<n; i++){
//            arr[i] = sc.nextInt();
//            sum = sum + arr[i];
//        }
//        System.out.println(sum);
//

//Count How many Even numbers are present--------->

//        int[] arr = {1, 2, 4, 5, 8};
//        int count = 0;
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] % 2 == 0){
//                count++;
//            }
//        }
//        System.out.println(count);

//Linear Search - search for an element------->

//        int arr[] = {10, 15, 25, 30, 40};
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] == 30){
//                System.out.println("Index: " + i);
//            };
//        };

//Count How many Odd numbers are present--------->
//        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int count = 0;
//        for(int i = 0; i< arr.length; i++){
//            if(arr[i] % 2 == 1){
//                count++;
//            };
//        };
//        System.out.println(count);

//Reverse an Array----------->
//       int arr[] = {10, 20, 30, 40, 50};
//       int left = 0;
//       int right = arr.length - 1;
//       while(left < right){
//           int temp = arr[left];
//           arr[left] = arr[right];
//           arr[right] = temp;
//           left++;
//           right--;
//       }
//       for(int i=0; i<arr.length; i++){
//           System.out.println(arr[i]);
//       }

//Check if Array is sorted or not-------->
     //Brute-force
//      int arr[] = {1, 2, 7, 4, 5};
//      if(arr[0] < arr[1] && arr[1] < arr[2] && arr[2] < arr[3] && arr[3] < arr[4]){
//          System.out.println("Array is sorted");
//      }else{
//          System.out.println("Array is not sorted");
//      }

      //Optimised-Approach
//        int arr[] = {1, 7, 3, 4, 5};
//        boolean sorted = true;
//        for(int i = 0; i < arr.length-1; i++){
//            if(arr[i] > arr[i + 1]) {
//               sorted = false;
//               break;
//            }
//        }
//        if(sorted){
//            System.out.println("array is sorted");
//        }else{
//            System.out.println("Array is not sorted");
//        }

//Find Second largest element---------->
//        int arr[] = {10, 7, 25, 99, 45, 65};
//        int max = arr[0];
//        int secondMax = Integer.MIN_VALUE;
//        for(int i=0; i< arr.length; i++){
//            if(arr[i] > max){
//                secondMax = max;
//                max = arr[i];
//            } else if (secondMax < arr[i] && arr[i] < max) {
//                secondMax = arr[i];
//            };
//        }
//        System.out.println("largest element: " + max);
//        System.out.println("Second largest element: " + secondMax);

//Find duplicates----------->
//        int arr[] = {1, 2, 3, 4, 4, 5};
//        int count = 0;
//        int duplicate = -1;
//        for(int i=0; i< arr.length; i++){
//            for(int j=i+1; j< arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                    duplicate = arr[j];
//                    System.out.println("Duplicate number is: " + duplicate);
//                }
//            }
//        }
//        String v = (count >= 1) ?"Duplicate": "Not Duplicate";
//        System.out.println(v);
//
    }
}
