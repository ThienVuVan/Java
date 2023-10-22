package episode01;

import java.awt.BorderLayout;
import java.awt.Button;

import javax.swing.JFrame;

public class borderlayout {
	private JFrame frame;
	
	public borderlayout() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("hello");
		frame.setSize(500,300);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		BorderLayout border_layout = new BorderLayout();
		border_layout.setHgap(5);
		border_layout.setVgap(5);
		
		frame.setLayout(border_layout);
		
		frame.add(new Button("West"), BorderLayout.WEST);
		frame.add(new Button("EAST"), BorderLayout.EAST);
		frame.add(new Button("SOUTH"), BorderLayout.SOUTH);
		frame.add(new Button("NORTH"), BorderLayout.NORTH);
		frame.add(new Button("CENTER"), BorderLayout.CENTER);
		
	}
	public void show() {
		frame.setVisible(true);
	}
}
