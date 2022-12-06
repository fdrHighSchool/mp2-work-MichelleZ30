//spicy 1 question 1
class Main {
  public static void main(String[] args) {
    String a = "abc";
    String b = "cat"; 
    System.out.println(conCat(a, b));
  }//end of main
  public static String conCat (String a, String b) {  
    String conCat = "";
    
    if ((a.substring(a.length()-1)).equals(b.substring(0, 1))){
       return conCat += a + b.substring (1);
     }//end of if statement
      
    else {
      return conCat += a + b;
    }//end else statment
    
  }//end of conCat method
  
}//end of class



//spicy 1 question 2
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("What half word you want to find out?: ");
    String word = s.nextLine();
    System.out.println(word.substring(0, word.length() / 2));
    s.close();
  }// end of main method

}// end of class



//spicy 2 question 
class Main {
  public static void main(String[] args) {
  String hi = "ABChi hi";
  System.out.println(countHi(hi));
  }
  public static int countHi (String hi) {
    int num = 0;
    for (int i = 0; i <= hi.length() - 2;i++) {
      if (hi.substring(i, i+2).equals("hi")) {
        num++;
      }
    }
   return num;
  }
}
