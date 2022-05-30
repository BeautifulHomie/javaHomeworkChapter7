
public class Ch7E_1RandomIntegerArray {

	public static void main(String[] args) {
		
        int[] randomInteger = new int[10];

        for (int i = 0; i < 10; i++)
        {
        	randomInteger[i] = (int) (Math.random() * 100 + 1);
        }

        System.out.print("Elements at an even index: "); 
        for (int i = 0; i < randomInteger.length; i = i + 2)
        {
            System.out.print(randomInteger[i] + " ");
        }
        
        System.out.println();

        System.out.print("Every even element: ");
        for (int i = 0; i < randomInteger.length; i++)
        {
            if (randomInteger[i] % 2 == 0)
            {
                System.out.print(randomInteger[i] + " ");
            }
        }

        System.out.println();

        System.out.print("All elements in reverse order: ");
        for (int i = randomInteger.length - 1; i >= 0; i--)
        {
            System.out.print(randomInteger[i] + " ");
        }

        System.out.println();

        System.out.print("First and last elements: ");
        System.out.printf("%d %d\n", randomInteger[0], randomInteger[randomInteger.length - 1]);

	}

}
