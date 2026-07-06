import java.util.Scanner;
public class lec2nested {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter emp id");
       int empid=sc.nextInt();
       System.out.println("please enetr department ");
       String dept=sc.next();

    //    switch (empid) {
    //        case 1:
    //            System.out.println("ramesh tendulkar");
    //            break;
    //            case 2:
    //             System.out.println("sachin tendulkar");
    //             break;
                
    //             case 3:
    //                 System.out.println("ms dhoni");
    //             switch(dept){
                    
    //             case "batsman":
    //                 System.out.println("top in odi 2010");
    //                 break;
    //             case "bowling":
    //                 System.out.println("part time bowler fast");
    //             break;
    //              case "keeper":
    //             System.out.println("terrific keeper");
    //             break;
    //             }
    //             break;
    //        default:
    //            System.out.println("no data found");
    //    }
//another way of same code comapct 
// switch(empid){
// case 1 -> System.out.println("sachin tendulkar");
// case 2 -> System.out.println("ramesh tendulkar");
// case 3 ->{ 
//     System.out.println("ms dhoni");
//     switch(dept){ case "batsman"->
//                      System.out.println("top in odi 2010");
                    
//                 case "bowling"->
//                     System.out.println("part time bowler fast");
                
//                  case "keeper"->
//          System.out.println("terrific keeper");
//                 default->System.out.println("no");
//              } 
// }
// default->System.out.println("wrong id");
//  }
    }
}
