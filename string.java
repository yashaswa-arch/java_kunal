

public class string {
    public static void main(String[] args) {
        String str = "abcdba";
        System.out.println(ispalin(str));
}
        //pretty printing 
        //printf for formatted string
        
        // System.out.printf("hello my name is %s and iam %s","yash","cool");

        //for operators
    //     System.out.println('a'+'b');//ascii value
    //     System.out.println("a"+"b");//string
    //     System.out.println((char) ('a'+3)); // coverting in char output 100
    //     System.out.println("a"+1);

    //performance

    // String series="";
    // for (int i = 0; i < 26; i++) {
    // char ch = (char)('a'+i);
    // System.out.println(ch);        
    // }

    //string builder
    // StringBuilder builder = new StringBuilder();

    //palindrome
    
static boolean ispalin(String str) {
    str  =  str.toLowerCase();
    for(int i=0;i<str.length()/2;i++){
        char start = str.charAt(i);
        char end=str.charAt(str.length()-1-i);
if(start!=end){
    return false;
}

    }
    return true;
 }
 }



