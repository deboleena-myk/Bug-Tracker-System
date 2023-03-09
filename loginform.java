package bgs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginform extends JFrame {

	private JPanel contentPane;
	private JTextField user;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginform frame = new loginform();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public loginform() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 494);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 10, 725, 437);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(201, 0, 524, 437);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		user = new JTextField();
		user.setBounds(186, 137, 267, 28);
		panel_1.add(user);
		user.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(186, 188, 267, 28);
		panel_1.add(password);
		
		JLabel lblNewLabel = new JLabel("UserName ");
		lblNewLabel.setBounds(84, 137, 92, 28);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password ");
		lblNewLabel_1.setBounds(84, 185, 92, 28);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(lblNewLabel_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(242, 259, 85, 28);
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get text from user
				//get text from password
				
				String un=user.getText();
				String pas=password.getText();
				
				if (un.equals("admin")&&pas.equals("123")) {
					JOptionPane.showMessageDialog(null, "Login Successful");
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid UserName or Password");
				}
				
			}
		});
		panel_1.add(btnLogin);
		
		JLabel lblNewLabel_2 = new JLabel("BUG TRACKING SYSTEM");
		lblNewLabel_2.setBounds(131, 10, 213, 21);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("LOGIN FORM");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(186, 72, 169, 21);
		panel_1.add(lblNewLabel_3);
	}
}
