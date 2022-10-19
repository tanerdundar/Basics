package Super;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		
		JButton btn = new JButton("Button");
		frame.getContentPane().add(btn);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		
	
	}

}
