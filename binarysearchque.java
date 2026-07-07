//qu1 ceiling of an number
//what will happen if we do not have the exact target value
//we find the no which is greater or = target nearest of it
//suppose in array{1,2,4,,5,7,14,16,18,19}
// we need to find 15 and 15 is not present the no greater or equal and nearest to 15 is 16 and that is the answer
public class binarysearchque {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,11,14,15,16,18,19};
        int target=15;//note 17 is not there 
        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=start+(end - start)/2;
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
        // we used here -1 when we did not found the element but 
        //when start>end while loop breaks start =end +1 ,and we found the no greatest and nearest to target
  return start;//output will be 11 whhich means index 11 element that is 18;
    }
}
