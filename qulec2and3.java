// Basic Java Programs
// Area Of Circle Java Program
// Area Of Triangle
// Area Of Rectangle Program
// Area Of Isosceles Triangle
// Area Of Parallelogram
// Area Of Rhombus
// Area Of Equilateral Triangle
// Perimeter Of Circle
// Perimeter Of Equilateral Triangle
// Perimeter Of Parallelogram
// Perimeter Of Rectangle
// Perimeter Of Square
// Perimeter Of Rhombus
// Volume Of Cone Java Program
// Volume Of Prism
// Volume Of Cylinder
// Volume Of Sphere
// Volume Of Pyramid
// Curved Surface Area Of Cylinder
// Total Surface Area Of Cube
// Fibonacci Series In Java Programs
// Subtract the Product and Sum of Digits of an Integer
// Input a number and print all the factors of that number (use loops).
// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
// Take integer inputs till the user enters 0 and print the largest number from all.
// Addition Of Two Numbers
// Intermediate Java Program

import java.util.Scanner;

public class qulec2and3 {
     
// public static void main(String[] args) {


 //1   
// System.out.println("please enter radius");
// Scanner sc = new Scanner(System.in);
// double rad=area(sc.nextDouble());//here method area called
// System.out.println(rad);
//  }
// static double area(double radius){
// return Math.PI*radius*radius;
//  }




//2 Area of triangle
// public static void main(String[] args) {
// Scanner sc =new Scanner(System.in);
// System.out.println("please enetr the base and height ");
// double ans=area(sc.nextDouble(),sc.nextDouble());
// System.out.println(ans);

// }
// static double area(double base,double height){
// return 0.5*base*height;
// }
//  }


//area of rhombus
//method by base aand height
//by using diagnols
// public static void main(String[] args) {
// Scanner sc=new Scanner (System.in);
// System.out.println("calculate by base and height or by diagonals");
// String ans =sc.nextLine();
// if(ans.equalsIgnoreCase("base and height")){
//     System.out.println("enter base and height");
//     System.out.println(area1(sc.nextDouble(), sc.nextDouble()));
// }
// if(ans.equalsIgnoreCase("diagonal")){
//     System.out.println("enter diagonal");
//     System.out.println(area2(sc.nextDouble(), sc.nextDouble()));
// }
    
// }
// static double area1(double base,double height){
//     return 0.5*base*height;
// }
// static double area2(double d1,double d2){
//     return 0.5*d1*d2;
// }
//  }


//VOLUME OF CONE

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//  System.out.println("please enetr the radius and height"); 
//  double ans=vol(sc.nextDouble(), sc.nextDouble());
//  System.out.println(ans);  
// }
// static double vol(double radius ,double height){
//     return 0.33*Math.PI*radius*radius*height;

// }

//fibonacci series
// public static void main(String[] args) {
//     System.out.println("please enetr upto which no.you want");
//     Scanner sc=new Scanner(System.in);
//     int num=sc.nextInt();
//     series(num);
    


// }
// static void series(int number){
//     if(number<=1){
//         System.out.println("no series");
//         return;
//     }
//     int num1=0;
//     int num2=1;
//     for(int i=0;i<number;i++){
//         System.out.println(num1+ " ");
//         int sum=num1+num2;
//         num1=num2;
//         num2=sum;
//     }
    
// }

//Subtract the Product and Sum of Digits of an Integer


// public static void main(String[] args) {
//     Scanner sc=new Scanner (System.in);
//     System.out.println("enter the no you want to perform op");
//     int a=sc.nextInt();
//     int subtract=product(a)-sum(a);
//     System.out.println(subtract);

    
// }
// static int product(int digit) {
//     int pro=1;
//     while(digit>0){
//         int digits=digit%10;
//         pro=pro*digits;
//         digit/=10;
//         }
//         return pro;
// }
// static int sum(int no){
//     int total=0;
//     while(no>0){
//         int digits=no%10;
//         total+=digits;
//         no/=10;
   
//     }
//          return total;

// }

//Input a number and print all the factors of that number (use loops).

// public static void main(String[] args) {
//     System.out.println("tell number you want factors ");
//     Scanner sc=new Scanner(System.in);
//     int number=sc.nextInt();
//     for(int i=1;i<=number;i++){
//         if(number%i==0){
//             System.out.println(i+" these no divide the num given sucessfully");
//         }
//     }

// }


//sum of all numbers till users enetr 0
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int sum = 0;

    //     while (true) {
    //         int n = sc.nextInt();

    //         if (n == 0) {
    //             break;
    //         }

    //         sum += n;
    //     }

    //     System.out.println(sum);
    // }
}