public class Sequence 
{
   private int[] values; 

   public Sequence(int size)
   {
      values = new int[size];
   }

   public void set(int i, int n)
   {
      values[i] = n;
   }
   
   public boolean equals(Sequence other)
   {
      if(values.length != other.values.length) return false;
      for(int i = 0; i < values.length; i++)
      {
         if(values[i] != other.values[i]) return false;
      }
      return true;
   }

   public boolean sameValues(Sequence other)
   {
      int valCount = countUniqueValues(this);
      if(valCount != countUniqueValues(other)) return false;
      int[] uniqueValues = new int[valCount];
      int uniqueValCount = 0;
      for(int i = 0; (i < values.length) && (uniqueValCount < valCount); i++)
      {
         boolean unique = true;
         for(int j = 0; j < uniqueValCount; j++)
         {
            if(values[i] == uniqueValues[j]) unique = false;
         }
         if(unique)
         {
            uniqueValues[uniqueValCount] = values[i];
            uniqueValCount++;
         }
      }
      boolean hasSameValues = true;
      for(int i = 0; (i < other.values.length) && hasSameValues; i++)
      {
         boolean uniqueFound = false;
         for(int j = 0; j < uniqueValCount; j++)
         {
            if(other.values[i] == uniqueValues[j]) uniqueFound = true;
         }
         if(!uniqueFound) hasSameValues = false;
      }
      return hasSameValues;
   }

   public static int countUniqueValues(Sequence sequence)
   {
      int count = 0;
      for(int i = 0; i < sequence.values.length; i++)
      {
         boolean unique = true;
         for(int j = i - 1; j >= 0; j--)
         {
            if(sequence.values[j] == sequence.values[i]) unique = false;
         }
         if(unique) count++;
      }
      return count;
   }
}