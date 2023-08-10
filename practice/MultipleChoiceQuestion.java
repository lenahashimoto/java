import java.awt.*;
import javax.swing.*;
import java.util.Arrays;

public class MultipleChoiceQuestion extends Question {

	String[] options = {"A", "B", "C", "D", "E"};
	String answerWord;
	
	MultipleChoiceQuestion(String query, String answer, String[] list) {
			super(query);
			
			// call addChoice to create buttons 
			for(int i = 0; i < list.length; i++) {
				addChoice(i, list[i]);
				System.out.println(list[i]);
			}
			
			correctAnswer = answer.toUpperCase();
			
			int position = Arrays.asList(options).indexOf(correctAnswer);
			answerWord = list [position];
			
			initQuestionDialog();
			
		};
		
		
		void addChoice(int index, String label) {
			JPanel choice = new JPanel(new BorderLayout());
			
			JButton button = new JButton(options[index]);
			System.out.println(options[index]);
			button.addActionListener(question);
			choice.add(button,BorderLayout.WEST);				
			choice.add(new JLabel(label+" ",JLabel.LEFT),BorderLayout.CENTER);
			
			question.add(choice);
			
		}

		@Override
		void isCorrect(String answer) {
			if (answer.equals(correctAnswer)) {
				JOptionPane.showMessageDialog(null,"Correct!");
				//update static member variables nCorrect
				nCorrect++;
			}
			else {
				JOptionPane.showMessageDialog(null,"Incorrect.\n" + "The correct answer is " + answerWord + ".");
			}
		}


}


