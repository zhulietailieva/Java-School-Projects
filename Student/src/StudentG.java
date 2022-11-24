import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentG extends JFrame {

	private JPanel contentPane;
	private JTextField txtn1;
	private JTextField txtn2;
	private JTextField txtn3;
	private JTextField txtegn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentG frame = new StudentG();
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
	public StudentG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u0418\u043C\u0435:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 10, 128, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u041F\u0440\u0435\u0437\u0438\u043C\u0435:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 83, 128, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 157, 128, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u0415\u0413\u041D");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 221, 128, 25);
		contentPane.add(lblNewLabel_3);
		
		txtn1 = new JTextField();
		txtn1.setBounds(10, 48, 155, 25);
		contentPane.add(txtn1);
		txtn1.setColumns(10);
		
		txtn2 = new JTextField();
		txtn2.setColumns(10);
		txtn2.setBounds(10, 118, 155, 25);
		contentPane.add(txtn2);
		
		txtn3 = new JTextField();
		txtn3.setColumns(10);
		txtn3.setBounds(10, 192, 155, 25);
		contentPane.add(txtn3);
			JLabel lblColor = new JLabel("");
			lblColor.setOpaque(true);
		lblColor.setBounds(175, 244, 51, 39);
		contentPane.add(lblColor);
		txtegn = new JTextField();
		txtegn.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
			EGN egn=new EGN(txtegn.getText());
				if(txtegn.getText().length()==0) lblColor.setBackground(Color.GRAY);
				if(txtegn.getText().length()!=10||egn.isIDcorrect()==false) lblColor.setBackground(Color.RED);
				if(egn.isIDcorrect())lblColor.setBackground(Color.GREEN) ;
				
				
				
			}
		});
		txtegn.setColumns(10);
		txtegn.setBounds(10, 258, 155, 25);
		contentPane.add(txtegn);
		
		JLabel lblResult = new JLabel("");
		lblResult.setBounds(10, 284, 544, 44);
		contentPane.add(lblResult);
	final EGN iddd=new EGN(txtegn.getText());
	
		
		JButton btnNewButton = new JButton("OK");
		
		btnNewButton.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
			
				
				
				
				EGN egn=new EGN(txtegn.getText());
				
		Student student=new Student(txtn1.getText(),txtn2.getText(),txtn3.getText(),egn.getEGN());
		lblResult.setText("Ученикът "+student+" е въведен");
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton.setBounds(263, 23, 208, 44);
		contentPane.add(btnNewButton);
	}
}
