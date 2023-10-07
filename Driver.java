package swiggy1;


import java.util.Scanner;
public class Driver
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		Swiggy s = new Swiggy();
		boolean exit=true;
		while(exit)
		{
			System.out.println("WELCOME TO SWIGGY\n1.Place Order\n2.Cancel Order\n3.Display Order Details\n4.Update Details\n5.Exit");
			System.out.println("--------------------------------------------------------------------");
			

			int ch = s1.nextInt();
			switch(ch)
			{
		   	case 1:
			{
				s.placeorder();
			}
			break;
			case 2:
			{
				s.cancelorder();
			}
			break;
			case 3:
			{
				s.displaydetails();
			}
			break;
			case 4:
			{
				s.updatedetails();
			}
			break;
			case 5:
			{
				exit = false;
				System.out.println("Application Closed...");
			}
			break;
			default :
			{
				System.out.println("Invalid Input"); 
				System.out.println("--------------------------------------------------------------------");
			}
			
			}
		}

	}

}
