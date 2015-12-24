package hust.java.week8.GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CountDownSwing extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfCount;
	private JButton btnCount;
	// private JLabel lblCount;

	/**
	 * Constructor to setup GUI components and event handling
	 */
	public CountDownSwing() {
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(new JLabel("Counter"));
		tfCount = new JTextField(10);
//		tfCount.setEditable(true);
		cp.add(tfCount);
		JButton btnCount = new JButton("Countdown");
		cp.add(btnCount);
		btnCount.addActionListener(new BtnCountListener());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Countdown");
		setSize(250, 100);
		setLocationRelativeTo(null);// appear at center
		setVisible(true);
	}

	public static void main(String[] args) {
		new CountDownSwing();
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new CountDownSwing();
			}
		});
	}

	private class BtnCountListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			int count = 0;
			count = Integer.parseInt(tfCount.getText());
			if (tfCount.isEditable())
				tfCount.setEditable(false);
			count--;
			tfCount.setText(count + "");
			if (count == 1) {
				btnCount.setEnabled(false);
			}
			
		}
	}// end of the Countdown class
}
