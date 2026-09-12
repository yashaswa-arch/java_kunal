public class patterns{
    public static void main(String[] args) {
       // pattern1(4);
      // pattern2(6);
//          // pattern3(5);
// pattern4(5);
//pattern5(5);
//pattern30(5);
int cha='Z';
int a = 'Y';
System.out.println(cha+a);
      }
    // static void pattern1(int n ){
    //     for(int row = 1;row<= n ;row++){
    //         //for every row run the column
    //      for(int col = 1; col<= row;col++){
    //         System.out.print("* ");
    //      }
    //      //when one row is printed we need new line
    //      System.out.println();
    //      /* 
    //      * 
    //      * * 
    //      * * * 
    //      * * * * 
    //      */
    //     }
    // }

//     static void pattern2 (int n){
//         for(int row = 1;row<= n ;row++){
//              //for every row run the column
//           for(int col = 1; col<=n;col++){
//              System.out.print("* ");
//           }
//          //when one row is printed we need new line
//           System.out.println();
// * * * * * * 
// * * * * * * 
// * * * * * * 
// * * * * * * 
// * * * * * * 
// * * * * *  
//     }
//      }

// static void pattern3 (int n){
//         for(int row = 1;row<= n ;row++){
//              //for every row run the column
//           for(int col = row; col<=n;col++){
//              System.out.print("* ");
//           }
//          //when one row is printed we need new line
//           System.out.println();
// }
//  }

// static void pattern4 (int n){
//         for(int row = 1;row<= n ;row++){
//              //for every row run the column
//           for(int col = 1 ;col<=row;col++){
//              System.out.print(col);
//           }
//          //when one row is printed we need new line
//           System.out.println();
// }
//  }

// static void pattern5 (int n){
//         for(int row = 0;row< 2*n ;row++){
//          int totalcolsinrows= row > n ? 2 * n-row:row;           //for every row run the column
//           for(int col = 0; col<totalcolsinrows;col++){
//              System.out.print("* ");
//           }
//          //when one row is printed we need new line
//           System.out.println();
//           * 
//           * * 
//           * * *  
//           * * * * 
//           * * * * * 
//           * * *  
//           * * 
//           * 
// }
//  }

// static void pattern28(int n){
//          for(int row = 1;row< 2 * n ;row++){
//             int totalcolsinrows= row > n ? 2 * n-row:row;
//             //no of spaces
            
//              int spaces= n -totalcolsinrows;
//              for (int s = 0;s<spaces;s++){ 
//              System.out.print(" ");
//              }
//              //for every row run the column
//           for(int col = 0; col<totalcolsinrows;col++){
           
//              System.out.print("* ");
//            }
//          //when one row is printed we need new line
//           System.out.println();
//  }
//   }

// static void pattern30 (int n){
//          for(int row = 1;row<= n ;row++){
//             //no of spaces
//             for(int space = 0;space<n-row;space++){
//                System.out.print(" ");
//             }
//               //for every row run the column
//            for(int col = row ;col>=1;col--){
//               System.out.print(col);
//            }
//               //for every row run the column
//            for(int col = 2 ;col<=row;col++){
//               System.out.print(col);
//            }
//           //when one row is printed we need new line
//            System.out.println();
//  }
//   }
//     1
//    212
//   32123
//  4321234
// 543212345

// static void pattern30 (int n){
//          for(int row = 1;row<= n ;row++){
//             //no of spaces        
//                 for(int space = 0;space<n-row;space++){
//                System.out.print(" ");
//             }
//               //for every row run the column
//            for(int col = row ;col>=1;col--){
//               System.out.print(col);
//           }
//               //for every row run the column
//             for(int col = 2 ;col<=row;col++){
//                System.out.print(col);
//             }
//            //when one row is printed we need new line
//             System.out.println();
//  }
//    }

       }
