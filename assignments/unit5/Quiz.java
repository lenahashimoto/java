
public class Quiz {

	// main method
	public static void main(String[] args) {
		
		//initialize an array of multiple-choice questions
		String[][] multipleChoiceQuestionsList = {
				{"What is my favorite flavor?","Vanilla", "Chocolate", "Strawberry", "Banana", "Mango", "C"},
				{"Where is the capital of Canada?","Vancouver", "Ottawa", "Toronto", "Montreal", "Halifax", "B"},
				{"Formal parameters are also called ____ parameters.", "fake", "actual", "global", "local", "dummy", "E"},
				{"A Java method gets executed when it is...", "called", "compiled", "declared", "defined", "imported", "A"},
				{"What is the keyword to make a subclass?","duplicates", "copies", "inherites", "extends", "follows", "D"},
			};
	
		// create MultipleChoiceQuestion object and call check method for each question
		for(int i = 0; i < multipleChoiceQuestionsList.length; i++ ) {
			Question question = new MultipleChoiceQuestion(
					multipleChoiceQuestionsList[i][0], 
					multipleChoiceQuestionsList[i][1], 
					multipleChoiceQuestionsList[i][2], 
					multipleChoiceQuestionsList[i][3], 
					multipleChoiceQuestionsList[i][4], 
					multipleChoiceQuestionsList[i][5], 
					multipleChoiceQuestionsList[i][6]);
			question.check();
		}		
		
		//initialize an array of true or false questions
		String[][] trueFalseQuestionsList = {
				{"The hummingbird egg is the world's smallest bird egg.", "TRUE"},
				{"Sharks are mammals.", "FALSE"},
				{"Galapagos tortoises sleep up to 16 hours a day.",  "TRUE"},
				{"Vatican City is the smallest country in the world.", "TRUE"},
				{"Most of the human brain is made of muscle.", "FALSE"}
		};
		
		// create trueFalseQuestion object and call check method for each question
		for(int i = 0; i < trueFalseQuestionsList.length; i++ ) {
			Question trueFalseQuestion = new TrueFalseQuestion(trueFalseQuestionsList[i][0], trueFalseQuestionsList[i][1]);
			trueFalseQuestion.check();
		}
		
		// Show final results
		Question.showResults();
		
	} // end main();

} // end class Quiz;
