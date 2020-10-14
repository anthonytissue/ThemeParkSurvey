import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    System.out.println("");
    System.out.println("Welcome to FunWorld");
    System.out.println("");
    System.out.println("Before entering, complete this simple survey to help FunWorld in the future.");
    System.out.println("");
    System.out.println("");
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    //used scanner here
    String name = sc.next();
    System.out.println("");
    System.out.println("Why did u decide to come to FunWorld today " + name);
    String why = sc.next();
    System.out.println("");
    System.out.println("What is your height?");
   int height = sc.nextInt(); //type your height here
   if(height >= 54 && height <= 78)
   {
    System.out.println("You can ride the Swirly Snake");
   }
   else
   {
    System.out.println("You cant ride the Swirly Snake");
   }
    System.out.println("");
   System.out.println("How do you rate the quality of this survey?");
  for (int yes = 0; yes < 6; yes ++)
   System.out.println(yes);
   int yes = sc.nextInt();
   System.out.println("Thank you for your feedback");



  }
} 

