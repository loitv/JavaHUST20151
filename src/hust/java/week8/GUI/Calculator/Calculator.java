package hust.java.week8.GUI.Calculator;

import java.awt.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class Calculator extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// set display
	JPanel display = new JPanel();
	JLabel lblInput = new JLabel("Input", Label.RIGHT);
	JLabel lblResult = new JLabel("Result", Label.RIGHT);
	JTextField tfInput = new JTextField(10);
	JTextField tfResult = new JTextField("0", 10);

	// set keyboard
	JPanel keyPad = new JPanel();
	JButton[] btnKeypad = new JButton[15];
	JButton CA = new JButton("CA");
	JButton C = new JButton("C");
	JButton btnResult = new JButton("=");

	public Calculator() {
		super("My Calculator");
		setLookAndFeel();
		setSize(350, 325);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER, 10, 10);
		setLayout(layout);

		GridLayout layout1 = new GridLayout(2, 2, 5, 5);
		display.setLayout(layout1);
		display.add(lblInput);
		display.add(tfInput);
		tfInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				Integer.parseInt(tfInput.getText());
			}
		});
		display.add(lblResult);
		tfResult.setEditable(false);
		display.add(tfResult);
		add(display);

		GridLayout layout2 = new GridLayout(5, 4, 5, 5);
		keyPad.setLayout(layout2);
		keyPad.add(CA);
		keyPad.add(C);
		for (int i = 9; i >= 0; i--) {
			btnKeypad[i] = new JButton(i + "");
			keyPad.add(btnKeypad[i]);
		}
		btnKeypad[10] = new JButton("+");
		keyPad.add(btnKeypad[10]);
		btnKeypad[11] = new JButton("-");
		keyPad.add(btnKeypad[11]);
		btnKeypad[12] = new JButton("x");
		keyPad.add(btnKeypad[12]);
		btnKeypad[13] = new JButton("/");
		keyPad.add(btnKeypad[13]);
		btnResult.setBackground(new Color(0, 0, 255));
		keyPad.add(btnResult);
		add(keyPad);

		setVisible(true);

	}

	private void setLookAndFeel() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception exc) {
			// ignore error
		}
	}

	public static void main(String[] args) {
		new Calculator();
	}

}
