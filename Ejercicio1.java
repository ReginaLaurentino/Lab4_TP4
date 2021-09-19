package Ejercicio4;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textApellido;
	private JTextField textTelefono;
	private JTextField textFechanac;

	/* Create the frame.
	 */
	public Ejercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblNombre.setBounds(30, 22, 63, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblApellido.setBounds(30, 62, 63, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono");
		lblTelefono.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblTelefono.setBounds(30, 101, 63, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFechanac = new JLabel("Fecha Nac.");
		lblFechanac.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblFechanac.setBounds(30, 142, 86, 14);
		contentPane.add(lblFechanac);
		
		textNombre = new JTextField();
		textNombre.setBounds(151, 20, 197, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textApellido = new JTextField();
		textApellido.setBounds(151, 60, 197, 20);
		contentPane.add(textApellido);
		textApellido.setColumns(10);
		
		textTelefono = new JTextField();
		textTelefono.setBounds(151, 99, 197, 20);
		contentPane.add(textTelefono);
		textTelefono.setColumns(10);
		
		textFechanac = new JTextField();
		textFechanac.setBounds(151, 140, 197, 20);
		contentPane.add(textFechanac);
		textFechanac.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textTelefono.getText()== "") {
					textTelefono.setBackground(Color.RED);
				}
				
				
			}
		});
		btnMostrar.setBounds(292, 188, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblNewLabel = new JLabel("Los datos ingresados fueron:");
		lblNewLabel.setBounds(10, 236, 145, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMostrar = new JLabel("");
		lblMostrar.setBounds(165, 236, 228, 14);
		contentPane.add(lblMostrar);
	}
}
