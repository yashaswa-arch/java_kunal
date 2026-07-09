//que1 ceiling of an number
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
//what will happen if we do not have the exact target value
//we find the no which is greater or = target nearest of it
//suppose in array{1,2,4,,5,7,14,16,18,19}
// we need to find 15 and 15 is not present the no greater or equal and nearest to 15 is 16 and that is the answer
public class binarysearchque {
//     public static void main(String[] args) {
//         int [] arr={1,2,3,4,5,6,7,11,14,15,16,18,19};
//         int target=17;//note 17 is not there 
//         System.out.println(search(arr,target));
//     }
//     static int search(int[]arr,int target){
//    what if target is grater than whole array
//      if (target>arr[arr.length-1]{
//return -1;
//} 
//         int start=0;
//         int end =arr.length-1;
//         while(start<=end){
//             int mid=start+(end - start)/2;
//               if(target<arr[mid]){
//                 end=mid-1;

//               }
//               else if(target>arr[mid]){
//                 start=mid+1;
//               }
//               else{
//                 return mid;
//               }
//         }
//         // we used here -1 when we did not found the element but 
//         //when start>end while loop breaks start =end +1 ,and we found the no greatest and nearest to target
//   return start;//output will be 11 whhich means index 11 element that is 18;
//     }


//que 2 floor of a number
//finding now the no smallest and nearest to target
//same code as before we just now return end because if end<start we want smaller and nearer number

//leetcode solution
/*public char nextGreatestLetter(char[] letters, char target) {
        int start=0;
        int end=letters.length-1;
        while(start<=end){
            int mid =start+(end-start)/2;
            if(target<letters[mid]){
                end=mid-1;
              }
                else{
                    start=mid+1;
                }
                 }
           
            return letters[start%letters.length]; */


//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

/*public int[] searchRange(int[] nums, int target) {
        int[]ans={-1,-1};
        int start=search(nums,target,true);
        int end =search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
        }
        static int search(int[]nums,int target,boolean findStartIndex){
            int ans=-1; 
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid])
             {
                start=mid+1;
            }
            else{//might be potenetial answer found
                ans= mid;
                if(findStartIndex){ //if we are going to find first occurenec use true
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }

        }
        return ans;
    } */


//que  https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
       //what if we dont know the size of an array 
       //we will exponentially increase the start and end and then apply BS  
public static void main(String[] args) {
    int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
    int target=10;
    System.out.println(ans(arr, target));
    
}
static int ans(int[]arr,int target){
    //find the range
    //start with the size of box2
    int start=0;
    int end =1;
    //condition for target to lie in a range 
    while(target>arr[end]){
//keep doubling the size
int temp=end+1;//this is my new start
//end = end+size of previousbox*2
end=end+(end-start+1)*2;
start=temp;
    } 
    return search(arr, target, start, end);
}
static int search(int[]arr,int target,int start,int end){
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;

        }
        else if(target>arr[mid]){
            start=mid+1;
        }
        else{
            return mid;
        }

    }
    return -1;
}
}
