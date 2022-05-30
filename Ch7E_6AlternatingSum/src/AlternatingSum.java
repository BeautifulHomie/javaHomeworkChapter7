public class AlternatingSum
{
   
   public static double alternatingSum(double[] values)
   {
      double total = 0;
      for (int i = 0; i < values.length ; i++)
      {
         if (i % 2 == 0)
         {
            total += values[i];
         }
         else
         {
            total -= values[i];
         }
      }
      return total;
   }

   public static void main(String[] args)
   {
      double[] valueArray = { 11, 4.5, 99.9, 186, 0.9, 75, 44, 8.9, 11.11 };
      double total = alternatingSum(valueArray);
      System.out.println("Alternating sum of numbers is: " + total);
   }
}