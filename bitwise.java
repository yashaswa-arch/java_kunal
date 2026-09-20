public class bitwise {
    public static void main(String[] args) { 
        // int n = 232;
        // System.out.println(isodd(n));

        //2
        // int []arr={2,3,2,3,4,6,4};
        // System.out.println(unique(arr));
//3

// magic no 
// int n= 6 ;
// int ans= 0;
// int base = 5;
// while(n>0){
//     int last = n&1;
//     n=n>>1;
//     ans+=last*base; 
//     base = base *5;
    
// }
// System.out.println(ans);

//4
//a^b

// int base = 3;
// int power = 6 ;
// int ans =1;
// while(power>0){ 
// if((power&1)==1){
//     ans*=base;
 
// }
//    base*=base;
//     power = power>>1;
// }
// System.out.println(ans);

//5
//no of set bits
 int a = 45;
 System.out.println(Integer.toBinaryString(a));//output 10110 represntation in bit
 System.out.println(setbits(a)); //output 4 no of set bits means 1 

    }
    //     int a = 12; // Binary: 1100
    //     int b = 10; // Binary: 1010

    //     System.out.println("a & b = " + (a & b));    // Output: 8  (1000)
    //     System.out.println("a | b = " + (a | b));    // Output: 14 (1110)
    //     System.out.println("a ^ b = " + (a ^ b));    // Output: 6  (0110)
    //     System.out.println("~a = " + (~a));          // Output: -13
    //     System.out.println("a << 1 = " + (a << 1));  // Output: 24 (11000)
    //     System.out.println("a >> 1 = " + (a >> 1));  // Output: 6  (0110)
    //     System.out.println("a >>> 1 = " + (a >>> 1));// Output: 6  (0110)
     

     //odd or even 
// static boolean isodd(int n){
//     return (n&1)==1;
// } 

// static int unique(int[] n){
//     int uniquee = 0;
//     for(int a : n){
//         uniquee^=a;

//     }
//     return uniquee;

// }

//magic no

// static int setbits(int n){
//     int count =0;
//     while(n>0){
//         n-=(n&-n);
// count++;
//     }
//     return count;
// }
    
    }
   