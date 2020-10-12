import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Welcome to FunWorld");
    System.out.println("");
    System.out.println("Before entering, complete this simple survey to help FunWorld in the future.");
    System.out.println("");
    System.out.println("");
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scan.next();
    System.out.println("");
    System.out.println("Why did u decide to come to FunWorld today " + name);
    String why = scan.next();
    System.out.println("");
    System.out.println("Rate the Dragons Breath Rollar Coaster.");
    System.out.println("1 2 3 4 5 6 7 8 9 10");
    String rate = scan.next();
    System.out.println("");
   if(height >= 54 && height <= 78)
   {
    System.out.println("You can ride");
   }
   else
   {
    System.out.println("You cant ride");
   }



  }
} 

