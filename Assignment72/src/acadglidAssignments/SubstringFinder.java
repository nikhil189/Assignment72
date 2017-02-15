/**
 * 
 */
package acadglidAssignments;

import java.util.Scanner;

/**
 * @author nikhil
 *
 */
public class SubstringFinder {

	/**
	 * Author - Nikhil Sharma
	 * Method Name - main
	 * Params- String[] args
	 * Return Type - void
	 * Purpose :- To find and show if a substring is found in a string
	 */
	public static void main(String[] args) 
	{
		try
		{
			Scanner  objScanner = new Scanner(System.in); // initalize scanner object to capture user input
			System.out.println("Please enter String"); // notify user to enter string input
			String strUserinPut = objScanner.nextLine(); // capture user input as a string
			System.out.println("Please enter the substring you want to search"); // notify user to enter string user want to search
			String strSubSearch = objScanner.nextLine(); // capture input for substring user want to search
			System.out.println("Do you want a case senisitive search or ignore case differences?? Please enter 1 for case sensitive and 2 for case insensitive "); // take user input for case sensitive or case insensitive search
			int iSearchType = objScanner.nextInt(); // capture user input for type of substring search
			switch(iSearchType)
			{
				case 1:
				{
					stringComparer(strUserinPut, strSubSearch); // case sensitive search method call to print if substring is found or not
				}
				break;
				case 2:
				{
					strUserinPut = strUserinPut.toLowerCase(); // converts both string to lower case for case in sensitive search
					strSubSearch = strSubSearch.toLowerCase();	// converts both string to lower case for case in sensitive search
					stringComparer(strUserinPut, strSubSearch);// method call to print if substring is found or not
				}
				break;
				default:
				{
					System.out.println("Invalid Input"); // notify user of invalid input
				}
				break;
			}
			
			objScanner.close(); // close scanner object to avoid memory leakage
			
		}
		catch(Exception ex)
		{
			System.out.println("Invalid input"); // exception occurs if user provides invalid input
		}

	}
	
	/**
	 * Author - Nikhil Sharma
	 * Method Name - stringComparer
	 * Params- String, String
	 * Return Type - void
	 * Purpose :- To find and show if a substring is found in a string
	 */
	static void stringComparer(String strMainString, String StrSubsTring)
	{
		
		int iTemp  = strMainString.indexOf(StrSubsTring); // index of matter to search index of substring in speified string
		if(iTemp != -1) // -1 indicates string is not found
		{
			System.out.println("Sub String Found"); // notify user string found not
		
		}
		else
		{
			System.out.println("Sub String not Found"); // notify user string is not found
			
		}
		
	}
}
