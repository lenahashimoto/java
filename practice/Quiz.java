
public class Quiz {

	// main method
	public static void main(String[] args) {
		
		//initialize an array of multiple-choice questions
		String[][] qAndA = {{"What is my favorite flavor?", "C"},
				{"Where is the capital of Canada?", "B"},
				{"Formal parameters are also called ____ parameters.", "E"},
				{"A Java method gets executed when it is...", "A"},
				{"What is the keyword to make a subclass?", "D"},};
		String[][] multipleChoiceList = {
				{"Vanilla", "Chocolate", "Strawberry", "Banana", "Mango"},
				{"Vancouver", "Ottawa", "Toronto", "Montreal", "Halifax"},
				{"fake", "actual", "global", "local", "dummy"},
				{"called", "compiled", "declared", "defined", "imported"},
				{"duplicates", "copies", "inherites", "extends", "follows"},
			};
	
		// create MultipleChoiceQuestion object and call check method for each question
		for(int i = 0; i < qAndA.length; i++) {
			Question question = new MultipleChoiceQuestion(qAndA[i][0], qAndA[i][1], multipleChoiceList[i]);
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
		for(String[]a: trueFalseQuestionsList) {
			Question trueFalseQuestion = new TrueFalseQuestion(a[0], a[1]);
			trueFalseQuestion.check();
		}
		
		
		// Show final results
		Question.showResults();
		
	} // end main();

} // end class Quiz;
