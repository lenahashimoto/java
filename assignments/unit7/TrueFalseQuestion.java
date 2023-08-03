import javax.swing.*;


public class TrueFalseQuestion extends Question {

	
	public TrueFalseQuestion(String question, String answer) {
		super(question);
		this.correctAnswer = answer;
		
		//Create a new "JPanel" to organize the true/false buttons
		JPanel buttons = new JPanel();
		
		//add a "TRUE" button to the "buttons" panel
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		
		initQuestionDialog();
	}
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

}
