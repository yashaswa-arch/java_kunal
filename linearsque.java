//search in a string
//search in range
//find minimum number
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class linearsque {
//     public static void main(String[] args) {
//         String name="yashaswa";
//           char target= 'a';
//            System.out.println(stringsearch(name, target)); 
//          }

//     static boolean stringsearch(String str,char target){
//      if(str.length()==0){
//         return false;
//      }

//      for(int i =0;i<str.length();i++){
//         if(target==str.charAt(i)){
//             return true;
//         }
//     another method
//   for(char ch: str.toCharArray())
//   if(ch==target){
//   return true;
//}
//      }
//      return false; 
//     }



//  2 search in range

//  public static void main(String[] args) {
//     int[]arr={10,20,30,40,50};
//     int target=30;
//     System.out.println(search(arr, target, 1, 3));
// }
 
//  static int search(int[]arr,int target,int start ,int end) {  
//  if(target==0){
//     return-1;
//  }
//  for(int index=start;index<=end;index++){
//     int element=arr[index];
//     if(element==target){
//         return index;
//     }
     
//  }
//  return -1;
//    }


//3 min number
// public static void main(String[] args) {
//    int[] arr={10,30,-6,55,2};
//    System.out.println(min(arr));
// }
// // arr.length!=0
// static int min(int[]arr){
//    int ans=arr[0];
//    for(int i =1;i<arr.length;i++){
//       if(arr[i]<ans){
//          ans=arr[i];
//       }
//    }
//    return ans;
// }

// SEARCH IN 2D ARRAY
// public static void main(String[] args) {
//    int[][] ar2={
//       {10, 20, 30,2},
//       {22,44,31,42,53},
//       {55,60,77,8,11,14},
//       {1,2,3,4,5,6,7,8} 
//             };

// int target =31;
// int[]ans=search(ar2, target);
// System.out.println(Arrays.toString(ans));
//System.out.println(max(ar2));//will give max also in 2d array;
//  }
// static int[] search(int[][] arr,int target){
// for(int row=0;row<arr.length;row++){
//    for(int col=0;col<arr[row].length;col++){
//   if(arr[row][col]==target){
//    return  new int[]{row,col};
//   }
 
//    }
// }
//  return new int[]{-1,-1 };

// }


//MAX IN  2D array


 
//  static int maax(int[][] arr){
// int max= Integer.MIN_VALUE;
//  for(int []ints:arr){
//    for(int element:ints){ 
//    if(element>max){
//    max=element;
//     }
//    }
//  }
// return max;
//  }

//4 https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public static void main(String[] args) {
  int []arr={12,345,2,6,7896,-12};
  System.out.println(findnumbers(arr));  
}
static int findnumbers(int[]nums){
  int count = 0;
 
  for(int num:nums){
    if(even(num)){
      count++;
    }
  }
   return count;
}
//function to check whether the digit is even or odd
static boolean even(int nums){
  int numofdigits=digits(nums);
 if(numofdigits%2==0){
  return true;
}
return false;
//shortcut
//return numofdigits%2==0;
}
// counting no of digits in a number
static int digits(int num){
int count =0;
if (num==0){
  return 1;
}
if(num<0){
  num=num*-1;
}
while(num>0){
count++;
num/=10;

}
  return count;
}
  }
