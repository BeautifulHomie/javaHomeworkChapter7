import java.util.Scanner;

public class Ch7E10TheatreSeats {

	public static void printSeats(int[][] seats)
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                System.out.printf("%5d", seats[i][j]);
            }

            System.out.println();

        }
    }

    public static void sellSeatByPrice(int[][] seats, int price)
    {
        for (int i = 0; i < seats.length; i++)
        {
            for (int j = 0; j < seats[i].length; j++)
            {
                if (seats[i][j] == price)
                {
                    seats[i][j] = 0;
                    return;
                }
            }
        }

        System.out.println("Sorry, no seat can be found with that price.");
    }

    public static void sellSeatByNumber(int[][] seats)
    {
        System.out.print("Please enter the row and seat number " +
        	"you would like to purchase: ");

        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        if (row > 0 && row <= seats.length)
        {
            int seat = in.nextInt();

            if (seat > 0 && seat <= seats[seats.length - row].length)
            {
                if (seats[seats.length - row][seat - 1] != 0)
                {
                    seats[seats.length - row][seat - 1] = 0;
                }
                else
                {
                    System.out.println("Sorry, that seat is already occupied.");
                }
            }
            else
            {
                System.out.println("Sorry, invalid row.");
            }
        }
        else
        {
            System.out.println("Sorry, invalid row.");
        }

    }  
    
	public static void main(String[] args) {
		
		int[][] seats = { 
					{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },

			        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },

			        { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },

			        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },

			        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },

			        { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },

			        { 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 },

			        { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },

			        { 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } 
			        };

			        printSeats(seats);

			        System.out.print("Please enter 1 to pick by seat, " + 
			        	"2 to pick by price, or Q to quit: ");
			        Scanner in = new Scanner(System.in);

			        String choice = in.next();

			        while (!choice.equals("q"))
			        {
			            if (choice.equals("1"))
			            {
			                sellSeatByNumber(seats);
			            }
			            else
			            {
			                // pick by price
			            System.out.print("Please enter the seat price " + 
			               "you would like to purchase: ");
			            int price = in.nextInt();

			            sellSeatByPrice(seats, price);
			        }

			        printSeats(seats);
			        System.out.print("Please enter 1 to pick by seat, " + 
				        	"2 to pick by price, or Q to quit: ");
			        choice = in.next();

			    }

	}

}
