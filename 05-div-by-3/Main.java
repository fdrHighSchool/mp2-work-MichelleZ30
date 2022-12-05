import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Please enter your number to see if it divisible by 3 : ");
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();
    int sum = 0;
    int dight;
    s.close();

    while (num > 0) {
      int digit = num % 10;
      sum = sum + digit;
      num = num / 10;
    }//end of else for method
    
    if (sum % 3 == 0){
        System.out.println("The number is divisible by 3.");
      }
      
    else {
        System.out.println("Not divisible by 3.");
    }
    
  }//end of main method
  
}//end of class
//if (num % 3 == 0) {
   //   System.out.println("The number is divisible by 3.");
   // }//end of if method
