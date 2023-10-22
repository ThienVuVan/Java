package episode01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class jcheckbox {
	private JFrame frame;
	private JPanel panel;
	private JCheckBox checkbox;
	
	public jcheckbox() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("JLabel");
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		
		checkbox = new JCheckBox("check box");
		checkbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(checkbox.getText());
			}
			
		});
		panel.add(checkbox);
		
		frame.add(panel, BorderLayout.NORTH);
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
