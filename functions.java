
public class functions {
    public static void main(String[] args) {//for calling a method in main the method should also e static otherwise it will show error
        //sum();


        // int ans=sum2();
        // System.out.println(ans);//by using static int sum 2 the sum 2 returned some value
                                   //which was stored in ans in main function

        // String greets=greet();     //the value whatever is in greet function is getting stored
        // System.out.println(greets);//in greets which means whatever value was in greet is stored in greets now.
        
        // int ans=sum3(20,40);//we gave values to the sum 3 parameters 
        // System.out.println(ans);//whenever code starts it will come check parameters goes to fun then return the ans

        //    Scanner sc = new Scanner(System.in);//in this we took input and called it using func
        //    System.out.println("please enetr your name");
        //    String name=sc.next();
        //    String personalise=morning(name);
        //    System.out.println(personalise);


    //    String name="kunal bajwa";//if you see the fun we used naam
    //     nameswap(name);//which means in java it is passed by value and copy of name is naam 
    //     System.out.println(name);


    // int []arr={1,2,3,4,5,6};
    // changearr(arr);
    // System.out.println(Arrays.toString(arr));

    }
    // static void sum(){
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("please enetr num 1");
    //     int num1=sc.nextInt();
    //     System.out.println("enetr num 2");
    //     int num2 = sc.nextInt();
    //     int sum = num1 +num2 ;
    //     System.out.println(sum);

    //returning the value
    //using static int it means it will return int value
    //writing same  code

        //  static int sum2(){
        //  Scanner sc = new Scanner(System.in);
        //  System.out.println("please enetr num 1");
        //  int num1=sc.nextInt();
        //  System.out.println("enetr num 2");
        //  int num2 = sc.nextInt();
        //  int sum = num1 +num2 ;
        //  return sum;

        //NOW RETURNING STRING  
        // static String greet(){
        // Scanner sc = new Scanner(System.in);
        // String greeting="how are you??";
        // return greeting; 



        //NOW RETURNING WITH PARAMETERS
        //INSIDE THE FUNCTION();

        // static int sum3(int a,int b){
        //     int sum=a+b;
        //     return sum;
        // }

        //more example using string

        // static String morning(String name){
        //     String message="good morning leader "+name;
        //     return message;
        // }


        //pass by value

    //     static void swap(int a, int b){
    //    int temp=a;
    //    a=b;
    //    b=temp;
    //     }   

    // static void nameswap(String naam){
    //      naam="rahul singh";//name didn't change to rahul because we are creating new object here
    // }


    //now for ARRAYS

    // static void changearr(int[] nums){
    //     nums[0]=99;//if you make changes via this object through ref var same will be seen in the main object 
    // }    //here we are modifying object not creating new and string are immutable cannot be modified

         }

    

