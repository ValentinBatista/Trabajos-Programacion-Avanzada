package Ventanas;

import java.awt.*;
import javax.swing.*;

public class VentanaSimple extends JFrame{

	public VentanaSimple() {
		
		this.setTitle("Ventana de prueba");
		this.setSize(700, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new FlowLayout());
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		JLabel bienvenida = new JLabel("Bienvenido a mi programa!");
		JLabel nombre = new JLabel("Nombre:");
		JLabel o = new JLabel();
		
		JTextField nombretxt = new JTextField(8);
		
		JButton aceptar = new JButton("Aceptar");
		
		panel1.setLayout(new GridLayout(3,2));
		panel1.add(bienvenida);
		panel1.add(o);
		panel1.add(nombre);
		panel1.add(nombretxt);
		
		panel2.add(aceptar);
		
		this.add(panel1);
		this.add(panel2);
		

	}
}
