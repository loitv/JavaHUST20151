package hust.java.week8.GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CountDown extends Frame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8289108836206998793L;
	private Label lblCount;
	private TextField tfCount;
	private Button btnCount;

	public CountDown() {
		setLayout(new FlowLayout());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0); // Terminate the program
			}
		});
		setLayout(new FlowLayout());
		lblCount = new Label("Counter");
		add(lblCount);
		tfCount = new TextField(10);
		add(tfCount);
		btnCount = new Button("Countdown");
		add(btnCount);
		btnCount.addActionListener(this);
		setTitle("Countdown");
		setSize(250, 100);
		setLocationRelativeTo(null);// appear at center
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		int count = 0;
		count = Integer.parseInt(tfCount.getText());
		if (tfCount.isEditable())
			tfCount.setEditable(false);
		count--;
		if (count < 1)
			btnCount.setEnabled(false);
		tfCount.setText(count + "");
	}

	public static void main(String[] args) {
		new CountDown();
	}
}
