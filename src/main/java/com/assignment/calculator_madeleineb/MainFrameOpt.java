package com.assignment.calculator_madeleineb;

import java.awt.Color;
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

public class MainFrameOpt {

	CalculatorBasic cb = new CalculatorBasic();
	CalculatorAdvanced ca = new CalculatorAdvanced();

	// Why do they get the property Final? Auto.
	// Components Attributes
	private JFrame frmMadbarCalculator = new JFrame();
	private final JLabel lblResult = new JLabel("Result: ");

	private final JTextField textFieldNr = new JTextField();
	private final JTextField textFieldResult = new JTextField();

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

	private final JButton btn1 = new JButton("1");
	private final JButton btn2 = new JButton("2");
	private final JButton btn3 = new JButton("3");
	private final JButton btn4 = new JButton("4");
	private final JButton btn5 = new JButton("5");
	private final JButton btn6 = new JButton("6");
	private final JButton btn7 = new JButton("7");
	private final JButton btn8 = new JButton("8");
	private final JButton btn9 = new JButton("9");
	private final JButton btn0 = new JButton("0");

	private final JButton btnEqual = new JButton("=");
	private final JButton btnReset = new JButton("Reset");

	// Created Attributes
	private double firstNr;
	private double secondNr = 0.0;
	private double result = 0.0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
			public void run() {
				try {
					MainFrameOpt window = new MainFrameOpt();
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
	public MainFrameOpt() {
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
		frmMadbarCalculator.setBounds(100, 100, 238, 327);
		frmMadbarCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMadbarCalculator.getContentPane().setLayout(null);
		frmMadbarCalculator.setVisible(true);

		// Properties of Text Fields
		textFieldResult.setEditable(false);
		textFieldResult.setBounds(49, 253, 157, 23);
		textFieldResult.setColumns(10);
		textFieldNr.setEditable(false);
		textFieldNr.setToolTipText("insert number");
		textFieldNr.setHorizontalAlignment(SwingConstants.RIGHT);
		textFieldNr.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textFieldNr.setBounds(11, 11, 195, 28);
		textFieldNr.setColumns(10);
		textFieldResult.setFont(new Font("Tahoma", Font.PLAIN, 14));

		// Properties of labels
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblResult.setBounds(11, 249, 39, 28);

		// Properties of numeric buttons
		btn1.setMargin(new Insets(1, 1, 1, 1));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn1.setBounds(10, 50, 40, 40);
		btn2.setMargin(new Insets(1, 1, 1, 1));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn2.setBounds(49, 50, 40, 40);
		btn3.setMargin(new Insets(1, 1, 1, 1));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn3.setBounds(88, 50, 40, 40);
		btn4.setMargin(new Insets(1, 1, 1, 1));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn4.setBounds(127, 50, 40, 40);
		btn5.setMargin(new Insets(1, 1, 1, 1));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn5.setBounds(166, 50, 40, 40);
		btn6.setMargin(new Insets(1, 1, 1, 1));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn6.setBounds(10, 89, 40, 40);
		btn7.setMargin(new Insets(1, 1, 1, 1));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn7.setBounds(49, 89, 40, 40);
		btn8.setMargin(new Insets(1, 1, 1, 1));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn8.setBounds(88, 89, 40, 40);
		btn9.setMargin(new Insets(1, 1, 1, 1));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn9.setBounds(127, 89, 40, 40);
		btn0.setMargin(new Insets(1, 1, 1, 1));
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn0.setBounds(166, 89, 40, 40);

		// Properties of basic buttons
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPlus.setBounds(88, 128, 40, 40);
		btnPlus.setMargin(new Insets(1, 1, 1, 1));
		btnSubt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubt.setBounds(127, 128, 40, 40);
		btnSubt.setMargin(new Insets(1, 1, 1, 1));
		btnDivi.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDivi.setBounds(127, 167, 40, 40);
		btnDivi.setMargin(new Insets(1, 1, 1, 1));
		btnMult.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnMult.setBounds(88, 167, 40, 40);
		btnMult.setMargin(new Insets(1, 1, 1, 1));

		// Properties of advanced buttons
		btnPow2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow2.setMargin(new Insets(1, 1, 1, 1));
		btnPow2.setBounds(49, 128, 40, 40);
		btnPow3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow3.setMargin(new Insets(1, 1, 1, 1));
		btnPow3.setBounds(49, 167, 40, 40);
		btnPow4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow4.setBounds(49, 206, 40, 40);
		btnPow4.setMargin(new Insets(1, 1, 1, 1));
		btnPow5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow5.setBounds(10, 128, 40, 40);
		btnPow5.setMargin(new Insets(1, 1, 1, 1));
		btnPow6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow6.setBounds(10, 167, 40, 40);
		btnPow6.setMargin(new Insets(1, 1, 1, 1));
		btnPow7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow7.setBounds(10, 206, 40, 40);
		btnPow7.setMargin(new Insets(1, 1, 1, 1));

		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReset.setBounds(88, 206, 118, 40);
		btnReset.setMargin(new Insets(1, 1, 1, 1));
		btnEqual.setBounds(166, 128, 40, 79);
	}

	public void addComponents() {

		frmMadbarCalculator.getContentPane().add(textFieldNr);
		frmMadbarCalculator.getContentPane().add(textFieldResult);

		frmMadbarCalculator.getContentPane().add(btn1);
		frmMadbarCalculator.getContentPane().add(btn2);
		frmMadbarCalculator.getContentPane().add(btn3);
		frmMadbarCalculator.getContentPane().add(btn4);
		frmMadbarCalculator.getContentPane().add(btn5);
		frmMadbarCalculator.getContentPane().add(btn6);
		frmMadbarCalculator.getContentPane().add(btn7);
		frmMadbarCalculator.getContentPane().add(btn8);
		frmMadbarCalculator.getContentPane().add(btn9);
		frmMadbarCalculator.getContentPane().add(btn0);

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

		frmMadbarCalculator.getContentPane().add(btnEqual);
		frmMadbarCalculator.getContentPane().add(btnReset);

		frmMadbarCalculator.getContentPane().add(lblResult);

	}

	public void addActionListeners() {
		// Basic
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// System.out.println("Clickeddd!");
				// frmMadbarCalculator.getContentPane().setBackground(Color.red);

				firstNr = Double.parseDouble(textFieldNr.getText());

				result = cb.add(firstNr, secondNr);
				textFieldResult.setText(String.valueOf(result));
			}
		});
//		btnSubt.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				firstNr = Double.parseDouble(textFieldNr.getText());
//				secondNr = Double.parseDouble(textField2Nr.getText());
//				result = cb.subtract(firstNr, secondNr);
//				textFieldResult.setText(String.valueOf(result));
//			}
//		});
//		btnDivi.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				firstNr = Double.parseDouble(textFieldNr.getText());
//				secondNr = Double.parseDouble(textField2Nr.getText());
//				result = cb.divide(firstNr, secondNr);
//				textFieldResult.setText(String.valueOf(result));
//			}
//		});
//		btnMult.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				firstNr = Double.parseDouble(textFieldNr.getText());
//				secondNr = Double.parseDouble(textField2Nr.getText());
//				result = cb.multiply(firstNr, secondNr);
//				textFieldResult.setText(String.valueOf(result));
//
//			}
//		});

		// Advanced
		// btnPow2.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		//
		// firstNr = Double.parseDouble(textFieldNrToRaise.getText());
		// result = ca.pow2(firstNr);
		// textFieldResult.setText(String.valueOf(result));
		// }
		// });
		// btnPow3.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// firstNr = Double.parseDouble(textFieldNrToRaise.getText());
		// result = ca.pow3(firstNr);
		// textFieldResult.setText(String.valueOf(result));
		// }
		// });
		// btnPow4.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// firstNr = Double.parseDouble(textFieldNrToRaise.getText());
		// result = ca.pow4(firstNr);
		// textFieldResult.setText(String.valueOf(result));
		// }
		// });
		// btnPow5.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// firstNr = Double.parseDouble(textFieldNrToRaise.getText());
		// result = ca.pow5(firstNr);
		// textFieldResult.setText(String.valueOf(result));
		// }
		// });
		// btnPow6.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// firstNr = Double.parseDouble(textFieldNrToRaise.getText());
		// result = ca.pow6(firstNr);
		// textFieldResult.setText(String.valueOf(result));
		// }
		// });
		// btnPow7.addActionListener(new ActionListener() {
		// public void actionPerformed(ActionEvent e) {
		// firstNr = Double.parseDouble(textFieldNrToRaise.getText());
		// result = ca.pow7(firstNr);
		// textFieldResult.setText(String.valueOf(result));
		// }
		// });
		//

		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textFieldNr.setText(textFieldNr.getText() + 1);
			}
		});

		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 2);
			}
		});

		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 3);
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 4);
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 5);
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 6);
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 7);
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 8);
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 9);
			}
		});

		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText(textFieldNr.getText() + 0);
			}
		});

		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// try {
				// secondNr = Double.parseDouble(textFieldNr.getText());
				//
				// }catch(NumberFormatException msg){
				//
				// }
				try {
					secondNr = Double.parseDouble(textFieldNr.getText());
				} catch (Exception e2) {
					secondNr = 0.0;
				}
				secondNr = Double.parseDouble(textFieldNr.getText());
				result = firstNr + secondNr;

			}
		});
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldNr.setText("");
				textFieldResult.setText("");

			}
		});
	}
}
