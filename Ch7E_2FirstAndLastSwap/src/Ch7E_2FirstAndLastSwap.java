
public class Ch7E_2FirstAndLastSwap {
	
	public static void swap(int[] arr)
	{
	int last = arr.length - 1;
	int temp = arr[0];
	arr[0] = arr[last];
	arr[last] = temp;
	}

	public static void main(String[] args) {
		
		int[] data = {4, 47, 39, 54 ,34, 51, 88, 61, 58 ,94, 4 ,94};
		
		System.out.print("These are all the elements: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print(data[i] + " ");
        }
        
        System.out.println();
        System.out.print("This is the first and last element before the swap: ");
        System.out.printf("%d %d", data[0], data[data.length - 1]);
        swap(data);
        System.out.println();
        System.out.print("This is the first and last element after the swap: ");
        System.out.printf("%d %d", data[0], data[data.length - 1]);
	}

}
