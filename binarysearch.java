//steps
//array should be in ascending or descending order 
//find middle element
//if target element is in >mid then search in right else in left
//if middle element==target this is you answer
//if si(start index)>ei(end index)element not found or doesn't exist

public class binarysearch {
//      public static void main(String[] args) {
// int[] arr= {-1,-2,-3,4,11,4,5,6,7,8,9,11};
// int target=4;
//      System.out.println("the number is at index  "+search(arr, target));   
//     }

//     //return the index
//     //return -1 if doesn't exist


//     static int search(int []arr,int target){
//         int start=0;
//         int end=arr.length-1;
//         while(start<=end){
//             //find the middle element
//             //start + end/2      might exceed the range of an integer

//             int mid=start+(end-start)/2;
//             if(target<arr[mid]){       //FOR DESCENDING 
//                 end=mid-1;             (target>arr[mid]){ end=mid-1; }
//             }

//             else if(target>arr[mid]){     //for descending 
//                 start=mid+1;              if( target<arr[mid]){ start=mid+1;}
//             }

//             else{ 
//                 return mid;
//             }
//         }
// return -1;
//     }



//but how identify is array is in ascending or descending order

//ORDER AGNOSTIC BINARY SEARCH 
public static void main(String[] args) {
    int[] arr= {99,88,77,66,55,44,33,1};
    int target =55;
    System.out.println(oas(arr, target));
}
static int oas(int[]arr,int target){
    int start=0;
    int end=arr.length-1;
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
             else{ 
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
}
}
