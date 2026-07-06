public class scope {
    //shadowing
    static int x = 90;//why using static as to intialize without using object we use static keyword
    public static void main(String[] args) {
    // System.out.println(x);

    // int x= 40;
    // System.out.println(x);//shadwoing method 40 intialized locally inside main 
    // fun();

     }//here main ends it will print 90 40 90 again as fun is outside scope of main

    //anything initialized outside the scope {} can be used inside the scope {inside}
    //anything initlaised inside the scope can be re initialized outside the scope 
    //int a =10 ;
    //int b=30;
    //{
        //int a=20;//it will give an error already initialized outside
        //a =30;//no error value updated of the refrence variable
     //   int c =99;//initalizing outside    
    //}
    //int c=9000;can be re-intialized outside the scope
   // System.out.println(c);

   //ANOTHER CONCEPT SHADOWING
//  static void fun(){
//     System.out.println(x);
//    }
    }

//IMPORTANT CONCEPT VARIABLE OF ARGUMENTS (VARAGS)
//WHEN YOU DONT KNOW 