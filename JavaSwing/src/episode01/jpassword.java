package episode01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class jpassword {
	private JFrame frame;
	private JButton button;
	private JLabel label;
	private JPasswordField passwordfield;
	
	public jpassword() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JPasswordField");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		layout.setHgap(15);
		layout.setVgap(10);
		
		frame.setLayout(layout);
		
		label = new JLabel("Enter PassWord");
		
		passwordfield = new JPasswordField(10);
		passwordfield.setText("nothing entered");
		passwordfield.setEchoChar('*');
		
		button = new JButton("Check");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				char[] pf = passwordfield.getPassword();
				String value = new String(pf);
				System.out.println("Password: " + value);
				
			}
			
		});
		
		frame.add(label);
		frame.add(passwordfield);
		frame.add(button);
	}
	public void show() {
		frame.setVisible(true);
	}
	
}
