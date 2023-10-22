package episode01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class jlabel {
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public jlabel() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame();
		frame.setTitle("JLabel");
		frame.setSize(1000,600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		panel = new JPanel();
		//panel.setBackground(Color.GRAY);
		
		ImageIcon back = new ImageIcon("Street.png");
		
		label = new JLabel();
		label.setText("This is label");
		label.setFont(new Font("San-serif", Font.BOLD, 30));
		
		ImageIcon icon = new ImageIcon("print.png");
		label.setIcon(icon);
		label.setIconTextGap(10);
		
//		label.setHorizontalTextPosition(SwingConstants.CENTER);
//		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		button = new JButton("Uppdate label text");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setText("<html>My Cool App <br> Buy It Now </html>");
			}
		});
		
		//frame.add(button, BorderLayout.SOUTH);
		panel.add(label);
		frame.add(panel, BorderLayout.NORTH);
	}
	
	public void show() {
		frame.setVisible(true);
	}
}
