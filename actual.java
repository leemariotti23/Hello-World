import java.util.Scanner;

public class actual {

	public static void main(String[] args) 
	{	
		Scanner cin = new Scanner(System.in); // start scanner 
		
		boolean l = true; 	// for the while look
		
		int random = (int)(1+100* Math . random()); // this is the function that told the computer to randomize any number 1 to 100
	
		while(l) // the while loop
		{
			int z=cin.nextInt(); // User inputs number 
		
			if(z==random) // this is a command that tells the computer what to say if the user dresses correct.
			{
				System.out.println("Are you a wizard? You're right!");
			}
			if(z>random) // this is a command that tells the computer what to say if the users guess is too high
			{
				System.out.println("Oops, you are too high ):");
			}
			if(z<random) // this is a command that tells the computer what to say if the users guess is too low
			{
				System.out.println("Sorry,you are too low");
			}
		System.out.println(random); // this tells the user the actual answer they answer correct or wrong.

		}
		cin.close(); // closes the scanner
	}
}


