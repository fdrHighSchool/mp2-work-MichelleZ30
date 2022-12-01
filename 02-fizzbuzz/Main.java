import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please enter a number to start the Fizz Buzz procress :D: ");
      int num = s.nextInt();
    s.close();
    
    for (int i = 0; i<101; i++) {
      System.out.println(i + ":" + num);
    }
    
    }//end of main method

  public static String fizzBuzz(int num) {
    if (num % 3 == 0 && num % 5 == 0) {
      System.out.println("Your number is a: Fizz Buzz.");
    }
    else if (num % 3 == 0) {
      System.out.println("Your number is a: Fizz.");
    }
    else if (num % 5 == 0) {
     System.out.println("Your number is a: Buzz.");
    }

    else {
       System.out.println(num);
    }
    return num;
  }
  
}//end of class
