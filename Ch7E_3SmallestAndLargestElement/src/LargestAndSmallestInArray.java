import java.util.Scanner;

public class LargestAndSmallestInArray
{
   public static void main(String[] args)
   {
      final int LENGTH = 100;
      double[] numbers = new double[LENGTH];
      int size = 0;

      System.out.println("Please enter values then Q to quit:");
      Scanner keyboardIn = new Scanner(System.in);
      while (keyboardIn.hasNextDouble() && size < numbers.length)
      {
         numbers[size] = keyboardIn.nextDouble();
         size++;
      }

      double largest = numbers[0];
      double smallest = numbers[0];
      for (int i = 1; i < size; i++)
      {
         if (numbers[i] > largest)
         {
            largest = numbers[i];
         }
         if (numbers[i] < smallest)
         {
            smallest = numbers[i];
         }
      }

      for (int i = 0; i < size; i++)
      {
         System.out.print(numbers[i]);
         if (numbers[i] == largest)
         {
            System.out.print(" <== largest value");
         }
         if (numbers[i] == smallest)
         {
            System.out.print(" <== smallest value");
         }
         System.out.println();
      }
   }
}