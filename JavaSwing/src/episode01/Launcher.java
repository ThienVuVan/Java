package episode01;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
				    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				        if ("Nimbus".equals(info.getName())) {
				            UIManager.setLookAndFeel(info.getClassName());
				            break;
				        }
				    }
				} catch (Exception e) {
				    // If Nimbus is not available, you can set the GUI to another look and feel.
				}
				//borderlayout main = new borderlayout();
				//flowlayout main = new flowlayout();
				//gridlayout main = new gridlayout();
				//jbutton main = new jbutton();
				jlabel main = new jlabel();
				//jtextfield main = new jtextfield();
				//listener main = new listener();
				//jpassword main = new jpassword();
				//jmenu main = new jmenu();
				//jcheckbox main = new jcheckbox();
				main.show();
			}
		});
	}

}
