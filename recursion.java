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


public static void main(String[] args) {
    int[] arr={1,2,4,3,8,10};
    System.out.println(sorted(arr,0));
}
static boolean sorted(int[]arr,int index){
    //base condition
    if(index==arr.length-1){
        return true;
    }
    return arr[index]<arr[index+1]&sorted(arr,index+1);
}
      }
