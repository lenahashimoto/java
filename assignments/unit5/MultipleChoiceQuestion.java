import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question {


	
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

		// convert varidChoices array to a list for checking user's input
		List<String> answerList = Arrays.asList("A", "B", "C", "D", "E");
		
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
	

	

}


