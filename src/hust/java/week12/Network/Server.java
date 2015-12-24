package hust.java.week12.Network;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static JTextArea taContent;
	private JTextField tfSetName, tfMessage;
	private JButton btnSetName;
	private static PrintWriter send;
	private static Socket clientSocket;
	private static String temp = "";
	private static String message = "";
	private JLabel name;
	private static ServerSocket server;

	public Server() {
		setTitle("Server");
		setSize(280, 525);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		name = new JLabel("Your name");
		name.setBackground(Color.magenta);
		taContent = new JTextArea(25, 23);
		taContent.setEditable(false);
		JScrollPane sp = new JScrollPane(taContent);
		
		tfMessage = new JTextField(23);
		tfMessage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource().equals(tfMessage)) {
					try {
						send = new PrintWriter(clientSocket.getOutputStream(), true); // Tạo mới đối tượng gửi tin
						temp += name.getText() + ": " + tfMessage.getText() + "\n";				
						send.println(tfSetName.getText() + ": " + tfMessage.getText()); // Gửi tin qua mạng kèm tên
						taContent.setText(temp); // Cập nhật lại giao diện hiển thị nội dung tin
						tfMessage.setText(""); // Xóa trường nhập liệu
						tfMessage.requestFocus(); // Focus con chỏ ngay ô nhập liệu
						taContent.setVisible(false); // Cập nhật lại giao diện
						taContent.setVisible(true); // Cập nhật lại giao diện
					} catch (Exception r) { // Xử lý ngoại lệ khi xảy ra lỗi
						r.printStackTrace();
					}
				}
				
			}
		});

		JPanel panel2 = new JPanel(new GridLayout(1, 2, 5, 10));
		tfSetName = new JTextField(11);
		btnSetName = new JButton("Set Name");
		btnSetName.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				if (arg0.getSource().equals(btnSetName)) {
					try {
						name.setText(tfSetName.getText());
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
			}
		});
		panel2.add(tfSetName);
		panel2.add(btnSetName);

		Container cp = this.getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(name);
		cp.add(sp);
		cp.add(tfMessage);
		cp.add(panel2);

		setVisible(true);
//		setResizable(false);
	}

	public static void main(String[] args) {
		new Server();
		try {
			server = new ServerSocket(6666);
			while(true) {
				clientSocket = server.accept();
				BufferedReader inMessage = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // Luồng nhận tin từ Client sẽ được lấy qua biến này
				while ((message = inMessage.readLine())!= null) {
					temp += message + "\n"; // Khi tin mới được gửi về sẽ được tự động xuống hàng và gán vào biến tạm
					taContent.setText(temp); // Đưa dữ liệu chat lên giao diện
					taContent.setVisible(false); // Cập nhật lại giao diện
					taContent.setVisible(true);// Cập nhật lại giao diện
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
