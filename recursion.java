public class recursion {
    public static void main(String[] args) {
        //write a fucntion 
        // print(1);
System.out.println(fibo(6));
    }
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

    static int fibo(int n){
        //base condition
if(n<2){
    return n;  
}
return fibo(n-1)+fibo(n-2);
    }
}
