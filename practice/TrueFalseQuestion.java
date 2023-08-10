import javax.swing.*;


public class TrueFalseQuestion extends Question {
	String[] options = {"TRUE", "FALSE"};
	
	public TrueFalseQuestion(String query, String answer) {
		super(query);
		//this.correctAnswer = answer;
		
		//Create a new "JPanel" to organize the true/false buttons
		JPanel buttons = new JPanel();
		
		//add a "TRUE" button to the "buttons" panel
		addButtonList(options);
		addButton(buttons, this.buttonList);
		question.add(buttons);
		correctAnswer = answer;
		initQuestionDialog();
	}
	
	@Override
	void isCorrect(String answer) {
		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null,"Correct!");
			//update static member variables nCorrect
			nCorrect++;
		}
		else {
			JOptionPane.showMessageDialog(null,"Incorrect.\n" + "The correct answer is " + correctAnswer + ".");
		}
	}

}
