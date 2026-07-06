import java.util.Arrays;
public class arrays{
    //public static void main(String[] args) {
        
        //basic syntax includes 
        //Datatype[] variable_name=new datatype[size];
        //or directly also
        //int[] a={10,30,40,1};
        //example
        //int [] ros= new int[5];

        //int [] ros means declaration of arrays ros getting defined in stack memory and compile time created

        //ros= new int[5] object is being created in memory heap.and created at run time which means dynamic memory allocation

        //In Java, heap objects are not guaranteed to be contiguous in memory, as the JVM specification explicitly states that heap memory does not need to be continuous.
        //therefore array objects may not be continuous

        // String [] arr =new String[4];
        // System.out.println(arr[1]); //output null

        //taking inputs //array of primtives
       // Scanner sc=new Scanner(System.in);
    //     System.out.println("plz enetr size");
    //     int n =sc.nextInt();

    //     int arr[]=new int[n];
    //     for(int i =0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    //   }
    //   //printing arrays method 1
    //   for(int num:arr){ 
    //   System.out.print(num+" ");//num represents element of the array
    // }

    //method 2
    // System.out.println(Arrays.toString(arr));//converting it into string of characters
   
    //method 3 
    //for(int i =0;i<arr.length;i++){
//System.out.println(arr[i]);//imp cause you can modify it
    //}



    //array of objects
//String [] str=new String[6];
//for(int i=0;i<str.length;i++){
//str[i]=sc.next();
// }
// System.out.println(Arrays.toString(str));
// //now we will mdoify it
// str[1]="yashu";
// System.out.println(Arrays.toString(str));
// //output
// [12, 5464, shgh, cfss, svs, sdv]
// [12, yashu, shgh, cfss, svs, sdv]

// public static void main(String[] args) {
//     int []num={3,4,5,12};
//     System.out.println(Arrays.toString(num));
//     change(num);
//     System.out.println(Arrays.toString(num));
    

    
// }
// static void change(int[]arr){
//     arr[0]=99;

// }
// //output
// [3, 4, 5, 12]
// [99, 4, 5, 12] //original value of num[0]is being changed this is known as mutability

}
