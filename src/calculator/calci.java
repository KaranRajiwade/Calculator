package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci frame = new calci();
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
	public calci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 392, 539);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 19));
		textField.setBounds(10, 10, 360, 80);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("1");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button1.getText();
				textField.setText(number);
			}
		});
		button1.setForeground(SystemColor.desktop);
		button1.setBackground(SystemColor.controlHighlight);
		button1.setFont(new Font("Tahoma", Font.BOLD, 19));
		button1.setBounds(10, 178, 85, 75);
		contentPane.add(button1);
		
		JButton button4 = new JButton("4");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button4.getText();
				textField.setText(number);
			}
		});
		button4.setForeground(Color.BLACK);
		button4.setFont(new Font("Tahoma", Font.BOLD, 19));
		button4.setBackground(SystemColor.controlHighlight);
		button4.setBounds(10, 257, 85, 75);
		contentPane.add(button4);
		
		JButton button7 = new JButton("7");
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button7.getText();
				textField.setText(number);
			}
		});
		button7.setForeground(Color.BLACK);
		button7.setFont(new Font("Tahoma", Font.BOLD, 19));
		button7.setBackground(SystemColor.controlHighlight);
		button7.setBounds(10, 337, 85, 75);
		contentPane.add(button7);
		
		JButton button0 = new JButton("0");
		button0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button0.getText();
				textField.setText(number);
			}
		});
		button0.setForeground(Color.BLACK);
		button0.setFont(new Font("Tahoma", Font.BOLD, 19));
		button0.setBackground(SystemColor.controlHighlight);
		button0.setBounds(10, 417, 85, 75);
		contentPane.add(button0);
		
		JButton button2 = new JButton("2");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button2.getText();
				textField.setText(number);
			}
		});
		button2.setForeground(Color.BLACK);
		button2.setFont(new Font("Tahoma", Font.BOLD, 19));
		button2.setBackground(SystemColor.controlHighlight);
		button2.setBounds(99, 178, 85, 75);
		contentPane.add(button2);
		
		JButton button5 = new JButton("5");
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button5.getText();
				textField.setText(number);
			}
		});
		button5.setForeground(Color.BLACK);
		button5.setFont(new Font("Tahoma", Font.BOLD, 19));
		button5.setBackground(SystemColor.controlHighlight);
		button5.setBounds(99, 257, 85, 75);
		contentPane.add(button5);
		
		JButton button8 = new JButton("8");
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button8.getText();
				textField.setText(number);
			}
		});
		button8.setForeground(Color.BLACK);
		button8.setFont(new Font("Tahoma", Font.BOLD, 19));
		button8.setBackground(SystemColor.controlHighlight);
		button8.setBounds(99, 337, 85, 75);
		contentPane.add(button8);
		
		JButton buttonDecimalpoint = new JButton(".");
		buttonDecimalpoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+buttonDecimalpoint.getText();
				textField.setText(number);
			}
			
		});
		buttonDecimalpoint.setForeground(Color.BLACK);
		buttonDecimalpoint.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonDecimalpoint.setBackground(SystemColor.controlHighlight);
		buttonDecimalpoint.setBounds(99, 417, 85, 75);
		contentPane.add(buttonDecimalpoint);
		
		JButton button3 = new JButton("3");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button3.getText();
				textField.setText(number);
			}
		});
		button3.setForeground(Color.BLACK);
		button3.setFont(new Font("Tahoma", Font.BOLD, 19));
		button3.setBackground(SystemColor.controlHighlight);
		button3.setBounds(190, 178, 85, 75);
		contentPane.add(button3);
		
		JButton button6 = new JButton("6");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button6.getText();
				textField.setText(number);
			}
		});
		button6.setForeground(Color.BLACK);
		button6.setFont(new Font("Tahoma", Font.BOLD, 19));
		button6.setBackground(SystemColor.controlHighlight);
		button6.setBounds(190, 257, 85, 75);
		contentPane.add(button6);
		
		JButton button9 = new JButton("9");
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button9.getText();
				textField.setText(number);
			}
			
		});
		button9.setForeground(Color.BLACK);
		button9.setFont(new Font("Tahoma", Font.BOLD, 19));
		button9.setBackground(SystemColor.controlHighlight);
		button9.setBounds(190, 337, 85, 75);
		contentPane.add(button9);
		
		JButton buttonIsequalto = new JButton("=");
		buttonIsequalto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%2f",result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%2f",result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%2f",result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%2f",result);
					textField.setText(answer);
				}
				if(operation=="%")
				{
					result=first%second;
					answer=String.format("%2f",result);
					textField.setText(answer);
				}
			}
		});
		buttonIsequalto.setForeground(Color.BLACK);
		buttonIsequalto.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonIsequalto.setBackground(SystemColor.controlHighlight);
		buttonIsequalto.setBounds(190, 417, 85, 75);
		contentPane.add(buttonIsequalto);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		buttonMinus.setForeground(Color.BLACK);
		buttonMinus.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonMinus.setBackground(SystemColor.controlHighlight);
		buttonMinus.setBounds(283, 178, 85, 75);
		contentPane.add(buttonMinus);
		
		JButton buttonMultiplaction = new JButton("*");
		buttonMultiplaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		buttonMultiplaction.setForeground(Color.BLACK);
		buttonMultiplaction.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonMultiplaction.setBackground(SystemColor.controlHighlight);
		buttonMultiplaction.setBounds(283, 257, 85, 75);
		contentPane.add(buttonMultiplaction);
		
		JButton buttonDevide = new JButton("/");
		buttonDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		buttonDevide.setForeground(Color.BLACK);
		buttonDevide.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonDevide.setBackground(SystemColor.controlHighlight);
		buttonDevide.setBounds(283, 337, 85, 75);
		contentPane.add(buttonDevide);
		
		JButton buttonPercentage = new JButton("%");
		buttonPercentage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		buttonPercentage.setForeground(Color.BLACK);
		buttonPercentage.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonPercentage.setBackground(SystemColor.controlHighlight);
		buttonPercentage.setBounds(283, 417, 85, 75);
		contentPane.add(buttonPercentage);
		
		JButton button00 = new JButton("00");
		button00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+button00.getText();
				textField.setText(number);
			}
		});
		button00.setForeground(Color.BLACK);
		button00.setFont(new Font("Tahoma", Font.BOLD, 19));
		button00.setBackground(SystemColor.controlHighlight);
		button00.setBounds(190, 100, 85, 75);
		contentPane.add(button00);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		buttonPlus.setForeground(Color.BLACK);
		buttonPlus.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonPlus.setBackground(SystemColor.controlHighlight);
		buttonPlus.setBounds(283, 100, 85, 75);
		contentPane.add(buttonPlus);
		
		JButton buttonClear = new JButton("C");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		buttonClear.setForeground(Color.BLACK);
		buttonClear.setFont(new Font("Tahoma", Font.BOLD, 19));
		buttonClear.setBackground(SystemColor.controlHighlight);
		buttonClear.setBounds(99, 100, 85, 75);
		contentPane.add(buttonClear);
		
		JButton buttonBackspace = new JButton("\uF0E7");
		buttonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		buttonBackspace.setForeground(Color.BLACK);
		buttonBackspace.setFont(new Font("wingdings", Font.BOLD, 19));
		buttonBackspace.setBackground(SystemColor.controlHighlight);
		buttonBackspace.setBounds(10, 100, 85, 75);
		contentPane.add(buttonBackspace);
	}
}
