package exercise;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.time.YearMonth;

public class DaysOfAMonth {
	public static void main(String[] args) {
		while (true) {
			Scanner keyboard = new Scanner(System.in);
			
			System.out.println("Enter a month");
			String strMonth = keyboard.nextLine();
			System.out.println("Enter a year");
			int year = keyboard.nextInt();
			
			DaysOfAMonth daysOfAMonth = new DaysOfAMonth();
			int result = daysOfAMonth.getDayOfMonth(strMonth, year);
//			int result = daysOfAMonth.getDayOfMonth2(strMonth, year);
			if(result == 0) {
				System.out.println("Invalid month/year input. Please try again!");
			} else {
				System.out.println(result);
			}	
		}	
	}
	
	public int getDayOfMonth(String strMonth, int year) {
		int monthNumber = 0;
		if(strMonth.length() < 3) {
			try {
				monthNumber = Integer.parseInt(strMonth);
			} catch (NumberFormatException e) {
				// TODO: handle exception
			}
		} else {
			try {
				
				strMonth = strMonth.substring(0, 3);
				String temp = strMonth.substring(0, 1).toUpperCase() + strMonth.substring(1);
				
				if(!temp.equals(strMonth)) {
					return 0;
				}
				
				Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(strMonth);
			    Calendar cal = Calendar.getInstance();
			    cal.setTime(date);
			    monthNumber = cal.get(Calendar.MONTH)+ 1;
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		if(monthNumber <= 0 || monthNumber > 12 || year < 0) {
			return 0;
		} else {
			YearMonth yearMonth = YearMonth.of(year, monthNumber);
			return yearMonth.lengthOfMonth();
		}
	}
	
	public int getDayOfMonth2(String strMonth, int year) {
		switch(strMonth) {
			case "January":
			case "Jan.":
			case "Jan":
			case "1":
			case "March":
			case "Mar.":
			case "Mar":
			case "3":
			case "May":
			case "5":
			case "July":
			case "Jul":
			case "7":	
			case "August":
			case "Aug.":
			case "Aug":
			case "8":
			case "October":
			case "Oct.":
			case "Oct":
			case "10":
			case "December":
			case "Dec.":
			case "Dec":
			case "12":
				return 31;
			case "April":
			case "Apr.":
			case "Apr":
			case "4":
			case "June":
			case "Jun":
			case "6":
			case "September":
			case "Sept.":
			case "Sep":
			case "9":
			case "November":
			case "Nov.":
			case "Nov":
			case "11":
				return 30;
			case "February":
			case "Feb.":
			case "Feb":
			case "2":
				if(year % 4 != 0 || (year % 400 != 0 && year % 100 == 0))
				{
					return 28;
				}
		}		return 29;
	}
}
