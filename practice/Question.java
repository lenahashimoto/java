
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;
	QuestionDialog question;
	ArrayList<JButton> buttonList;
	String correctAnswer;
	
	String ask() {
		question.setVisible(true);	
		return question.answer;
	}
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" " + question+ " ",JLabel.CENTER));
		this.buttonList = new ArrayList<JButton>();
	}
	
	void addButtonList(String... items) {
		for(String item : items) {
			JButton button = new JButton(item);
			button.addActionListener(question);
			this.buttonList.add(button);			
		}
	}
	
	void addButton(JPanel buttons, ArrayList<JButton> buttonList) {
		for(JButton button : buttonList) {
			buttons.add(button);			
		}
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
	abstract void isCorrect(String answer);
	
	// "check" method
	void check() {
		//update static member variables nQuestions
		nQuestions++;
		String answer = ask();
		isCorrect(answer);
	} // end "check" method
	
	static void showResults() {
		JOptionPane.showMessageDialog(null,String.format("%d correct out of %d questions", nCorrect, nQuestions));

	}
}
