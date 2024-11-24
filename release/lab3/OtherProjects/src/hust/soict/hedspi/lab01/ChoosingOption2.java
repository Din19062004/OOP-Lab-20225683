package hust.soict.hedspi.lab01;
import javax.swing.JOptionPane;
public class ChoosingOption2 {
	public static void main(String[] args) {
		Object[] options = {"Yes", "No"}; // options = {"I do", "I don't"};
		int option = JOptionPane.showOptionDialog(null, "Which options would you like to choose?", "Choose Option", 
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		String chosenOption = (option == JOptionPane.YES_OPTION)? "Yes" : "No";
		JOptionPane.showMessageDialog(null, "You've chosen: "+ chosenOption);
	}
}
