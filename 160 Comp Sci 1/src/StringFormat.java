/**
Question 3 [12 marks]:

double num1 = 1234567.456, num2 = 123.456, num3 = 123.456, num4 = 123456.789;

int num5 = 123456;

String name = “James”;

Write a program that includes the following statements:

1.       A printf statement that displays the value of num1 formatted as: 1,234,567.46

2.       A printf statement that displays the value of num2 rounded to one decimal place, in a field that is ten spaces wide (Do not use comma separators).

3.       A printf statement that displays the value of num3 padded with leading zeros, in a field that is eight spaces wide, rounded to one decimal place (Do not use comma separators).

4.       A printf statement that displays the value of num4, left-justified, with comma separators, in a field that is 20 spaces wide, rounded to two decimal places.

5.       A printf statement that displays the value of num5 in a field that is 10 spaces wide, with no comma separators.

6.       A printf statement that displays the value of name in a field that is 20 spaces wide. 
 */

/**
 * @author Shallom Soyombo 
 * @date 21/10/2019 12:34:34 am. 
 * 
 *
 */
public class StringFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1 = 1234567.456, num2 = 123.456, num3 = 123.456, num4 = 123456.789;

		int num5 = 123456;

		String name = "James";
		//A printf statement that displays the value of num1 formatted as: 1,234,567.46
		System.out.printf( "%,.2f\n" , num1);
		
		// A printf statement that displays the value of num2 rounded to one decimal place, in a field that is ten spaces wide (Do not use comma separators).
		System.out.printf("%10.1f\n", num2);
		
		
		//A printf statement that displays the value of num3 padded with leading zeros, in a field that is eight spaces wide, rounded to one decimal place (Do not use comma separators).
		System.out.printf("%08.1f\n", num3);
		
		//A printf statement that displays the value of num4, left-justified, with comma separators, in a field that is 20 spaces wide, rounded to two decimal places.
		System.out.printf("%-,20.2f\n", num4);
		
		
		//A printf statement that displays the value of num5 in a field that is 10 spaces wide, with no comma separators.
		System.out.printf("%10d\n", num5);
		
		//A printf statement that displays the value of name in a field that is 20 spaces wide.
		System.out.printf("%20s", name);
	}

}
