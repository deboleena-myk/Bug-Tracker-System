package bgs;
import java.sql.Connection;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.UIManager;

public class bug extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bug frame = new bug();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection con=null;
	/**
	 * Create the frame.
	 */
	public bug() {
		con=Database.dbconnect();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 583);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 10, 898, 526);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(224, 33, 454, 494);
		panel_3.setBackground(SystemColor.activeCaption);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 24, 292, 26);
		panel_3.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 60, 292, 26);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "javaedit", "roundfx", "productsolution"}));
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 96, 292, 26);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"select", "Windows 7", "Windows 8", "Windows 10", "Windows 11", "Linux"}));
		panel_3.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(10, 132, 292, 26);
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"select", "GUI", "CLI", "VUI", "NLUI"}));
		panel_3.add(comboBox_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 178, 292, 153);
		panel_3.add(textArea);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(10, 341, 292, 26);
		comboBox_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"select", "NEW", "OLD"}));
		panel_3.add(comboBox_3);
		
		JButton btnNewButton = new JButton("ADD RECORD");
		btnNewButton.setBounds(10, 408, 179, 26);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.setForeground(UIManager.getColor("Button.foreground"));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("UPDATE RECORD");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setForeground(UIManager.getColor("Button.foreground"));
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.setBounds(234, 408, 194, 26);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(0, 0, 224, 526);
		panel_4.setBackground(SystemColor.textHighlight);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("BUG ID");
		lblNewLabel_1.setBounds(42, 57, 108, 24);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_4.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PRODUCT");
		lblNewLabel_2.setBounds(42, 91, 156, 24);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_4.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("OPERATING SYSTEM");
		lblNewLabel_3.setBounds(40, 129, 174, 24);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_4.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TYPE");
		lblNewLabel_4.setBounds(42, 163, 156, 18);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_4.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("DESCRIPTION");
		lblNewLabel_5.setBounds(42, 213, 156, 24);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		panel_4.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("STATUS");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_6.setBounds(40, 370, 158, 24);
		panel_4.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("BUG TRACKER SYSTEM");
		lblNewLabel.setBounds(350, 10, 253, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(235, 10, 453, 526);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.controlHighlight);
		panel_2.setBounds(10, 10, 898, 33);
		contentPane.add(panel_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(SystemColor.windowText);
		panel_5.setBounds(10, 10, 898, 33);
		contentPane.add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(SystemColor.windowText);
		panel_6.setBounds(10, 10, 898, 33);
		contentPane.add(panel_6);
	}
}
