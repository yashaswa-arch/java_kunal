import java.util.Arrays;

public class mergesort{
 public static void main(String[] args) {
      int[]arr={5,4,3,2,1};
      arr=divide(arr);//original array updated
      System.out.println(Arrays.toString(arr));
    }
    static int[] divide(int []arr){
      if(arr.length<=1){
        return arr;
      }  
      int mid = arr.length/2;
      int []left =divide(Arrays.copyOfRange(arr, 0, mid));
      int right[]=divide(Arrays.copyOfRange(arr, mid, arr.length));
      return merge(left,right);
    }
    static int[] merge(int[]first,int second[]){
        int [] mix = new int[first.length+second.length];
      int i =0; //one pointer for first array
      int j=0; // pointer for second array needed for comparisons
      int k =0;  //needed for new array
      while(i<first.length && j<second.length){
if(first[i]<second[j]){
    mix[k]=first[i++];
    
}
else{
    mix[k]=second[j++];
    
}
      
k++;
}
//it may be possible that one of tha arrays is not complete
//add all the remaining elemts in the array
while(i<first.length){
    mix[k]=first[i];
    i++;
    k++;
}
while(j<second.length){
    mix[k]=second[j];
  j++;
    k++;
}
return mix;
    }
}