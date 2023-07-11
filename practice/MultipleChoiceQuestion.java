import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion {
	static int nQuestions = 0;
	static int nCorrect = 0;
	String question;
	String correctAnswer;
	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
			question = query+"\n";
			question += "A. "+a+"\n";
			question += "B. "+b+"\n";
			question += "C. "+c+"\n";
			question += "D. "+d+"\n";
			question += "E. "+e+"\n";
			
			correctAnswer = answer.toUpperCase();
			
		};
		
	String ask() {
		// an array of valid choices except "A"
		String[] validChoices = { "A", "B", "C", "D", "E" };
		// convert varidChoices array to a list for checking user's input
		List<String> answerList = Arrays.asList(validChoices);
		
		while (true) {
			String answer = JOptionPane.showInputDialog(question);
			// change the input to upper case
			answer = answer.toUpperCase();
			// true if the input is  "A", "B", "C", "D", or "E"
			if(answerList.contains(answer)) {
				return answer;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");				
			}
		}
		
	} // end "ask" method
	
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


