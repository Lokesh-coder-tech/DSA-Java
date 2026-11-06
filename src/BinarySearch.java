public class BinarySearch {

    static int searchAnElement(int key){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if (key > arr[mid]) {
                low = mid + 1;
            }else {
                high = mid -1;
            }

        }
        return -1;
    }

    static int searchInsert(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(target == arr[mid]){
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return low;
    }

    static int lowerBound(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int upperBound(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    static int[] firstAndLastOccurrence(int[] arr, int target){
        int first = lowerBound(arr, target);

        if(first == arr.length || arr[first] != target){
            return new int[]{-1, -1};
        }
        int last = upperBound(arr, target)-1;  //TC=O(log n), SC=O(1)

        return new int[]{first, last};
    }

    static int findPeakElement(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = low + (high-low)/2;
            if(arr[mid] < arr[mid+1]){
                low = mid + 1;
            }else{
                high = mid;            //TC=O(log n), SC=O(1)
            }
        }
        return low;
    }

    static int singleElement(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int mid = low + (high-low)/2;
            if(mid % 2 == 1){
                mid--;
            }
            if(arr[mid] == arr[mid+1]){
                low = mid + 2;
            }else{
                high = mid;
            }                              //TC=O(n), SC=O(1)
        }
        return arr[low];
    }

    public static void main(String[] args) {
//       int e = searchAnElement(4);
//       if(e != -1){
//           System.out.println("Element found at index: " + e);
//       }else{
//           System.out.println("Element not found");
//       }

//        int[] arr = {10, 20, 30, 40, 50};
//        int index = searchInsert(arr, 35);
//        System.out.println("The element can be insert at " + index + " index");

//        int[] arr = {2,4,6,8,10};
//        int index = lowerBound(arr, 5);
//        int index2 = upperBound(arr, 9);
//        System.out.println("Lower bound found at: " + index);
//        System.out.println("Upper bound found at: " + index2);

//        int[] arr = {1, 2, 4, 6, 8};
//        int target = 4;
//
//        int[] result = firstAndLastOccurrence(arr, target);
//
//        System.out.println("[" + result[0] + ", " + result[1] + "]");

//        int[] arr = {1,2,3,4,3,2};
//        int result = findPeakElement(arr);
//
//        System.out.println("Peak element found at index: " + result);

        int[] arr = {1,2,2,3,3,4,4};
        int result = singleElement(arr);
        System.out.println(result);


    }
}
