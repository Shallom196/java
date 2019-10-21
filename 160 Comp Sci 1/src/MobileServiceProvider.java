/**
 * 
 */

/**
 * @author Shallom Soyombo
 *
 */
import java.util.Scanner;
public class MobileServiceProvider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A = 9.95, overA = 0, B = 13.95, overB = 0, C = 19.95;
		Scanner scanner = new Scanner (System.in);
		System.out.print("What package did your purchase? [Enter either A or B or C]");		//Takes package option as input
		String packagePurchased = scanner.nextLine();
		System.out.print("How many hours did your use?");
		Double hoursUsed = scanner.nextDouble();
		
		//figures out what package used bought, print price if less than threshold, multiply by factor to print new price. catches error in option by displaying default
		switch (packagePurchased)
		{
		case "A":
		case "a":
			if (hoursUsed <= 10)
				System.out.printf("Your total charge is $%.2f" , A );
			else 
				overA = hoursUsed + (hoursUsed - 10) * 2;
				System.out.printf("Your total charge is $%.2f", overA);
			break;
		case "B":
		case "b":
			if (hoursUsed <= 20)
				System.out.printf("Your total charge is $%.2f" , B );
			else 
				overA = hoursUsed + (hoursUsed - 20) * 1;
				System.out.printf("Your total charge is $%.2f", overB);
			break;
		case "C":
		case "c":
			System.out.printf("Your total charge is $%.2f", C);
			break;
		default:
			System.out.print("Sorry, you've inputed some info wrongly.");
		}
	}

}
