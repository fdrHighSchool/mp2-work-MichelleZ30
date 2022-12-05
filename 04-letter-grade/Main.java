import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner g = new Scanner(System.in);
    System.out.println("Enter your number grade to find out your letter grade:");
    int grade = g.nextInt();
    int x = grade % 10;
    String letterGrade = "";

    if (grade == 100){
      letterGrade += "A+";
    }

    else {
      
    if (grade >= 90) {
      letterGrade += "A";
      if (x >= 7) {
        letterGrade += "+";
       }
       else if (x <= 3) {
        letterGrade += "-";
      }
    }//end of inner if statement
      
    else if (grade >=80) {
      letterGrade += "B";
      if (x >= 7) {
        letterGrade += "+";
       }
      else if (x <= 3) {
        letterGrade += "-";
      }
    }//end of inner 1 else if statement
      
    else if (grade >= 70) {
      letterGrade += "C";
      if (x >= 7) {
        letterGrade += "+";
       }
      else if (x <= 3) {
        letterGrade += "-";
      }
    }//end of inner 2 else if statement
      
    else if (grade >= 60) {
      letterGrade += "D";
        if (x >= 7) {
          letterGrade += "+";
         }
        else if (x <= 3) {
          letterGrade += "-";
        }
     }//end of inner 3 else if statement
    
      
    else {
      letterGrade += "F";
    }//end of inner else statement for F
      
    }//end of else statement
    
   System.out.println(letterGrade);
    
  }// end of main

}// end of class
