package episode01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class flowlayout {
	private JFrame frame;
	private JPanel panel;
	
	public flowlayout() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("hello");
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.PINK);
		for(int i=0 ; i<6 ; i++) {
			JButton button = new JButton("Button" + Integer.toString(i));
			panel.add(button);
			}
		frame.add(panel, BorderLayout.NORTH);
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
