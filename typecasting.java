    import java.util.Scanner;
public class typecasting {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //since int can be converted to float directly for example
        //65 as input output will be 65.0 
        // float a = sc.nextFloat();

        //converting Float to Integer THROUGH NARROWING 
        //large datatype to short (EXPLICIT TYPE CONVERSION)

        // int a =(int)(54.6666666);
        // System.out.println(a);

        //AUTOMATIC type promotion conversion
        //the max byte can have is 256 i gave 257
        //it will do 257%256=1; and give it 1 as output

        // int a = 257;
        // byte b =(byte)(a);
        // System.out.println(b);

//          int a = 'A';
//          System.out.println(a);
//  sc.close();
     }
    
}
