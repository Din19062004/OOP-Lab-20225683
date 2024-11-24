package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;

public class DialogMessage {
	public static void main(String[] args) {
		int response = JOptionPane.showConfirmDialog(null, "Hello my friend. Do you know me?", 
				"Confirm Dialog", JOptionPane.YES_NO_OPTION);
		if(response == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Oh. Nice to meet you. Long time no see.");
		}
		else {
			JOptionPane.showMessageDialog(null, "My name is Dinh. Nice to meet you.");
		}
		
		String age = JOptionPane.showInputDialog(null, "Now please enter your age: ", 
				"Input age", JOptionPane.QUESTION_MESSAGE);
		System.out.println("Your age is: "+ age);
	}
}
