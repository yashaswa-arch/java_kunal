import java.util.Arrays;

public class recursion {
//     public static void main(String[] args) {
//         //write a fucntion 
//         // print(1);
// System.out.println(fibo(6));
//     }
    // static void print(int n){
    //     //base condition
    //     if(n>5){
    //         return;
    //     }
    //     System.out.println(n);
    //     //recursive call
    //     //even though you are calling a fucntion again and again it can be treated as a seperate call in stack
    //     print(n+1);
    // }

    //fibonacci series

//     static int fibo(int n){
//         //base condition
// if(n<2){
//     return n;  
// }

// return fibo(n-1)+fibo(n-2);
//     }

//recursion ques 

//1 n to 1
// public static void main(String[] args) {
//     fun1(10);
// }
// static int fun1(int n ){
//     //base case 
//     if(n<1){
//         return n; 
//     }
//     System.out.println(n);
//      return fun1(n-1);
// }

//2
//1 to n
// public static void main(String[] args) {
//     fun2(1);
// }
// static void fun2(int n){
//     //base case 
//     if(n==11){ 
//         return ;
//     }
//     System.out.println(n);
//     fun2(n+1);
// }


//product of n to 1 factorial
// public static void main(String[] args) {
//   int ans =  fun3(5);
//   System.out.println(ans);
// }
// static int  fun3(int n){
//  if(n<=1){
//     return 1;
//  }
 //for sum n + fun 3(n-1);
//  return n*fun3(n-1);
// }

// sum of n digits 

// public static void main(String[] args) {
//     int ans = fun4(1342);
//     System.out.println(ans);
// }
// static int fun4(int n ){
//     //base case 
//     if(n==0){
//         return 0;
//     }
// if(n%10==n){
//     return n;
// }
//for product
//    return (n%10)*fun4(n/10);
//     return (n%10)+fun4(n/10);
// }


//passing value

//n-- &--n are different
// public static void main(String[] args) {
//     fun5(5);
// }
// static void fun5(int n){
//     if(n==0){
//         return;
//     }
//     System.out.println(n);
//     fun5(--n);
//     //fun5(n--) infinte loop
// }


// reverse an no
//ex 1824to 4281

// public static void main(String[] args) {
//     fun6(1234);
//     System.out.println(sum);

// }
// static int sum=0;
// static void fun6(int n){
//     if(n==0){
//         return ;
//     }
//     int rem = n %10;
//     sum = sum*10+rem;
//     fun6(n/10);
// }


//palindrome
// public static void main(String[] args) {
    
// }
//  static boolean pali(int n){
//     if(n==fun6(n)){
//         return ;
//     }
//  }
// }

//  static void fun6(int n){
//      if(n==0){
//          return ;
//      }
//      int sum =0;
//      int rem = n %10;
//      sum = sum*10+rem;
//      fun6(n/10);


// public static void main(String[] args) {
//     int[] arr={1,2,4,3,8,10};
//     System.out.println(sorted(arr,0));
// }
// static boolean sorted(int[]arr,int index){
//     //base condition
//     if(index==arr.length-1){
//         return true;
//     }
//     return arr[index]<arr[index+1]&  sorted(arr,index+1);
// }

// public static void main(String[] args) {
//     int [] arr={1,2,4,5,6};
//     System.out.println(linear(arr,4,0));

// System.out.println(returind(arr, 4, 0));
// }
// static boolean linear(int[]arr,int target,int index){
//     if(index==arr.length){
//         return false;
//     }
    
//     return (arr[index]==target) || linear(arr,target,index+1);
    
// }

// //for return of index
// static int returind(int []arr,int target,int index){
//     if(index==arr.length){
//         return -1;
//     }
//     if(arr[index]==target){
//         return index;
//     }else{
//         return returind(arr, target, index+1);
//     }
// }


// fin the number at array how many times
// public static void main(String[] args) {
//   int []arr={1,2,3,3,4,5,6};
//   System.out.println(findOccurrences(arr, 3, 0, new ArrayList<Integer>()));
// }
// static ArrayList<Integer> findOccurrences(int[] arr, int target, int index,
//                                           ArrayList<Integer> list){
// if(index==arr.length){
//     return list;
// }
// if(arr[index]==target){
// list.add(index);
// }
// return findOccurrences(arr, target, index+1, list);
// }


// same que withouth passing arraylist 
// static ArrayList<Integer> findOccurrences(int[] arr, int target, int index
//                                           ){
//   ArrayList <Integer> list = new ArrayList<>();                                          
// if(index==arr.length){
//     return list;
// }
// //this will contain ans for that fun call only
// if(arr[index]==target){
// list.add(index);
// }
// ArrayList<Integer> ansfrombelowcalls =findOccurrences(arr, target, index+1);
// list.addAll(ansfrombelowcalls);
// return list;
// }

//rotated binary search 
// public static void main(String[] args) {
//   int arr [] = {5,6,7,8,9,1,2,3,};
//   System.out.println(search(arr, 8, 0, arr.length-1));
// }
// static int search(int[]arr,int target,int s ,int e){
//   if(s>e){
//     return -1;
//   }
//   int mid = s +(e-s)/2;
//   if (arr[mid]==target){
//     return mid;
//   }
//   if(arr[s]<=arr[e]){
//     if(target>=arr[s]&&target <=arr[mid]){
//       return search(arr, target, s, mid-1);
//     }
//     else{
//       return search(arr, target, mid+1, e);
//     }
//   }
//   if(target >= arr[mid]&&target <= arr[e]){
//     return search(arr, target, mid+1, e);
//   }
//   return search(arr, target, s, mid-1);
// }


//triangle
// public static void main(String[] args) {
//     triangle(4, 0);
// }
// static void triangle (int row, int col){
//     if(row==0){
// return ;
//     }
//     if(col<row){
//         System.out.print(" *");
//         triangle(row, col+1);
//     }
//     else{
//         System.out.println();
//         triangle(row-1, 0);
//     }

// }

// public static void main(String[] args) {
//     triangle2(4,0);
// }
// static void triangle2 (int row, int col){
//     if(row==0){
// return ;
//     }
//     if(col<row){
     
//         triangle2(row, col+1);
//            System.out.print("* ");
//     }
//     else{
        
//         triangle2(row-1, 0);
//     System.out.println();}

// }

public static void  main(String[] args) {
    int []arr={3,2,1,4,};
    bubble(arr,arr.length-1 , 0);
    System.out.println(Arrays.toString(arr));
}
static int bubble(int[]arr,int r , int c){
    if(r==0){
        return -1;
    }
    if(c<r){
        if(arr[c]>arr[c+1]){
            //swap
            int temp = arr[c];
            arr[c]=arr[c+1];
            arr[c+1]=temp;
        }
        return bubble(arr, r, c+1);
    }
    else{
        return bubble(arr, r-1, 0);
    }
}
      }
