
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.List;

public class TrueFalseQuestion extends Question {

	@Override
	String ask() {
		// convert varidChoices array to a list for checking user's input
		List<String> trueList = Arrays.asList("T", "TRUE", "Y", "YES");
		List<String> falseList = Arrays.asList("F", "FALSE", "N","NO");
				
		while(true) {
			String answer = JOptionPane.showInputDialog(question);
			answer = answer.toUpperCase();
			if(trueList.contains(answer)) {
				answer = "TRUE";
				return answer;
			} else if(falseList.contains(answer)){
				answer = "FALSE";
				return answer;
			} else {
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE.");	
			}
		}
	}
	
	public TrueFalseQuestion(String question, String answer) {
		this.question = "TRUE or FALSE: "+question;
		this.correctAnswer = answer;
	}

}
