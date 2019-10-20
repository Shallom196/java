import java.util.Scanner;
public class RunningTheRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String runner1, runner2, runner3;
		Scanner keyboard = new Scanner (System.in);
		System.out.print("What are the runners names ?\n");
		runner1 = keyboard.nextLine();
		runner2 = keyboard.nextLine();
		runner3 = keyboard.nextLine();
		
		int runner1Time, runner2Time, runner3Time;
		System.out.print("How long in mintues did it take them to" +
		"complete the race respectivelty ?\n");
		runner1Time = keyboard.nextInt();
		runner2Time = keyboard.nextInt();
		runner3Time = keyboard.nextInt();
		
		if (runner1Time >= runner2Time && runner2Time >= runner3Time )
		    System.out.print("Here are the positions: " + runner1 + "\n"
		    		+ runner2 +"\n"
		    		+runner3);
	    else if (runner2Time >= runner1Time && runner1Time >= runner3Time)
					 System.out.print("Here are the positions: " + runner2 + "\n"
					    		+ runner1 +"\n"
					    		+runner3);
	    else if (runner3Time >= runner1Time && runner1Time >= runner2Time)
			 System.out.print("Here are the positions: " + runner3 + "\n"
			    		+ runner2 +"\n"
			    		+runner1);
		
	}

}
