class Main {
  public static void main(String[] args) {
    System.out.println("Shapes!");
    square(2);
    System.out.println();
    square(5);
    System.out.println();
    square(10);
    System.out.println();
    rectangle(4);
    System.out.println();
    triangle1(6);
    System.out.println();
    triangle2(3);
  }//end of main method
  
  public static void square(int s) {  
    for (int row = 0; row < s; row++) {
      for (int col = 0; col < s; col++) {
        System.out.print("* ");
      }//end of inner square for loop
      
      System.out.println();//next line
      
    }//end of square for loop
    
  }//end of square method

  public static void rectangle (int r) {
    for (int row = 0; row < r; row++ ) {
      for (int col = 0; col <= r; col++) {
        System.out.print("* ");
      }//end of inner rectangle for loop

      System.out.println();
      
    }//end of rectangle for loop
    
  }//end of rectangle method

   public static void triangle1 (int t) {
    for(int row = 0; row < t; row++) {
      for(int col = 0; col <= row; col++) {
        System.out.print("* ");
      }//end of inner triangle1 for loop

      System.out.println();

    }//end of triangle1 for loop
    
  }//end of trangle1 method

  public static void triangle2 (int p) {
    for(int row = 0; row < p; row++) {
      for(int col = row - p; col > 1; col--) {
        System.out.print(" ");
      }//end of inner triangle2 for loop
    
      for (int col = 0; col <= row; col++ ) {
        System.out.println("* ");
      }//end of second inner triangle2 for loop
    
      System.out.println();
      
    }//end of triangle2 for loop
    
  }//end of trangle2 method
  
}//end of class
