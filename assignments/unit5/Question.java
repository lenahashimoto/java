

import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	String question;
	String correctAnswer;
	
	abstract String ask();
	
	// "check" method
	void check() {
		//update static member variables nQuestions
		nQuestions++;

		String answer = ask();
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			//update static member variables nCorrect
			nCorrect++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect.\n" + "The correct answer is " + correctAnswer + ".");
		}
		
	} // end "check" method
	
	static void showResults() {
		JOptionPane.showMessageDialog(null,String.format("%d correct out of %d questions", nCorrect, nQuestions));

	}
}
