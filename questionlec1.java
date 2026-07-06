//Write a program to print whether a number is even or odd, also take input from the user.
// Take name as input and print a greeting message for that particular name.
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
// Take 2 numbers as input and print the largest number.
// Input currency in rupees and output in USD.
// To calculate Fibonacci Series up to n numbers.
// To find out whether the given String is Palindrome or not.
// To find Armstrong Number between two given number.
//case check
//counting of digits occurence
import java.util.Scanner;
public class questionlec1 {
    public static void main(String[] args) {
        //1 
        Scanner sc= new Scanner(System.in);
        // System.out.println("please enter number to check");
        // int num= sc.nextInt();
        // if(num<=1){
        // System.out.println("neither prime nor composite");
        // return;
        // }
        
        // for(int i=2;i*i<=num;i++){
        // if(num%i==0){
        // System.out.println("is not prime");
        //  return;
        // }
        //  System.out.println("is prime");
        //  }
         
        //2
        // System.out.println("please enter your full name ");
        // String name =sc.nextLine();
        // System.out.println("hello "+name+" how are you?\nhope you are doing fine");
        
        
        //3 
        // System.out.println("please enter principal amount");

        // double principal=sc.nextDouble();
         
        // System.out.println("please enter time");
        // int time = sc.nextInt();

        // System.out.println("please enter rate in decimal");
        // float rate=sc.nextFloat();

        // double simpleIntrest= principal*time*rate;
        // double total=principal+simpleIntrest;       
        // System.out.println(simpleIntrest+"\nintrest earned total"+total);


        //4
        
        // System.out.println("please enter the first no");
        // double num1=sc.nextDouble();

        // System.out.println("what you want to do?\n(+,*,/,-)");
        // char operator = sc.next().charAt(0);

        // System.out.println("please enter second num");
        // double num2 = sc.nextDouble();

        // double result =0;

        // if(operator=='+'){
        // result = num1+num2;
        // }
        // else if(operator=='-'){
        //     result=num1-num2;
        // }
        // else if(operator=='*'){
        //     result=num1*num2;
        // }
        // else if(operator=='/'){
        //     if(num2!=0){
        //         result=num1/num2;
        //     }
        //     else{
        //         System.out.println("num cannot be divided error");
        //         return;
        //     }
        // }
        // else{
        //     System.out.println("invalid operator");
        //     sc.close();
        //     return;
        // }
        // System.out.println("result: "+ result);

        //fibonacii
        // System.out.println("select for how many num you want series?");
        // int num=sc.nextInt();

        // int first =0 ,second =1;

        // if(num<=1){
        //     System.out.println("no series");
        //     return;
        // }
        // for(int i = 0;i<num;i++){
        //     System.out.println(first+" ");
        //     int next = first+second;
        //     first=second;
        //     second = next;
        // }


        //5

    // System.out.println("please enetr the string you want to check");
    // String name= sc.nextLine();
    // String rev = "";

    // for(int i=name.length()-1;i>=0;i--){
    // rev=rev+name.charAt(i);
    // }
    //  if(name.equalsIgnoreCase(rev)){
    //     System.out.println(rev+" palindorme");
    //  }    
    //  else{
    //     System.out.println("not palindrome");
    //  }

    //for digit
  
        // int num = 121;
        // int original = num;
        // int reverse = 0;

        // while (num > 0) {
        //     int digit = num % 10;
        //     reverse = reverse * 10 + digit;
        //     num = num / 10;
        // }

        // if (original == reverse) {
        //     System.out.println("Palindrome");
        // } else {
        //     System.out.println("Not Palindrome");
        // }
    



    //10 find largest among numbers

    // int a=sc.nextInt();
    // int b= sc.nextInt();
    // int c=sc.nextInt();
    // int max=a;
    // if(b>max){
    //     max=b;
    // }
    // if(c>max){
    //     max=c;
    // }

    //or
    //  int max= Math.max(c,Math.max(a, b));
    // System.out.println(max);

    // 11 case check

    //for char input we take astring input and take the first letter of it
    //trim basically removes all extra spaces after and before

    //char ch= sc.next().trim().charAt(0);
    //if(ch=='a'&&ch=='z'){
    //System.out.println("lowercase "+ ch);
    //}
    //else{
    //System.out.println("uppercase "+ch);
    //}
    

    //12 digit occurrence check
    // System.out.println("please enetr the number");
    // int a = sc.nextInt();
    // System.out.println("please enetr the digit you want to find occurrence");
    // int digit = sc.nextInt();
    // int count=0;
    // while(a>0){ 
    // int rem= a%10;//extracts the last digit
    // if(rem==digit){
    //     count++;
    //     System.out.println("your digit occured "+count+ " times");
    // }
    // a/=10;//removes the digit
// }  

// reversing a num manually
//    System.out.println("please enetr a num");
//    int num=sc.nextInt();
//    int rev=0;
//    while(num>0){
//      int digit=num%10;
//      rev=rev*10+digit;
//      num/=10;
    
//    } System.out.println(rev + " reverse" );

//armstrong
//  int num=sc.nextInt();
//  int temp =num;
//  int sum=0;
// int length = String.valueof(num).length();
//  while(temp>0){
//      int digit= temp%10;
//       sum +=(int)Math.pow(digit,length);
//       temp/=10;
//  } 
//  if(sum==num){
//      System.out.println("arm");
//  }
    }
    }
    

