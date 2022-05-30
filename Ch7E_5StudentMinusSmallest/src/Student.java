public class Student
{
   private double[] scores;
   private int scoreValue;

   public Student(int capacity)
   {
      scores = new double[capacity];
      scoreValue = 0;
   }

   public boolean addScore(double score)
   {
      if(scoreValue >= scores.length ) return false;
      scores[scoreValue] = score;
      scoreValue++;
      return true;
   }

   public double sum()
   {
      if(scoreValue == 0)
      {
         return 0.0;
      }
      if(scores.length == 1)
      {
         return scores[0];
      }
      double sum = scores[0];
      for(int i = 0; i < scoreValue; i++)
      {
         sum += scores[i];
      }
      return sum;
   }

   public double minimum()
   {
      if(scoreValue == 0)
      {
         return 0.0;
      }
      if(scores.length == 1)
      {
         return scores[0];
      }
      double minimum = scores[0];
      for(int i = 1; i < scoreValue; i++)
      {
         if(scores[i] < minimum)
         {
            minimum = scores[i];
         }
      }
      return minimum;
   }

   public double finalScore() 
   {
      if(scoreValue == 0)
      {
         return 0;
      }
      else if(scores.length == 1)
      {
         return scores[0];
      }
      else
      {
         return sum() - minimum();
      }
   }

   public void removeMin()
   {
      if(scoreValue == 0) return;
      double minimum = scores[0];
      int minScore = 0;
      for(int i = 1; i < scoreValue; i++)
      {
         if(scores[i] < minimum)
         {
            minimum = scores[i];
            minScore = i;
         }
      }
      for(int i = minScore; i < scoreValue - 1; i++)
      {
         scores[i] = scores[i + 1];
      }
      scoreValue--;
   }
}