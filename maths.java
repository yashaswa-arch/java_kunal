import java.util.ArrayList;

public class maths {
//     public static void main(String[] args) {
//         int a = 44;
//         for (int i = 1;i<a;i++){ 
//         System.out.println(i+" "+isprime(i));
// }
//     }
// static boolean isprime(int n){
//     if(n<=1){
//         return false;
//     }
//     int c = 2;
//     while(c*c<=n){
//         if(n%c==0){
//             return false;
//         }
//         else{
//             c++;
//         }
//     }
//     return true;
// }    

// public static void main(String[] args) {
//     int n =40;
//     boolean[]primes=new boolean[n+1];
//     sieve(n,primes);
// }
// //false in array means no is prime
// static void sieve(int n , boolean[]primes){
// for(int i =2;i*i<=n;i++){
//     if(primes[i]==false /* !primes[i] */){
// for(int j= i*2;j<=n;j+=i){
//     primes[j]=true;
// }
//     }
// }
// for(int i =2;i<=n;i++){
//     if(!primes[i]){
//      System.out.println(i+"  ");   
//     }
// }
// }
 

//sqrt 
// public static void main(String[] args) {
//     int num = 40;
//     int p = 3;
//     System.out.printf("%.3f",sqrt(num,p));
    
// }
// static double sqrt(int n , int p ){
//     int start = 0 ;
//     int e = n;
//     double root = 0.0;
//     while(start<=e){
//         int m = start +(e-start)/2;
//         if(m*m==n){
//             return m;
//         }
//         if(m*m>n){
//             e=m-1;

//         }
//         else{
//             start=m+1;
//         }
//     }
//     double incr=0.1;
//     for(int i = 0;i<p;i++){
//         while(root*root<=n){
//             root+=incr;
//         }
//         root-=incr;
//         incr/=10;
//     }
//     return root;
// }
// public static void main(String[] args) {
//     System.out.println(sqrt(40));
// }
// static double sqrt(int n){
//     double x = n;
//      double root;
//     while(true){
//     root = 0.5*(x+(n/x));
//     if(Math.abs(root-x)<1){
//         break;
//     }    
//     x= root;
//     }
//     return root;
// }

//factors
// public static void main(String[] args) {
//     factors2(20);
// }
// static void factors2(int n){
//     for(int i =1;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//             if(n/i==i){
//                 System.out.println(i);
//             }
//             else { 
//             System.out.println(i+" "+n/i);
//             }
//         }
//     }

// }

public static void main(String[] args) {
    factors3(20);
}
static void factors3(int n){
    ArrayList <Integer> list = new ArrayList<>();
     for(int i =1;i<=Math.sqrt(n);i++){
        if(n%i==0){
            if(n/i==i){
                 System.out.println(i);
             }
             else { 
             System.out.println(i+" ");
             list.add(n/i);
             }
         }
     }
for(int i = list.size()-1;i>=0;i--){
    System.out.println(list.get(i)+" ");
}
 }
  }
