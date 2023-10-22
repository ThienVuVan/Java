package episode01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class jtextfield {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textfield;
	
	public jtextfield() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("JLabel");
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GRAY);
		
		label = new JLabel();
		label.setFont(new Font("San-serif", Font.BOLD, 30));
		
		textfield = createTextField();
		
		panel.add(textfield);
		panel.add(label);
		frame.add(panel, BorderLayout.NORTH);
	}
	
	private JTextField createTextField() {
		// TODO Auto-generated method stub
		JTextField textfield = new JTextField(10);
		textfield.setFont(new Font("arial", Font.BOLD, 30));
		textfield.setForeground(Color.BLUE);
		textfield.setBackground(Color.YELLOW);
		textfield.setToolTipText("enter some text");
		textfield.setMargin(new Insets(5,10,5,10));
		
		textfield.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText(textfield.getText());
				textfield.setText("enter some more");
			}
		});
		
		return textfield;
	}

	public void show() {
		frame.setVisible(true);
	}
}
