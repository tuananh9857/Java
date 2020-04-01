package section4_expression_statements_codeblocks_methods;

import java.util.Scanner;

public class minutesToYearAndDay {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in); 
		System.out.println("Input minutes: ");
		long minutes = n.nextLong();
		printYearAndDay(minutes);
		
	}
	
	public static void printYearAndDay(long minutes) {
		System.out.println(minutes + " min = " + (minutes)/(365*24*60) + " y and " +(minutes*24)%365 + " d");
		
	}
}
