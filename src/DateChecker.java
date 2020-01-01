import java.time.LocalDate;
import java.time.*;
import java.util.Date; 

public class DateChecker {
	LocalDate today = LocalDate.now();
	LocalDate goal = LocalDate.of(2021, 7, 31);
	int yearsLeft = goal.getYear() - today.getYear();
	int monthLeft = goal.getMonthValue() - today.getMonthValue();
	int daysLeft = goal.getDayOfMonth() - today.getDayOfMonth();
	
	public void printResult(){
		System.out.print("You have left ");
		printDifference();
		System.out.println(" till the end of your slavery.");
	}
	
	public void printDifference() {
		printYearDiff();
		printMonthDiff();
		printDaysDiff();
	}
	
	public void printYearDiff() {
		if (yearsLeft > 0) {
			if (yearsLeft >1) {
			System.out.printf("%d years", yearsLeft);
			}
			else 
				System.out.printf("%d years", yearsLeft);
		}
	}
	
	public void printMonthDiff() {
		if (yearsLeft >0) {
			System.out.print(", ");
		}
		if (monthLeft > 0) {
			if (monthLeft >1) {
				System.out.printf("%d months", monthLeft);
			}
			else {
				System.out.printf("%d month", monthLeft);
			}
		}
	}

	public void printDaysDiff() {
		if (daysLeft >0) {
			if (monthLeft >0) {
				System.out.print(", ");
			}
			if (daysLeft>1) {
			System.out.printf("%d days", daysLeft);
			}
			else 
				System.out.printf("%d day", daysLeft);
		}
	}
	
}

//System.out.printf("%d.%d.%d \n", dayOfMonth, month, year);
