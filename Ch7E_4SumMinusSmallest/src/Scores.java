import java.util.Scanner;

public class Scores
{

   public static double sumWithoutSmallest(double[] numbers, int currentSize)
   {
      double total = 0;
      double smallestNumber = numbers[0];
      
      for (int i = 0; i < currentSize; i++)
      {
         if (numbers[i] < smallestNumber)
         {
        	 smallestNumber = numbers[i];
         }
         total = total + numbers[i];
      }
      return total - smallestNumber;
   }

   public static void main(String[] args)
   {
      final int LENGTH = 100;
      double[] scores = new double[LENGTH];
      int size = 0;

      System.out.println("Please enter scores and Q to quit:");
      Scanner keyboardIn = new Scanner(System.in);
      
      while (keyboardIn.hasNextDouble() && size < scores.length)
      {
         scores[size] = keyboardIn.nextDouble();
         size++;
      }
      if (scores.length == 0)
      {
         System.out.println("At least one score is required to comppute.");
         return;
      }
      
      double total = sumWithoutSmallest(scores, size);
      System.out.println("Total without smallest score: " + total);
   }
}