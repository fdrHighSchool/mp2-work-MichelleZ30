import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("What is the amount of quarters in the end of entered number?: ");
    Scanner c = new Scanner(System.in);
    String cent = c.nextLine();
    String x = cent.substring(cent.length()-2, cent.length());
    int quarters = Integer.parseInt(x)%25;
    System.out.println("Amount of quarters: " + quarters);
    c.close();
  }
}
