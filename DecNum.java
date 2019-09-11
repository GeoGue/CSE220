/*
 * Name: Ana (Gina) Guerra
 * Date: 9/10/19
 * Course Number: 220
 * Course Name: Data Structures/Algorithms
 * Problem Number: Bonus!
 * Email: anageorginaguerra@yahoo.com
 * Function takes as input number of digits in decency. It returns a String 
 * of the numbers for the given length, or -1 if a decent number of that length cannot be formed.
 */

import java.util.Scanner;

public class DecNum {
	final static String TITLE = "CSC111 Project Template";
	final static boolean PROCESS_USING_SCANNER = true;
	
	
	
	//**********************************************
	// Put as many methods you need here
	
	
	//**********************************************
	
	private static String decentNumber(Scanner sc, int n) {
		String s="";
		boolean nWorks = false;
		if(n%3==0){
			nWorks = true;
			for(int i = 0; i<n; i++){
				s= s + "5";
			}
		}
		else{
			if(n%3==1){
				if((n-10)%3 ==0 && (n-10) >=0){
					nWorks = true;
					for(int j = 0; j < (n-10); j++){
						s = s + "5";
					}
					for(int k = 0; k < 10; k++){
						s = s + "3";
					}
				}
			}
			if(n%3==2){
				if((n-5)%3 ==0 && (n-5) >= 0){
					nWorks = true;
					for(int j = 0; j < (n-5); j++){
						s = s + "5";
					}
					for(int k = 0; k < 5; k++){
						s = s + "3";
					}
				}
			}
		}
		if(nWorks == false){
			s = s + "-1";
		}
		return s;
	}
	
	//**********************************************
	
	@SuppressWarnings("unused")
	private static boolean doThisAgain(Scanner sc, String prompt) {
		System.out.print(prompt);
		if (PROCESS_USING_SCANNER && sc.hasNextLine())  
			sc.nextLine();     
		String doOver = sc.nextLine();
		return doOver.trim().equalsIgnoreCase("Y");
	}
	
	//**********************************************
	
	public static void main(String args[]) {
		System.out.println("Welcome to " + TITLE);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of items: ");
		int n = sc.nextInt();
		String dC = decentNumber(sc, n);
		System.out.println("Decent Number of length " + n + " is " + dC);
		sc.close();
		System.out.println("Thank you for using " + TITLE);
	}

}