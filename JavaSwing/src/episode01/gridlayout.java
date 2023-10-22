package episode01;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class gridlayout {
	private JFrame frame;
	private JPanel panel;
	
	public gridlayout() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("GridLayout");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		GridLayout g_layout = new GridLayout();
		g_layout.setRows(5);
		g_layout.setColumns(5);
		g_layout.setHgap(5);
		g_layout.setVgap(5);
		
		// panel = new JPanel(new GridLayout(5,5,5,5);
		panel = new JPanel();
		panel.setLayout(g_layout);
		
		for(int i=1 ; i<=25 ; i++) {
			JButton button = new JButton("Button" + Integer.toString(i));
			panel.add(button);
		}
		
		frame.add(panel, BorderLayout.CENTER);
		
	}
	
	public void show() {
		frame.setVisible(true);
	}
	
}
