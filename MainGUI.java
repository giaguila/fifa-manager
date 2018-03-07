import java.*;
import javax.swing.*;
import java.awt.*;

public class MainGUI extends JFrame{

	private JButton buttonCounter, buttonReset;
	private JLabel labelCount;
	private int clicks = 0;

	private MainGUI(){
		
		createView();
		
		//set the start position
		setLocationRelativeTo(null);
		//set a default close action
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//set a title
		setTitle("FIFA Manager App");

		//don't allow the user to resize the gui
		setResizable(false);

		//setting the frame size
		pack();
	}

	private void createView(){
		//create a panel
		JPanel panel = new JPanel();
		//attach the panel to the frame
		getContentPane().add(panel);

		//set the brackground of the panel
		panel.setBackground(Color.lightGray);

		labelCount = new JLabel();
		labelCount.setPreferredSize(
			new Dimension(200,30));
		panel.add(labelCount);
		updateCounter();

		buttonCounter = new JButton("Click me");
		panel.add(buttonCounter);

		buttonReset = new JButton("Reset");
		panel.add(buttonReset);
	}

	private void updateCounter(){
		labelCount.setText("Clicked " + clicks + " times");
	}

	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run(){
				new MainGUI().setVisible(true);
			}
		});
	}

}