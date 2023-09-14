package view;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.CacaNiquelThread;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controller.CacaNiquelThread;

public class CacaNiquel extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtI;
	private JTextField textField_2;
	private JButton jogar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CacaNiquel frame = new CacaNiquel();
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
	public CacaNiquel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1090, 620);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		jogar = new JButton("Jogar");
		jogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.add(jogar);
		
		txtI = new JTextField();
		contentPane.add(txtI);
		txtI.setColumns(10);
		
		textField_2 = new JTextField();
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
		
		ActionListener inicia = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogar.setBounds(0, 0, 0, 0);
				Thread num1 = new CacaNiquelThread(txtI);
				Thread num2 = new CacaNiquelThread(textField_2);
				Thread num3 = new CacaNiquelThread(textField);
				num1.start();
				num2.start();
				num3.start();
			}
		};
		jogar.addActionListener(inicia);
	}

}
