import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//*Creates empty text label and by clicking the button the label will say something

public class HandlingEvents extends JFrame {
	private JLabel label;
	private JButton button;
	
	//Constructor
	public HandlingEvents() {
		setLayout(new FlowLayout());
		
		button = new JButton("Click for text");//create button with text
		add(button);
		
		label = new JLabel(""); //empty label
		add(label);
		
		//Subclass to tell button what to do when it gets clicked
		event e = new event();
		button.addActionListener(e); //listens for us to do something, here "clicking the button"	
	}
	
	public class event implements ActionListener { //Subclass
		public void actionPerformed(ActionEvent e) { //links to constructor
			label.setText("Here I am!"); //appears when button was clicked
		}
	}
	
	public static void main(String[] args) { //creates window frame
		HandlingEvents frame = new HandlingEvents();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setTitle("Handling Events");
		frame.setSize(400, 200);
	}
}
