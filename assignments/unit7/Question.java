
import java.awt.*;
import javax.swing.*;

public class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	QuestionDialog question;
	String correctAnswer;
	
	String ask() {
		question.setVisible(true);	
		return question.answer;
	}
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" " + question+ " ",JLabel.CENTER));
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
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
