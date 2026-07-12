import java.util.Scanner;
public class basicsrevise {
public static void main(String[]args){
// System.out.println("hello world");
 Scanner sc = new Scanner(System.in);
// //inputs in java
// int a=sc.nextInt();
// sc.close();
//armstrong
// int num=sc.nextInt();
// int temp =num;
// int sum=0;
// while(temp>0){
//     int digit= temp%10;
//      sum +=(int)Math.pow(digit,3);
//      temp/=10;
// } 
// if(sum==num){
//     System.out.println("arm");
// }
int arr []={1,2,3,4,5,6,7};
int sum =0;
for(int i=0;i<arr.length;i++){

sum+=arr[i];

}
System.out.println(sum);
 }
 }