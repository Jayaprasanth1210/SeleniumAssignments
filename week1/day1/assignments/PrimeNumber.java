package week1.day1;



public class PrimeNumber {


	public static void main(String[] args) {



		// Declare an int Input and assign a value 13
		int i=13;

		

		// Declare a boolean variable flag as false
		boolean flag= false;

		

		// Iterate from 2 to half of the input
		
			for (int j=2;j<=i;j++)
			{
				if (j%1==0 && j%j==0)
				{
					flag=true;
				}
				break;
			}
		if (flag == true)
		{
			System.out.println (i + " is prime");
		}
		else
		{
			System.out.println(i+" is not prime");
		}
	
		
		

			// Divide the input with each for loop variable and check the remainder

			

			// Set the flag as true when there is no remainder

				
			// break the iterator


		// Check the flag (Provide a condition)

		

			// Print 'Prime' when the condition matches

			

			// Print 'Not a Prime' when the condition doesn't match 

   }

}

