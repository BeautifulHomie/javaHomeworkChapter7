import java.util.Scanner;

public class StudentTest
{
   public static void main(String[] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      Student goku = new Student(100);
      
      System.out.println("Please enter scores and Q to quit: ");
      
      while (keyboardIn.hasNextDouble())
      {
         if (!goku.addScore(keyboardIn.nextDouble()))
         {
            System.out.println("Too many scores."); 
            return;
         }
      }
      goku.removeMin();
      System.out.println("Total without minimum score: " + goku.finalScore());
   }
}