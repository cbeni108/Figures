import java.util.Scanner;

	public class Figures {

	public static void main(String args[]) {

		//Declaring variables

		int choice;

		/*

		 * Creating an Scanner class object which is used to get the inputs

		 * entered by the user

		 */

		Scanner sc = new Scanner(System.in);

		/* This while loop continues to execute

		 * until the user enters a valid choice or choice 4

		 */

		while (true) {

			//displaying the menu

			System.out.println("\n:: Menu ::");

			System.out.println("1.Box");

			System.out.println("2.Diamond");

			System.out.println("3.X");

			System.out.println("4.Quit");

			//getting the choice entered by the user

			System.out.print("\nEnter choice :");

			choice=sc.nextInt();

			//Based on the user choice the corresponding case will be executed

			switch (choice) {

			case 1: {

				printBox();

				continue;

		}

			case 2: {

				printDiamond();

				continue;

		}

			case 3: {

				printX();

				continue;

		}

			case 4: {

				System.out.println("Good Bye!");

				break;

		}

			default:{

				System.out.println("** Invalid Choice **");

				continue;

		}
		
	}

			break;

		}

	}

	private static void printX() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				if ((i == j) || (j == 4 - i)) {

					System.out.print("X");

				} else {

					System.out.print(" ");

				}

			}

					System.out.println();

}

}

	private static void printDiamond() {

		int n=5;

		int space = n - 1;

		for (int k = 1; k<=n; k++)

	{

			for (int c = 1; c<=space; c++)

				System.out.print(" ");

			space--;

			for (int c = 1; c<= 2*k-1; c++)

				System.out.print("*");

			System.out.println();

	}

			space = 1;

			for (int k = 1; k<= n - 1; k++)

	{

				for (int c = 1; c<= space; c++)

					System.out.print(" ");

			space++;

			for (int c = 1 ; c<= 2*(n-k)-1; c++)

				System.out.print("*");

				System.out.println();

	}

}

	private static void printBox() {

		for(int i=1;i<=5;i++)

	{

			for(int j=1;j<=5;j++)

	{

				System.out.print("X");

}

				System.out.println();

		}

	}

}