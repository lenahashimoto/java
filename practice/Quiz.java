
public class Quiz {

	// main method
	public static void main(String[] args) {
		
		//initialize an array of questions
		String[][] params = {
				{"What is my favorite flavor?","Vanilla", "Chocolate", "Strawberry", "Banana", "Mango", "C"},
				{"Where is the capital of Canada?","Vancouver", "Ottawa", "Toronto", "Montreal", "Halifax", "B"},
				{"Formal parameters are also called ____ parameters.", "fake", "actual", "global", "local", "dummy", "E"},
				{"A Java method gets executed when it is...", "called", "compiled", "declared", "defined", "imported", "A"},
				{"What is the keyword to make a subclass?","duplicates", "copies", "inherites", "extends", "follows", "D"},
			};
	
		
		for(int i = 0; i < params.length; i++ ) {
			MultipleChoiceQuestion question = new MultipleChoiceQuestion(params[i][0], params[i][1], params[i][2], params[i][3], params[i][4], params[i][5], params[i][6]);
			question.check();
		}
		MultipleChoiceQuestion.showResults();				
		
	} // end main();

} // end class Quiz;
