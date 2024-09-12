package edu.apcs.unit1.jframeTest;
import java.awt.FlowLayout;  
import javax.swing.*;

public class Main { 
	public static void main(String s[]) {  
		JFrame frame = new JFrame("JFrame Example");  
		JPanel panel = new JPanel();  
		panel.setLayout(new FlowLayout());  
		JLabel label = new JLabel("JFrame By Example");  
		JButton button = new JButton();  
		button.setText("Button");  
		panel.add(label);  
		panel.add(button);  
		frame.add(panel);  
		frame.setSize(200, 300);  
		frame.setLocationRelativeTo(null);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setVisible(true);  
	}  
}  
