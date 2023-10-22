package episode01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class listener implements ActionListener {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textfield;
	private JButton button;
	
	public listener() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("JLabel");
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		
		label = new JLabel("enter some text");
		label.setFont(new Font("arial", Font.PLAIN, 15));
		
		button = new JButton("save");
		button.addActionListener(this);
	
		textfield = new JTextField(10);
		textfield.setFont(new Font("arial", Font.PLAIN, 15));
		
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		frame.add(panel, BorderLayout.NORTH);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(textfield.getText());
		
	}
	public void show() {
		frame.setVisible(true);
	}
}
