import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame {
		JButton buttonFuck;
		JLabel label;
		JTextField text;
		String title = "It's sad, but ";
		EventHandler handler = new EventHandler();
		
		//constructor
		GUI(){
			setSize (new Dimension(500, 500));
			setLayout(new FlowLayout());
			setTitle("It's sad but");
			setVisible(true);
			setLocationRelativeTo(null);
			buttonFuck = new JButton("Fuck:(");
			JLabel label2 = new JLabel("How do you like your slavery?");
			text = new JTextField(10);
			add(buttonFuck);
			add(label2);

			buttonFuck.addActionListener(handler);
		}
		
		public class EventHandler implements ActionListener{

			public void actionPerformed(ActionEvent event) {
				if (event.getSource() == buttonFuck) {
					
				}
				
			}
			
			
		}
		
}

//кусочек кода как делать вспомогательные окна
//String s;
//s = JOptionPane.showInputDialog("Put your word");
//JOptionPane.showMessageDialog(null, "Be patient.");
