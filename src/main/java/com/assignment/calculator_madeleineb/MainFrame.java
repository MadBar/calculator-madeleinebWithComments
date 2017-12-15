package com.assignment.calculator_madeleineb;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JSeparator;

public class MainFrame {

	CalculatorBasic cb = new CalculatorBasic();
	CalculatorAdvanced ca = new CalculatorAdvanced();

	// Why do they get the property Final? Auto.
	// Components Attributes
	private JFrame frmMadbarCalculator = new JFrame();
	JSeparator separator = new JSeparator();

	private final JLabel lblPickNr = new JLabel(
			"Fill the two fields below with two numbers you wish to operate");
	private final JLabel lblOperation = new JLabel(
			"Choose basic operation to perform to get result");
	private final JLabel lblNrToRaise = new JLabel(
			"...Or insert a number below to raise");
	private final JLabel lblResult = new JLabel("Result: ");

	private final JTextField textField1Nr = new JTextField();
	private final JTextField textField2Nr = new JTextField();
	private final JTextField textFieldResult = new JTextField();
	private final JTextField textFieldNrToRaise = new JTextField();

	private final JButton btnPlus = new JButton("+");
	private final JButton btnSubt = new JButton("-");
	private final JButton btnDivi = new JButton("/");
	private final JButton btnMult = new JButton("*");

	private final JButton btnPow2 = new JButton("x²");
	private final JButton btnPow3 = new JButton("x³");
	private final JButton btnPow4 = new JButton("x4");
	private final JButton btnPow5 = new JButton("x5");
	private final JButton btnPow6 = new JButton("x6");
	private final JButton btnPow7 = new JButton("x7");

	private final JButton btnReset = new JButton("Reset");

	// Created Attributes
	private double firstNr = 0.0;
	private double secondNr = 0.0;
	private double result = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frmMadbarCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		textFieldNrToRaise.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldNrToRaise.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldNrToRaise.setBounds(83, 166, 188, 28);
		textFieldNrToRaise.setColumns(10);
		initialize();
		addComponents();
		addActionListeners();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		// frmMadbarCalculator = new JFrame();

		// Properties of Frame
		frmMadbarCalculator.setTitle("MadBar Calculator");
		frmMadbarCalculator.setBounds(100, 100, 365, 385);
		frmMadbarCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMadbarCalculator.getContentPane().setLayout(null);
		frmMadbarCalculator.setVisible(true);

		// Properties of Text Fields
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(79, 264, 244, 28);
		textFieldResult.setColumns(10);
		textField1Nr.setToolTipText("insert number");
		textField1Nr.setHorizontalAlignment(SwingConstants.RIGHT);
		textField1Nr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField1Nr.setBounds(20, 27, 141, 28);
		textField1Nr.setColumns(10);
		textField2Nr.setToolTipText("insert number");
		textField2Nr.setHorizontalAlignment(SwingConstants.RIGHT);
		textField2Nr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField2Nr.setColumns(10);
		textField2Nr.setBounds(171, 27, 147, 28);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 14));

		// Properties of Labels
		lblPickNr.setHorizontalAlignment(SwingConstants.CENTER);
		lblPickNr.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPickNr.setBounds(20, 11, 303, 16);
		lblOperation.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperation.setBounds(20, 57, 298, 14);
		lblResult.setBounds(20, 264, 65, 28);
		lblNrToRaise.setHorizontalAlignment(SwingConstants.CENTER);
		lblNrToRaise.setBounds(20, 142, 298, 14);

		// Properties of basic buttons
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPlus.setBounds(258, 75, 65, 40);
		btnPlus.setMargin(new Insets(1, 1, 1, 1));
		btnSubt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubt.setBounds(171, 74, 65, 40);
		btnSubt.setMargin(new Insets(1, 1, 1, 1));
		btnDivi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDivi.setBounds(96, 74, 65, 40);
		btnDivi.setMargin(new Insets(1, 1, 1, 1));
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMult.setBounds(20, 74, 65, 40);
		btnMult.setMargin(new Insets(1, 1, 1, 1));

		// Properties of advanced buttons
		btnPow2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow2.setMargin(new Insets(1, 1, 1, 1));
		btnPow2.setBounds(20, 213, 40, 40);
		btnPow3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow3.setMargin(new Insets(1, 1, 1, 1));
		btnPow3.setBounds(69, 213, 40, 40);
		btnPow4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow4.setBounds(119, 213, 40, 40);
		btnPow4.setMargin(new Insets(1, 1, 1, 1));
		btnPow5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow5.setBounds(181, 213, 40, 40);
		btnPow5.setMargin(new Insets(1, 1, 1, 1));
		btnPow6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow6.setBounds(231, 213, 40, 40);
		btnPow6.setMargin(new Insets(1, 1, 1, 1));
		btnPow7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow7.setBounds(283, 213, 40, 40);
		btnPow7.setMargin(new Insets(1, 1, 1, 1));

		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReset.setBounds(20, 303, 303, 32);
		btnReset.setMargin(new Insets(1, 1, 1, 1));

		// Other
		separator.setBounds(20, 126, 303, 16);
	}

	public void addComponents() {

		frmMadbarCalculator.getContentPane().add(textField1Nr);
		frmMadbarCalculator.getContentPane().add(textField2Nr);
		frmMadbarCalculator.getContentPane().add(textFieldResult);
		frmMadbarCalculator.getContentPane().add(textFieldNrToRaise);

		frmMadbarCalculator.getContentPane().add(btnPlus);
		frmMadbarCalculator.getContentPane().add(btnSubt);
		frmMadbarCalculator.getContentPane().add(btnDivi);
		frmMadbarCalculator.getContentPane().add(btnMult);

		frmMadbarCalculator.getContentPane().add(btnPow2);
		frmMadbarCalculator.getContentPane().add(btnPow3);
		frmMadbarCalculator.getContentPane().add(btnPow4);
		frmMadbarCalculator.getContentPane().add(btnPow5);
		frmMadbarCalculator.getContentPane().add(btnPow6);
		frmMadbarCalculator.getContentPane().add(btnPow7);

		frmMadbarCalculator.getContentPane().add(btnReset);

		frmMadbarCalculator.getContentPane().add(lblPickNr);
		frmMadbarCalculator.getContentPane().add(lblOperation);
		frmMadbarCalculator.getContentPane().add(lblResult);
		frmMadbarCalculator.getContentPane().add(lblNrToRaise);

		frmMadbarCalculator.getContentPane().add(separator);
	}

	public void addActionListeners() {
		// Basic
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("Clickeddd!");
				// frmMadbarCalculator.getContentPane().setBackground(Color.red);
				textFieldResult.setText("");
				textFieldNrToRaise.setText("");
				try {
					firstNr = Double.parseDouble(textField1Nr.getText());
					secondNr = Double.parseDouble(textField2Nr.getText());
					result = cb.add(firstNr, secondNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException e) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnSubt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText("");
				textFieldNrToRaise.setText("");
				try {
					firstNr = Double.parseDouble(textField1Nr.getText());
					secondNr = Double.parseDouble(textField2Nr.getText());
					result = cb.subtract(firstNr, secondNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnDivi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText("");
				textFieldNrToRaise.setText("");
				try {
					firstNr = Double.parseDouble(textField1Nr.getText());
					secondNr = Double.parseDouble(textField2Nr.getText());
					result = cb.divide(firstNr, secondNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldResult.setText("");
				textFieldNrToRaise.setText("");
				try {
					firstNr = Double.parseDouble(textField1Nr.getText());
					secondNr = Double.parseDouble(textField2Nr.getText());
					result = cb.multiply(firstNr, secondNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});

		// Advanced
		btnPow2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");

				try {
					firstNr = Double.parseDouble(textFieldNrToRaise.getText());

					result = ca.pow2(firstNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnPow3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");

				try {
					firstNr = Double.parseDouble(textFieldNrToRaise.getText());

					result = ca.pow3(firstNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnPow4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");

				try {
					firstNr = Double.parseDouble(textFieldNrToRaise.getText());

					result = ca.pow4(firstNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnPow5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");
				try {
					firstNr = Double.parseDouble(textFieldNrToRaise.getText());

					result = ca.pow5(firstNr);

					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});
		btnPow6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");

				try {
					firstNr = Double.parseDouble(textFieldNrToRaise.getText());

					result = ca.pow6(firstNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}
			}
		});
		btnPow7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");

				try {
					firstNr = Double.parseDouble(textFieldNrToRaise.getText());

					result = ca.pow7(firstNr);
					textFieldResult.setText(String.valueOf(result));
				} catch (NumberFormatException nfe) {
					System.out.println("Put in numbers and '.' only! Don't leave empty!");
				}

			}
		});

		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1Nr.setText("");
				textField2Nr.setText("");

				textField1Nr.setText("");
				textField2Nr.setText("");
				textFieldResult.setText("");
				textFieldNrToRaise.setText("");
			}
		});
	}
}
