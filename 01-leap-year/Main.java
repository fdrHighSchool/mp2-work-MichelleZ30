import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner u = new Scanner(System.in);
    System.out.println("What is your year? :");
    int year = u.nextInt();
    System.out.println("Is it a leap year? : " + isLeapYear(year));
    u.close();
  }//end of main method
  
  public static boolean isLeapYear(int year){
    if (year % 4 != 0 || (year % 100 == 0 &&  year % 400 != 0)){
      return false;
    }
    return true;
  }//end of boolean
  
}//end of class
