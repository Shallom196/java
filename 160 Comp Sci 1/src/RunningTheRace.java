import java.util.Scanner;
public class RunningTheRace {

	public static void main(String[] args) {
		String runner1, runner2, runner3;
		double runner1Time, runner2Time, runner3Time;
		Scanner keyboard = new Scanner (System.in); //Declared a scanner class


		System.out.print("What are the first runner's names ?\n");
		runner1 = keyboard.nextLine();
		System.out.print("How long in mintues did it take " + runner1 +" to complete his run?\n");
		runner1Time = keyboard.nextDouble();
		keyboard.nextLine();		//takes line break away.
		System.out.print("What are the second runner's names ?\n");
		runner2 = keyboard.nextLine();

		System.out.print("How long in mintues did it take " + runner2 +" to complete his run?\n");
		runner2Time = keyboard.nextDouble();
		keyboard.nextLine();		//takes line break away.
		System.out.print("What are the third runner's names ?\n");
		runner3 = keyboard.nextLine();
		System.out.print("How long in mintues did it take " + runner3 +" to complete his run?\n");
		runner3Time = keyboard.nextDouble();

		if (runner1Time < runner2Time && runner1Time < runner3Time ){
		    System.out.print( " " +runner1 + " finished 1st position, with " + runner1Time+ " minutes\n");
			if (runner2Time < runner3Time ){
				System.out.print(" "+runner2 + " finshed 2nd position, with " + runner2Time + " minutes\n"
								 +" "+runner3 + " finshed 3rd position, with " + runner3Time + " minutes\n");
						 }
			 else{
				    System.out.print(" "+runner3 + " finshed 2nd position, with " + runner3Time + " minutes\n"
				    +" "+runner2 + " finshed 3rd position, with " + runner2Time + "minutes\n");
}
}
	else if (runner2Time < runner1Time && runner2Time < runner3Time ){
				    System.out.print( " " +runner2 + " finished 1st position, with " + runner2Time+ " minutes\n");
					if (runner1Time < runner3Time ){
						System.out.print(" "+runner1 + "finshed 2nd position, with " + runner1Time + " minutes\n"
										 +" "+runner3 + " finshed 3rd position, with " + runner3Time + " minutes\n");
						}

					else{
						    System.out.print(" "+runner3 + " finshed 2nd position, with " + runner3Time + " minutes\n"
						    +" "+runner1 + " finshed 3rd position, with " + runner1Time + "\n");
}
}

		else if (runner3Time < runner1Time && runner3Time < runner2Time ){
						    System.out.print( " " +runner3 + " finished 1st position, with " + runner3Time+ " minutes\n");
							if (runner2Time < runner1Time ){
								System.out.print(" "+runner2 + "finshed 2nd position, with " + runner2Time + " minutes\n"
												 +" "+runner1 + " finshed 3rd position, with " + runner1Time + " minutes\n");
									}
							else {
								    System.out.print(" "+runner1 + " finshed 2nd position, with " + runner1Time + " minutes\n"
								    +" "+runner2 + " finshed 3rd position, with " + runner2Time + " minutes\n");

}
}



					 }
	}
