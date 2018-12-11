package extra;

import javax.swing.JOptionPane;

public class TheChallengeFromMatt {
	public static void main(String[] args) {
		m("Tra", 1, 2, 3);
		
	}
public static void m (String name, int num, int num1, int num2){
	JOptionPane.showInputDialog("Hello " + name + ".");
	if(num % 2 == 0) {
		System.out.println("even");
	}
	else {
		System.out.println("odd");
	}
	System.out.println(num1+num2);
}
}
