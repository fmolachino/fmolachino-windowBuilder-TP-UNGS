package interfaze;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class MainForm {

	private JFrame frame;
	private JTextField box_0_0;
	private JTextField box_0_1;
	private JTextField box_0_2;
	private JTextField box_0_3;
	private JTextField box_1_0;
	private JTextField box_1_1;
	private JTextField box_1_2;
	private JTextField box_1_3;
	private JTextField box_2_0;
	private JTextField box_2_1;
	private JTextField box_2_2;
	private JTextField box_2_3;
	private JTextField box_3_0;
	private JTextField box_3_1;
	private JTextField box_3_2;
	private JTextField box_3_3;
	private JTextField rowSum_0;
	private JTextField rowSum_1;
	private JTextField rowSum_2;
	private JTextField rowSum_3;
	private JTextField columnSum_0;
	private JTextField columnSum_1;
	private JTextField columnSum_2;
	private JTextField columnSum_3;

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
		
		//Input Boxes, [Row][Column]
		
		box_0_0 = new JTextField();
		box_0_0.setBounds(82, 60, 35, 32);
		frame.getContentPane().add(box_0_0);
		box_0_0.setColumns(10);
		
		box_0_1 = new JTextField();
		box_0_1.setColumns(10);
		box_0_1.setBounds(129, 60, 35, 32);
		frame.getContentPane().add(box_0_1);
		
		box_0_2 = new JTextField();
		box_0_2.setColumns(10);
		box_0_2.setBounds(176, 60, 35, 32);
		frame.getContentPane().add(box_0_2);
		
		box_0_3 = new JTextField();
		box_0_3.setColumns(10);
		box_0_3.setBounds(223, 60, 35, 32);
		frame.getContentPane().add(box_0_3);
		
		box_1_0 = new JTextField();
		box_1_0.setColumns(10);
		box_1_0.setBounds(82, 104, 35, 32);
		frame.getContentPane().add(box_1_0);
		
		box_1_1 = new JTextField();
		box_1_1.setColumns(10);
		box_1_1.setBounds(129, 104, 35, 32);
		frame.getContentPane().add(box_1_1);
		
		box_1_2 = new JTextField();
		box_1_2.setColumns(10);
		box_1_2.setBounds(176, 104, 35, 32);
		frame.getContentPane().add(box_1_2);
		
		box_1_3 = new JTextField();
		box_1_3.setColumns(10);
		box_1_3.setBounds(223, 104, 35, 32);
		frame.getContentPane().add(box_1_3);
		
		box_2_0 = new JTextField();
		box_2_0.setColumns(10);
		box_2_0.setBounds(82, 148, 35, 32);
		frame.getContentPane().add(box_2_0);
		
		box_2_1 = new JTextField();
		box_2_1.setColumns(10);
		box_2_1.setBounds(129, 148, 35, 32);
		frame.getContentPane().add(box_2_1);
		
		box_2_2 = new JTextField();
		box_2_2.setColumns(10);
		box_2_2.setBounds(176, 148, 35, 32);
		frame.getContentPane().add(box_2_2);
		
		box_2_3 = new JTextField();
		box_2_3.setColumns(10);
		box_2_3.setBounds(223, 148, 35, 32);
		frame.getContentPane().add(box_2_3);
		
		box_3_0 = new JTextField();
		box_3_0.setColumns(10);
		box_3_0.setBounds(82, 192, 35, 32);
		frame.getContentPane().add(box_3_0);
		
		box_3_1 = new JTextField();
		box_3_1.setColumns(10);
		box_3_1.setBounds(129, 192, 35, 32);
		frame.getContentPane().add(box_3_1);
		
		box_3_2 = new JTextField();
		box_3_2.setColumns(10);
		box_3_2.setBounds(176, 192, 35, 32);
		frame.getContentPane().add(box_3_2);
		
		box_3_3 = new JTextField();
		box_3_3.setColumns(10);
		box_3_3.setBounds(223, 192, 35, 32);
		frame.getContentPane().add(box_3_3);
		
		
		//Row sum boxes
		
		rowSum_0 = new JTextField();
		rowSum_0.setColumns(10);
		rowSum_0.setBounds(333, 64, 28, 24);
		frame.getContentPane().add(rowSum_0);
		
		rowSum_1 = new JTextField();
		rowSum_1.setColumns(10);
		rowSum_1.setBounds(333, 108, 28, 24);
		frame.getContentPane().add(rowSum_1);
		
		rowSum_2 = new JTextField();
		rowSum_2.setColumns(10);
		rowSum_2.setBounds(333, 144, 28, 24);
		frame.getContentPane().add(rowSum_2);
		
		rowSum_3 = new JTextField();
		rowSum_3.setColumns(10);
		rowSum_3.setBounds(333, 188, 28, 24);
		frame.getContentPane().add(rowSum_3);
		
		
		//Column sum boxes
		
		columnSum_0 = new JTextField();
		columnSum_0.setColumns(10);
		columnSum_0.setBounds(82, 236, 28, 24);
		frame.getContentPane().add(columnSum_0);
		
		columnSum_1 = new JTextField();
		columnSum_1.setColumns(10);
		columnSum_1.setBounds(129, 236, 28, 24);
		frame.getContentPane().add(columnSum_1);
		
		columnSum_2 = new JTextField();
		columnSum_2.setColumns(10);
		columnSum_2.setBounds(176, 236, 28, 24);
		frame.getContentPane().add(columnSum_2);
		
		columnSum_3 = new JTextField();
		columnSum_3.setColumns(10);
		columnSum_3.setBounds(223, 236, 28, 24);
		frame.getContentPane().add(columnSum_3);
	}
}
