package episode01;

import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class jbutton {
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public jbutton() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("JButton");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		button = createButton();
		panel.add(button);
		frame.add(panel);
		
	}
	
	private JButton createButton() {
		// TODO Auto-generated method stub
		JButton button = new JButton();
		button.setText("print");
		button.setFocusable(false);
		
		ImageIcon icon = new ImageIcon("print.png");
		button.setIcon(icon);
		button.setIconTextGap(10);
		button.setToolTipText("you are chossing");
		button.setFont(new Font("Arial", Font.BOLD, 20));
		button.setMargin(new Insets(10,10,10,10));
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Print button has been clicked");
			}
			
		});
		
//		button.setVerticalTextPosition(SwingConstants.BOTTOM);
//		button.setHorizontalTextPosition(SwingConstants.CENTER);
		
		button.setVerticalTextPosition(SwingConstants.CENTER);
		button.setHorizontalTextPosition(SwingConstants.LEFT);
		
		button.setEnabled(true);
		//button.doClick();
		
		
		return button;
	}

	public void show() {
		frame.setVisible(true);
	}
}
