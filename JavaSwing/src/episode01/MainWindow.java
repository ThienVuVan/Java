package episode01;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow {
	private JFrame window;
	
	public MainWindow() {
		initialize();
		
	}
	
	public void initialize() {
		window = new JFrame();
		window.setLayout(new BorderLayout(10,5));
		window.setTitle("Hello");
		window.setSize(800,500);
		window.setResizable(true);
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		//panel.setPreferredSize(new Dimension(300,100));
		
		panel.setBackground(Color.RED);
		
		Button button = new Button("Button");
		panel.add(button);
		
		window.add(panel, BorderLayout.WEST);
		
		
		window.setVisible(true);
	}
	
}
