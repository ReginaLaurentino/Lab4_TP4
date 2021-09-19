package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GRUPO NR0: 4 ");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNewLabel.setBounds(47, 27, 105, 17);
		contentPane.add(lblNewLabel);
		
		
		// EJERCICIO 1
		
		JButton btnEJ1 = new JButton("Ejercicio 1");
		btnEJ1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Ejercicio1 frame = new Ejercicio1();
					frame.setVisible(true);
				} catch (Exception f) {
					f.printStackTrace();
				}
				
			}
		});
		
		//
		btnEJ1.setBounds(146, 57, 137, 23);
		contentPane.add(btnEJ1);
		
		//EJERCICIO 2
		JButton btnEJ2 = new JButton("Ejercicio 2");
		btnEJ2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Ejercicio2 frame = new Ejercicio2();
					frame.setVisible(true);
				} catch (Exception h) {
					h.printStackTrace();
				}
			}
		});
		btnEJ2.setBounds(146, 106, 137, 23);
		contentPane.add(btnEJ2);
		
		//EJERCICIO 3
		JButton btnEJ3 = new JButton("Ejercicio 3");
		btnEJ3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception L) {
					L.printStackTrace();
				}
			}
		});
		btnEJ3.setBounds(146, 153, 137, 23);
		contentPane.add(btnEJ3);
	}
}
