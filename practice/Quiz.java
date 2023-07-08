import javax.swing.JOptionPane;

public class Quiz {

	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random()*10);
		String choice;
		int input = 0;
		
		choice = JOptionPane.showInputDialog("Input your number between 0 to 9.");
		int num = Integer.parseInt(choice);
		
		while () {

			choice = JOptionPane.showInputDialog("You lost. Input your number between 0 to 9 again.");
			num = Integer.parseInt(choice);
		}
		// message for the winner
		JOptionPane.showMessageDialog(null,"You won!");

		do {
			choice = JOptionPane.showInputDialog("You lost. Input your number between 0 to 9 again.");
			num = Integer.parseInt(choice);
		}
		while (input == 1);
		// message for the winner
		JOptionPane.showMessageDialog(null,"You won!");

		for (int num = Integer.parseInt(choice); input == 1; num = Integer.parseInt(choice)) {
				choice = JOptionPane.showInputDialog("You lost. Input your number between 0 to 9 again.");
		}
		JOptionPane.showMessageDialog(null,"You won!");
		
	}

} // end class Quiz;
