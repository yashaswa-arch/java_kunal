import java .util.Arrays;

public class sorting {
    // public static void main(String[]args){
    //     //BUBBLE SORT 
    //     //O(1) space complexity remains constant 
    //     // O(n square) array sorted in opposite (worst case)
    // int arr[]={10,90,50,44,555};
    // bubble(arr);
    // System.out.println(Arrays.toString(arr));
    // }
    // static void bubble(int []arr){
    //     //run the steps n-1 times
    //  boolean swapped;
    //     for(int i = 0;i<arr.length;i++){
    //         swapped=false;
    //         //for each step max item will come at last at each pass
    //         for(int j= 1;j<=arr.length-i-1;j++){
    //             //swap if the item is smaller than the previous item
    //             if(arr[j]<arr[j-1]){
    //                 //swap
    //                 int temp = arr[j];
    //                 arr[j]=arr[j-1];
    //                 arr[j-1]=temp;
    //             swapped = true;
    //             }
    //         }
    //         //if you did not swap for a particular value it means array is sorted stop program
    //         if(swapped==false){
    //             break;
    //         }
    //     }
    // }
    
    //SELECTION SORT
    //O(n square)
    public static void main(String[] args) {
        int []arr={1,3,55,77,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            //now we got max swap it the max the last element
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
