package Practico2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ventana2 extends JFrame {

	public Ventana2() {
		this.setTitle("Registra Usuario");
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new GridLayout(2, 1));

		String[] Rol = { "Admin", "Usuario" };
		String nombreP = "Valentin";
		String cedulaP = "58018194";

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();

		JTextField txtNombre = new JTextField();
		JTextField txtApellido = new JTextField();
		JTextField txtCedula = new JTextField();
		JTextField txtEdad = new JTextField();

		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblApellido = new JLabel("Apellido");
		JLabel lblCedula = new JLabel("Cedula");
		JLabel lblEdad = new JLabel("Edad");
		JLabel lblRol = new JLabel("Rol");
		JLabel hola = new JLabel("Hola");

		JButton ingresar = new JButton("Registrar");

		ingresar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String nombre = txtNombre.getText();
				String apellido = txtApellido.getText();
				String cedula = txtCedula.getText();
				if (nombre.equals(nombreP) && cedula.equals(cedulaP)) {
					// System.out.println(hola.setText("Sesion iniciada corretamente"));

				}
			}
		});

		JComboBox boxRol = new JComboBox(Rol);

		panel1.setLayout(new GridLayout(7, 8));
		panel1.add(lblNombre);
		panel1.add(txtNombre);
		panel1.add(lblApellido);
		panel1.add(txtApellido);
		panel1.add(lblCedula);
		panel1.add(txtCedula);
		panel1.add(lblEdad);
		panel1.add(txtEdad);
		panel1.add(lblRol);
		panel1.add(boxRol);

		panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel2.add(ingresar);
		panel2.add(hola);

		this.add(panel1);
		this.add(panel2);
	}

}