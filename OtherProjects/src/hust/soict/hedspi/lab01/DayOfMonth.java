package hust.soict.hedspi.lab01;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class DayOfMonth {
	public static final Map<String, Integer> months = new HashMap<>();
	static {
        months.put("January", 1);
        months.put("Jan.", 1);
        months.put("Jan", 1);
        months.put("1", 1);
        
        months.put("February", 2);
        months.put("Feb.", 2);
        months.put("Feb", 2);
        months.put("2", 2);
        
        months.put("March", 3);
        months.put("Mar.", 3);
        months.put("Mar", 3);
        months.put("3", 3);
        
        months.put("April", 4);
        months.put("Apr.", 4);
        months.put("Apr", 4);
        months.put("4", 4);
        
        months.put("May", 5);
        months.put("5", 5);
        
        months.put("June", 6);
        months.put("Jun.", 6);
        months.put("Jun", 6);
        months.put("6", 6);
        
        months.put("July", 7);
        months.put("Jul.", 7);
        months.put("Jul", 7);
        months.put("7", 7);
        
        months.put("August", 8);
        months.put("Aug.", 8);
        months.put("Aug", 8);
        months.put("8", 8);
        
        months.put("September", 9);
        months.put("Sep.", 9);
        months.put("Sep", 9);
        months.put("9", 9);
        
        months.put("October", 10);
        months.put("Oct.", 10);
        months.put("Oct", 10);
        months.put("10", 10);
        
        months.put("November", 11);
        months.put("Nov.", 11);
        months.put("Nov", 11);
        months.put("11", 11);
        
        months.put("December", 12);
        months.put("Dec.", 12);
        months.put("Dec", 12);
        months.put("12", 12);
    }
	
	public static boolean isValidYear(String yearInput) {
	    return yearInput.matches("\\d{4}"); //Must be 4 digits 
	}
	
	public static boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
	}
	
	public static int daysOfMonth(int month, int year) {
		int day = 0;
		switch(month) {
		    case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		    	day = 31;
		    	break;
		    case 4: case 6: case 9: case 11:
		    	day = 30;
		    	break;
		    case 2:
		    	day = (isLeapYear(year) == true)? 29 : 28;
		}
		return day;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Enter the month and check if it's valid or not
		System.out.println("Please enter the month (e.g. Januaray, Jan., Jan or 1): ");
		String monthInput = sc.next();
		Integer month = months.get(monthInput);
		while (month == null) {
			System.out.println("Not a valid value. Try again.");
			System.out.println("Please enter the month (e.g. Januaray, Jan., Jan or 1): ");
			monthInput = sc.next();
			month = months.get(monthInput);
		}
		
		//Enter the year and check if it's valid or not
		System.out.println("Please enter the year (e.g. 1999): ");
		String yearInput = sc.next();
		while(!isValidYear(yearInput)) {
			System.out.println("Must be 4 digits. Try again.");
			System.out.println("Please enter the year (e.g. 1999): ");
			yearInput = sc.next();
		}
		int year = Integer.parseInt(yearInput);
		
		System.out.println(monthInput + ", " + year + " has " + daysOfMonth(month, year) + " days.");
		sc.close();
	}
}
