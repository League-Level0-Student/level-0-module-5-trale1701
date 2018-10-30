package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String num1 = JOptionPane.showInputDialog("In put a number to check is it prime or not!");
		int num = Integer.parseInt(num1);
		if(num == 0) {
			JOptionPane.showMessageDialog(null, "Your number isn't prime.");
			System.exit(0);
		}
		else if(num == 2) {
			JOptionPane.showMessageDialog(null, "Your number isn't prime.");
			System.exit(0);
		}
		else if(num == 1) {
			JOptionPane.showMessageDialog(null, "Your number isn't prime.");
			System.exit(0);
		}
		else {
			for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				JOptionPane.showMessageDialog(null, "Your number isn't prime.");
				System.exit(0);
			}
			JOptionPane.showMessageDialog(null, "Your number is prime.");
}
}
}
}