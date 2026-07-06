import java.util.Scanner;
public class tempconversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     System.out.println("Please enter temp in ceclius");
     float temp=sc.nextFloat();
     double c = (temp * 9/5) +32;
     System.out.println("temperature in farehniet is "+c+"F");
    }
    
}
