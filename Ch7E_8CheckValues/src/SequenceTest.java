import java.util.Scanner;

public class SequenceTest
{
   public static void main(String[] args)
   {
      Sequence firstSequence = new Sequence(9);
      Sequence secondSequence = new Sequence(8);
      Sequence thirdSequence = new Sequence(7);

      firstSequence.set(0, 1);
      firstSequence.set(1, 4);
      firstSequence.set(2, 9);
      firstSequence.set(3, 16);
      firstSequence.set(4, 9);
      firstSequence.set(5, 7);
      firstSequence.set(6, 4);
      firstSequence.set(7, 9);
      firstSequence.set(8, 11);

      secondSequence.set(0, 1);
      secondSequence.set(1, 4);
      secondSequence.set(2, 5);
      secondSequence.set(3, 3);
      secondSequence.set(4, 5);
      secondSequence.set(5, 7);
      secondSequence.set(6, 9);
      secondSequence.set(7, 7);

      thirdSequence.set(0, 11);
      thirdSequence.set(1, 11);
      thirdSequence.set(2, 7);
      thirdSequence.set(3, 9);
      thirdSequence.set(4, 16);
      thirdSequence.set(5, 4);
      thirdSequence.set(6, 1);

      System.out.print("First has same values as second: ");
      if(firstSequence.sameValues(secondSequence))
      {
         System.out.println("true");
      }
      else
      {
         System.out.println("false");
      }
      System.out.println("Expected: false");

      System.out.print("First has same values as third: ");
      if(firstSequence.sameValues(thirdSequence))
      {
         System.out.println("true");
      }
      else
      {
         System.out.println("false");
      }
      System.out.println("Expected: true");
   }
}