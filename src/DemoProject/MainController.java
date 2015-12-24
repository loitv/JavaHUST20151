package DemoProject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {

	private MainView mainView;
	private static LoginController login;
	
	public MainController() {
		mainView = new MainView();
		mainView.setLoginAL(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new LoginController();
			}
			
		});
	}
	
	public static void main(String[] args) {
		new MainController();
		login = new LoginController(4);
		System.out.println(login.getA());;
	}
}
