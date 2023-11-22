import java.util.Scanner;

public class PrimeNumbers 
{
	public void primeornot()
	{
		Scanner Scnobj = new Scanner(System.in);
		
		System.out.println("Pls enter any number between 700 to 7000");
		int number = Scnobj.nextInt();
		
	Boolean ifprimevalue = true;
	
	int startvalue = 700;
	int endvalue = 7000;
	
	for (int i=startvalue; i<=endvalue; i++);
	{
		for (int j= 2; j< number; j++)
		{
			if (number % j == 0)
			{
				ifprimevalue = false;
				System.out.println("It is not a prime number");
				break;
			}
			if ((j+1)== number)
			{
				if (ifprimevalue == true)
				{
					System.out.println("It is a prime number");
					break;
			}
			}
		}
		}

	}
}


