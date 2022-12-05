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
