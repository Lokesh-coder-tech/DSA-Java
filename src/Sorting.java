public class Sorting {

    static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){

            int minValue = i;

            for(int j=i+1; j< arr.length; j++){
                if(arr[j] < arr[minValue]){
                    minValue = j;
                }
            }                         //TC=O(n^2), SC=O(1)
            int temp = arr[i];
            arr[i] = arr[minValue];
            arr[minValue] = temp;
        }
    }

    static void insertionSort(int[] arr){
        for(int i=1; i< arr.length; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }                             //TC=O(n^2) SC=O(1)
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
     int[] arr = {5, 3, 8, 1, 2};
//     bubbleSort(arr);
//     System.out.print("[");
//     for(int i=0; i< arr.length; i++){
//         System.out.print(arr[i] + ",");
//     }
//     System.out.print("]");

//        selectionSort(arr);
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + ", ");
//        }

        insertionSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
