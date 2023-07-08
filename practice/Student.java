
public class Student {

	private static int numStd;	
	private String name;  // Student’s name.
	private int ID;
    public double test1, test2;   // Grades on three tests.
    public double getAverage() {  // compute average test grade
       return (test1 + test2) / 2;
    }
    
    public Student(String theName, double test1Score, double test2Score) {
    	test1 = test1Score;
    	test2 = test2Score;
    	if ( theName == null )
            throw new IllegalArgumentException("name can’t be null");
        name = theName;
        ID = numStd;
        numStd++;
    }
    
	static void updateName(Student s, String name) {
		s.name = name;
	}
	
	public int getID() {
		// Getter method for reading the value of ID.
		return ID;
	}
	
	public Student(String theName) {
		setTestScores();
    	if ( theName == null )
            throw new IllegalArgumentException("name can’t be null");
        name = theName;
        ID = numStd;
        numStd++;
	}
	
	public void setTestScores() {
		test1 = (double)(Math.random()*100);
		test2 = (double)(Math.random()*100);
	}
    
    public static void main(String[] args) {
    	
    	Student std = new Student("James", 30, 60);
    	Student std2 = new Student("Nancy", 73, 85);
    	Student std3 = new Student("Bill");
    	
    	updateName(std, "James Bond");
    	System.out.println("student1 is "+std.name + " and student2 is "+ std2.name);
    	System.out.println("There is "+ numStd + " students");
    	System.out.println("Studen3's average is "+ std3.getAverage());
    	System.out.println(std.name+"'s ID is "+ std.getID());
    	
    }
}

