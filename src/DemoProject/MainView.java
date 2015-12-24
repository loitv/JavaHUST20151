package DemoProject;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;

	public MainView() {
		super("Main");
		setSize(100, 90);

		menuBar = new JMenuBar();
		menu = new JMenu("Login");
		menuItem = new JMenuItem("Login");
		menu.add(menuItem);
		menuBar.add(menu);

		add(menuBar);
		setVisible(true);
	}

	public void setLoginAL(ActionListener lis) {
		this.menuItem.addActionListener(lis);
	}
}
