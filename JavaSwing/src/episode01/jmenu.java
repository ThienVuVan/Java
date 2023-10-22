package episode01;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class jmenu implements ActionListener {
	private JFrame frame;
	private JButton button;
	private JLabel label;
	private JMenuBar menuBar;
	private JPasswordField passwordfield;
	private JMenu fileMenu;
	private JMenuItem newMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem exitMenuItem;
	
	public jmenu() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("JPasswordField");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
		
		Font f = new Font("arial", Font.BOLD, 30);
		UIManager.put("fileBar.font", f);
		
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_K);
		
		newMenuItem = new JMenuItem("New...");
		ImageIcon icon = new ImageIcon("images/new.gif");
		newMenuItem.setIcon(icon);
		newMenuItem.setIconTextGap(10);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newMenuItem.addActionListener(this);
		
		saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		saveMenuItem.addActionListener(this);
		
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		exitMenuItem.addActionListener(this);
		
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		
		fileMenu.add(new JRadioButtonMenuItem("RadioButton"));
		fileMenu.add(new JCheckBoxMenuItem("Checkbox"));
		fileMenu.add(new JMenu("Sub Menu"));
		fileMenu.addSeparator();
		fileMenu.add(exitMenuItem);
		
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);
		
	}
	public void show() {
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JMenuItem) {
			JMenuItem item = (JMenuItem) e.getSource();
			String text = item.getText();
			System.out.println(text);
		}
	}
}
