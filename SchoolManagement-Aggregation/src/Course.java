import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private int duration;
	private ArrayList<Student> students;

	
	
	//CONSTRUCTOR
	
	public Course(String courseName, int duration, ArrayList<Student> students) {
		setCourseName(courseName); 
		setDuration(duration);
		setStudents(students);
	}
	
	
	
	//GETTER
	
	/*
	 * @ return courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/*
	 * @ return duration
	 */
	public int getDuration() {
		return duration;
	}
	/*
	 * @ return ArrayList<Student> students
	 */
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	
	
	// SETTER
	
	/*
	 * @ param courseName
	 */
	public void setCourseName(String courseName) {
		if (!courseName.isEmpty() && !courseName.equalsIgnoreCase(null)) {
			this.courseName = courseName;
		} else {
			this.courseName = "Unknown";
		}	
	}
	/*
	 * @ param duration
	 */
	public void setDuration(int duration) {
		if (duration >= 4) {
			this.duration = duration;
		} else {
			this.duration = 4;
		}		
	}
	/*
	 * @ param ArrayList<Student> students
	 */
	public void setStudents(ArrayList<Student> students) {
		if (students.size() > 0) {
			this.students = students;
		}
	}
}
