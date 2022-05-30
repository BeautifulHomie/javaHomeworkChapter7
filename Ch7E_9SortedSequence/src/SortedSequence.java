import java.util.Arrays;

public class SortedSequence
{
   
   public static int[] randomlyGenerated(int n)
   {
      int[] numbers = new int[n];
      for (int i = 0; i < n; i++)
      {
    	  numbers[i] = (int) (Math.random() * 100);
      }
      return numbers;
   }

   public static void printArray(int[] values)
   {
      for (int i = 0; i < values.length; i++)
      {
         System.out.print(values[i] + " ");
      }
      System.out.println();
   }

   public static void main(String[] args)
   {
      int[] values = randomlyGenerated(20);
      printArray(values);
      Arrays.sort(values);
      printArray(values);
   }
}