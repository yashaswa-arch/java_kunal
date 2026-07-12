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
                if(findStartIndex){ //if we are going to find first occurence use true
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
// public static void main(String[] args) {
//     int arr[] = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
//     int target=10;
//     System.out.println(ans(arr, target));
    
// }
// static int ans(int[]arr,int target){
//     //find the range
//     //start with the size of box2
//     int start=0;
//     int end =1;
//     //condition for target to lie in a range 
//     while(target>arr[end]){
// //keep doubling the size
// int temp=end+1;//this is my new start
// //end = end+size of previousbox*2
// end=end+(end-start+1)*2;
// start=temp;
//     } 
//     return search(arr, target, start, end);
// }
// static int search(int[]arr,int target,int start,int end){
    /*
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
 } */

//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
/*
int start=0;
  int end=arr.length-1;
  while(start<end){
    int mid=start+(end-start)/2;
    if(arr[mid]<arr[mid+1]){
        start=mid+1;
    }
    else if(arr[mid]>arr[mid+1]){
        end=mid;
    }
  }
  return end;
        
    }
    
}

*/ 

//https://leetcode.com/problems/find-in-mountain-array/description/
/*public static void main(String[] args) {
    
}
static int search(int[]arr,int target){
int peak=peakindexmountainarray(arr);
int firstry=orderagnosticsearch(arr, target,0,peak);
if(firstry!=-1){
    return firstry;
}
return orderagnosticsearch(arr, target, peak+1, arr.length-1);
}

static int peakindexmountainarray(int[]arr){ //used peak index mountain code
    int start=0;
  int end=arr.length-1;
  while(start<end){
    int mid=start+(end-start)/2;
    if(arr[mid]<arr[mid+1]){ //if the mid is less than the mid <mid +1 element  
        start=mid+1; //then we go to next element if it can act as our new peak
    }
    else if(arr[mid]>arr[mid+1]){ //if arr[mid]>mid+1 we might have found peak

        end=mid;//just checking the left also if there is a peak
    }
  }
  return end;
        
    }
    
   static int orderagnosticsearch(int[]arr,int target,int start,int end){
   
//FIND WHETHER THE ARRAY IS SORTED IN ASC OR DESC
boolean isAsc=arr[start]<arr[end];

     while(start<=end){
             //find the middle element
             //start + end/2      might exceed the range of an integer

             int mid=start+(end-start)/2;
             if(arr[mid]==target){
                return mid;
             }
             if(isAsc){ 
             if(target<arr[mid]){       //FOR DESCENDING 
                 end=mid-1;             //(target>arr[mid]){ end=mid-1; }
             }

             else if(target>arr[mid]){     //for descending 
                 start=mid+1;             // if( target<arr[mid]){ start=mid+1;}
             }
             }
             else{ //this checking for descending
                if(target>arr[mid])
                    {
                         end=mid-1;
                         }
                         else if( target<arr[mid])
                            { 
                                start=mid+1;
                            }
             }

             
         }
 return -1;
  } */



//rotated array 

//https://leetcode.com/problems/search-in-rotated-sorted-array/description/

/*public int search(int[] nums, int target) {
        int pivot=findpivot(nums);
    if(pivot==-1){
        //if pivot is not found means array is not rotated 
        return binarysearch(nums,target,0,nums.length-1);

    }   
    //if pivot is found use findpivot ,you have found 2 asc sorted arrays
    if(nums[pivot]==target){
        return pivot;
    }     
    if(target>=nums[0]){
        return binarysearch(nums,target,0,pivot);
    }
    return binarysearch(nums,target,pivot+1,nums.length-1);
    }
    static int findpivot(int[]arr){ //for non duplicates
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        //all 4 cases over here 
        int mid=start+(end-start)/2;
        if(mid<end && arr[mid]>arr[mid+1]){ //otherwise if mid is at end array out of bound exception
            return mid;
        }
        if(mid>start && arr[mid]<arr[mid-1]){
            return mid-1;
        }
        if(arr[mid]<=start){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }
    return -1;
    }
    static int binarysearch(int[]arr,int target,int start,int end){
    
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
    } */

    //in same que if there are duplicate values then what do to ? how to rotate array
    //if start mid and end are same or equal  skip the duplicates
    //create a function named static int findpivtowithdupliactes(int[]arr) and add findpviotcdoe then this
    /*if (arr[mid]==arr[start]&& arr[mid]==arr[end]){
    skip the duplicates
     
    what if the start and end are pivots? then 
    check if start is pivot?
    check it
   if( arr[start]>arr[start+1]){
   return start;
   }
   start++;
   check whether end is pivot 
   if(arr[end]<arr[end-1]){
   return end-1;
   }
   end--;
   if left side sorted might be possible that pivot is in right
   else if(arr[start]<arr[mid]||arr[start]==arr[mid]&& arr[mid]>arr[end]){
   start=mid+1;
   }
   else{
    end =mid-1;
}
    */


//to count the no of rotation in an array use

// public static void main(String[] args) {

   /*int pivot= findpivotduplicates(arr);
   if(findpivotduplicates==-1){
   aaray is not rotated
   return pivot+1; }
    */ 
// }
//here take the function of above static int  findpivotduplicates(int[]arr)
}

