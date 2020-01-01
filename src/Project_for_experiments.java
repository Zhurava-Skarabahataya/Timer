import java.time.LocalDate;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/** @author User;
 * 
 * @version 1;
 * @param x ; 
 */



public class Project_for_experiments {

	public static void main(String[] args) {
		DateChecker dc = new DateChecker();
		dc.printResult();
		int days = Days.daysBetween(goal, today).getDays();
		GUI myGui = new GUI();
				
		myGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myGui.setResizable(false);
		
	}
			
}//class

