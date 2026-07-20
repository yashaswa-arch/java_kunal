import java.util.Arrays;

public class binarysearch2d {
  public static void main(String[] args) {
    int [][]arr={ 
        {10,20,30,40},
{15,25,35,45},
{28,29,37,49},
{33,34,38,50}
 };
 System.out.println(Arrays.toString(search(arr, 22)));
  } 
  static int[] search(int[][]matrix,int target){
int startrow = 0;
int endcol=matrix.length-1;
while(startrow<matrix.length &&  endcol>=0){
    if(matrix[startrow][endcol]==target){
        return new int []{startrow,endcol};
    }
if(matrix[startrow][endcol]<target){
    startrow++;
}
else{
    endcol--;
}
}
return new int[]{-1,-1};
  } 
}
