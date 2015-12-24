package DemoProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class LoginController {

	private LoginView loginView;
	private int a;
	
	public LoginController(){
		loginView = new LoginView();
		loginView.setLoginAL(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String user = loginView.getUser();
				if (user.equals("1")) {
					JOptionPane.showMessageDialog(null, "LOGIN SUCESSFULLY");
					loginView.closeForm();
					a = 2;
				}
			}
			
		});
		
	}
	
	public LoginController(int number) {
		
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
