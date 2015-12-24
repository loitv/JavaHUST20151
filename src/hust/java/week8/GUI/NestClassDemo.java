package hust.java.week8.GUI;

import java.awt.*;
import java.awt.event.*;

public class NestClassDemo extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6744341856375808537L;
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;

	/**
	 * Constructor to setup GUI components and event handling
	 */
	public NestClassDemo() {
		setLayout(new FlowLayout());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // Terminate the program
			}
		});
		lblCount = new Label("Counter");
		add(lblCount);
		tfCount = new TextField(10);
		add(tfCount);
		btnCount = new Button("Countdown");
		add(btnCount);
		btnCount.addActionListener(new BtnCountListener());
		setTitle("Countdown");
		setSize(250, 100);
		setLocationRelativeTo(null);// appear at center
		setVisible(true);
	}

	/**
	 * BtnCountListener is a "named inner class" used as /* ActionListener. This
	 * inner class can access private /* variables of the outer class.
	 */
	private class BtnCountListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int count = 0;
			count = Integer.parseInt(tfCount.getText());
			if (tfCount.isEditable())
				tfCount.setEditable(false);
			count--;
			if (count < 1)
				btnCount.setEnabled(false);
			tfCount.setText(count + "");
		}
	}

	public static void main(String[] args) {
		new NestClassDemo();
	}
}
