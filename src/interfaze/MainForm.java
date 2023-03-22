package interfaze;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainForm {

	private JFrame frame;
	private JTextField txtInputYourName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome!");
		lblNewLabel.setBounds(187, 12, 70, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnInputYourName = new JButton("Do Stuff");
		btnInputYourName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInputYourName.setBounds(137, 77, 185, 25);
		frame.getContentPane().add(btnInputYourName);
		
		txtInputYourName = new JTextField();
		txtInputYourName.setText("Input your name");
		txtInputYourName.setBounds(173, 39, 114, 19);
		frame.getContentPane().add(txtInputYourName);
		txtInputYourName.setColumns(10);
	}
}
