import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calc {

	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_10;
	private JButton button_12;
	private JButton button_14;
	private JButton button_15;
	private JButton btnX;
	private JButton button_17;
	private JButton btnC;
	private JButton btnDel;
	private JButton button_13;
	private JButton button_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc window = new Calc();
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
	public Calc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 409, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Tahoma", Font.ITALIC, 17));
		textField.setBounds(15, 16, 357, 36);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 17));
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setBounds(214, 68, 69, 57);
		frame.getContentPane().add(btnNewButton);
		
		button = new JButton("7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button.getText();
				textField.setText(number);
			}
		});
		button.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button.setBackground(Color.GRAY);
		button.setBounds(25, 68, 69, 57);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("8");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_1.getText();
				textField.setText(number);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_1.setBackground(Color.GRAY);
		button_1.setBounds(118, 68, 69, 57);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("4");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_2.getText();
				textField.setText(number);
			}
		});
		button_2.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_2.setBackground(Color.GRAY);
		button_2.setBounds(25, 141, 69, 57);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("1");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_3.getText();
				textField.setText(number);
			}
		});
		button_3.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_3.setBackground(Color.GRAY);
		button_3.setBounds(25, 212, 69, 57);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("5");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_4.getText();
				textField.setText(number);
			}
		});
		button_4.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_4.setBackground(Color.GRAY);
		button_4.setBounds(118, 141, 69, 57);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("6");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_5.getText();
				textField.setText(number);
			}
		});
		button_5.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_5.setBackground(Color.GRAY);
		button_5.setBounds(214, 141, 69, 57);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("2");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_6.getText();
				textField.setText(number);
			}
		});
		button_6.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_6.setBackground(Color.GRAY);
		button_6.setBounds(118, 212, 69, 57);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("3");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_7.getText();
				textField.setText(number);
			}
		});
		button_7.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_7.setBackground(Color.GRAY);
		button_7.setBounds(214, 212, 69, 57);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_8.getText();
				textField.setText(number);
			}
		});
		button_8.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_8.setBackground(Color.GRAY);
		button_8.setBounds(25, 285, 69, 57);
		frame.getContentPane().add(button_8);
		
		button_10 = new JButton("00");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_10.getText();
				textField.setText(number);
			}
		});
		button_10.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_10.setBackground(Color.GRAY);
		button_10.setBounds(118, 285, 69, 57);
		frame.getContentPane().add(button_10);
		
		button_12 = new JButton(".");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + button_12.getText();
				textField.setText(number);
			}
		});
		button_12.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_12.setBackground(Color.GRAY);
		button_12.setBounds(214, 285, 69, 57);
		frame.getContentPane().add(button_12);
		
		button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		button_14.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_14.setBackground(Color.GRAY);
		button_14.setBounds(303, 68, 69, 57);
		frame.getContentPane().add(button_14);
		
		button_15 = new JButton("-");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		button_15.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_15.setBackground(Color.GRAY);
		button_15.setBounds(303, 141, 69, 57);
		frame.getContentPane().add(button_15);
		
		btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnX.setFont(new Font("Tahoma", Font.ITALIC, 17));
		btnX.setBackground(Color.GRAY);
		btnX.setBounds(303, 212, 69, 57);
		frame.getContentPane().add(btnX);
		
		button_17 = new JButton("/");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		button_17.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_17.setBackground(Color.GRAY);
		button_17.setBounds(303, 285, 69, 57);
		frame.getContentPane().add(button_17);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.ITALIC, 17));
		btnC.setBackground(Color.GRAY);
		btnC.setBounds(25, 360, 69, 57);
		frame.getContentPane().add(btnC);
		
		btnDel = new JButton("\uF0E7");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textField.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length() - 1);
					back = sb.toString();
					textField.setText(back);
				}
			}
		});
		btnDel.setFont(new Font("Wingdings", Font.ITALIC, 17));
		btnDel.setBackground(Color.GRAY);
		btnDel.setBounds(118, 360, 69, 57);
		frame.getContentPane().add(btnDel);
		
		button_13 = new JButton("%");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "%";
			}
		});
		button_13.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_13.setBackground(Color.GRAY);
		button_13.setBounds(214, 358, 69, 57);
		frame.getContentPane().add(button_13);
		
		button_16 = new JButton("=");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				else if(operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
				
				
				
				
			}
		});
		button_16.setFont(new Font("Tahoma", Font.ITALIC, 17));
		button_16.setBackground(Color.GRAY);
		button_16.setBounds(303, 358, 69, 57);
		frame.getContentPane().add(button_16);
	}
}
