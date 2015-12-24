package DemoProject;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class LoginView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField user;
	
	public LoginView() {
		super("Login");
		setSize(100,100);
		user = new JTextField(10);
		add(user);
		
		setVisible(true);
		
	}
	public void setLoginAL(ActionListener lis) {
		this.user.addActionListener(lis);
	}
	
	public String getUser() {
		return user.getText();
	}
	public void closeForm() {
		super.dispose();

	}
	
}
