package hust.java.week8.GUI;

import java.awt.Frame;
import java.awt.Label;

//import javax.swing.JFrame;

public class LabelDemo extends Frame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3156292051230358417L;

	public LabelDemo() {
		super("Label Demo");
		setSize(350, 125);
		Label lblInput = new Label("Enter ID");
		add(lblInput);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new LabelDemo();
	}
}
