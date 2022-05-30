import java.util.Arrays;

public class ReverseElements
{
	
   public static double[] reverse(double[] numbers)
   {
      double[] revData = Arrays.copyOf(numbers, numbers.length);
      int j = 0;
      for (int i = numbers.length - 1; i >= 0; i--) 
      {
         revData[j] = numbers[i];
         j++;
      }
      return revData;
   }
   
   public static void main(String[] args)
   {
      double[] data = { 1.6, 54, 89.8, 1.6, 93, 722, 4.09, 29, 11.7 };
      double[] reversed = reverse(data);
      for (int i = 0; i < reversed.length; i++) 
      {
         System.out.print(reversed[i] + " ");
      }
      System.out.println();
   }
}