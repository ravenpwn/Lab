package lab1_demo;

import javax.swing.JOptionPane;

public class Calculator {
	public static void main(String[] args) {
		
		String strNum1 = JOptionPane.showInputDialog(null,
							"Please input the first number: ", "Input the first number",
							JOptionPane.INFORMATION_MESSAGE);
		String strNum2 = JOptionPane.showInputDialog(null,
				"Please input the second number: ", "Input the second number",
				JOptionPane.INFORMATION_MESSAGE);
		Double num1 = Double.parseDouble(strNum1); 
		Double num2 = Double.parseDouble(strNum2); 
	}
}
