package ActividadCalculadora;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class VentanaCalcuadora extends JFrame {

	public VentanaCalcuadora() {
		this.setTitle("Calculadora");
		this.setSize(500, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new GridLayout(1, 3));

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();

		JButton suma = new JButton("+");
		JButton resta = new JButton("-");
		JButton multiplicacion = new JButton("*");
		JButton division = new JButton("/");

		JLabel nro1 = new JLabel("Nro 1");
		JLabel nro2 = new JLabel("Nro 2");
		JLabel resultado = new JLabel("Resultado: ");

		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();

		String valor1 = num1.getText();
		String valor2 = num2.getText();

		suma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int valor1 = Integer.parseInt(num1.getText());
					int valor2 = Integer.parseInt(num2.getText());

					int resultado1 = Suma(valor1, valor2);

					resultado.setText("El resultado de la suma es: " + resultado1);

				} catch (NumberFormatException ex) {
					resultado.setText("Introduce números válidos");
				}
			}
		});

		resta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int valor1 = Integer.parseInt(num1.getText());
					int valor2 = Integer.parseInt(num2.getText());
					int resultado1 = Resta(valor1, valor2);

					resultado.setText("El resultado de la resta es: " + resultado1);

				} catch (NumberFormatException ex) {
					resultado.setText("Introduce números válidos");
				}
			}

		});

		multiplicacion.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int valor1 = Integer.parseInt(num1.getText());
					int valor2 = Integer.parseInt(num2.getText());
					int resultado1 = Multiplicacion(valor1, valor2);

					resultado.setText("El resultado de la multiplicacion es: " + resultado1);

				} catch (NumberFormatException ex) {
					resultado.setText("Introduce números válidos");
				}
			}

		});

		division.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int valor1 = Integer.parseInt(num1.getText());
					int valor2 = Integer.parseInt(num2.getText());
					int resultado1 = Division(valor1, valor2);

					resultado.setText("El resultado de la division es: " + resultado1);

				} catch (NumberFormatException ex) {
					resultado.setText("Introduce números válidos");
				}
			}

		});

		panel1.setLayout(new GridLayout(2, 4));
		panel1.add(nro1);
		panel1.add(num1);
		panel1.add(nro2);
		panel1.add(num2);

		panel2.setLayout(new FlowLayout());
		panel2.add(resultado);

		panel3.setLayout(new FlowLayout());
		panel3.add(suma);
		panel3.add(resta);
		panel3.add(multiplicacion);
		panel3.add(division);

		panel4.setLayout(new GridLayout(3, 1));
		panel4.add(panel1);
		panel4.add(panel2);
		panel4.add(panel3);

		this.add(panel4);

	}

	public static int Suma(int valor1, int valor2) {
		return valor1 + valor2;
	}

	public static int Resta(int valor1, int valor2) {
		return valor1 - valor2;
	}

	public static int Multiplicacion(int valor1, int valor2) {
		return valor1 * valor2;
	}

	public static int Division(int valor1, int valor2) {
		return valor1 / valor2;
	}
}
