public class Student {

	private String firstName;
	private String lastName;
	private double score;
	
	//CONSTRUCTOR
	
	public Student(String firstName, String lastName, double score) {
		setFirstName(firstName);
		setLastName(lastName);
		setScore(score);
	}
	
	
	
	//GETTER
	
	/*
	 * @ return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @ return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @ return score
	 */
	public double getScore() {
		return score;
	}
	
	
	
	// SETTER
	
	/*
	 * @ param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		}
	}
	/*
	 * @ param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} 
	}
	/*
	 * @ param score
	 */
	public void setScore(double score) {
		if (score > 0 && score <= 20) {
			this.score = score;
		} else {
			this.score = 0;
		}
	}
}
