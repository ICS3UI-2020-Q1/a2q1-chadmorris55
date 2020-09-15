import java.util.Scanner;

/**
 * This program checks if an integer is even or odd
 * @chad
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    final int DIVISOR = 2;
    final int EVEN = 0;
    //tells user to input a number and records that number
    System.out.println("Please enter an integer:");
    int number = input.nextInt();
     
   //divides integer by 2 
   int checkNum = number % DIVISOR;
   
   //checks to see if the remainder is 1 or 0
   if (checkNum == EVEN){
     System.out.println(number + " is an even number");
   } else {
     System.out.println(number + " is an odd number");
   }

  }
}
