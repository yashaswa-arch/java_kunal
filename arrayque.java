//swapping value in an array

import java.util.Arrays;

public class arrayque {
//     public static void main(String[] args) {
//         int []arr={1,3,4,5,6};
//     swap(arr,1,3); //index 0 and 1 which has value 3 and 5 will swap
//     System.out.println(Arrays.toString(arr));
//       }
      
//  static void swap(int[] ar , int index1, int index2){
//  int temp=ar[index1];
//  ar[index1]=ar[index2];
//  ar[index2]=temp;
   
//     }

//maximum value of an array
// public static void main(String[] args) {
//     int[]arr={10,30,40,990,76};
//     System.out.println(max(arr));
// }
// static int max(int[] ar2){
//     int maxval=Integer.MIN_VALUE;//if array is empty you can use this to compare
//     for(int i=0;i<ar2.length;i++){
//     if(maxval<ar2[i]){
//         maxval=ar2[i];
//     }
//     }
// return maxval;
// }

//reversing an array

// public static void main(String[] args) {
//     int[] arr={10,20,40,60};
//     reverse(arr);
//     System.out.println(Arrays.toString(arr));
// }
// static void reverse(int[]ar3){
//     int start=0;
//      int end=ar3.length-1;
//     while(start<end){
//         // int rev= ar3[start];
//         // ar3[start]=ar3[end];
//         // ar3[end]=rev;

//         //can aslo call swap method
//         //swap(ar3,start,end)
//        start++ ;
//        end--;
//     }
// }    
//  static void swap(int[] ar , int index1, int index2){
//  int temp=ar[index1];
//  ar[index1]=ar[index2];
//  ar[index2]=temp;
   
//     }

//leetcode que concatenation of an array
/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Specifically, ans is the concatenation of two nums arrays.

Return the array ans.

 

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */

//solution
/*
public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n*2];
        for(int i =0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
            
        }
     return ans;
    }
}
 */
}