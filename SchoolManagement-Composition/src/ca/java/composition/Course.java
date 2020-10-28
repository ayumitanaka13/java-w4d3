package ca.java.composition;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private int duration;
	private ArrayList<Student> students;

	
	
	//CONSTRUCTOR
	
	public Course(String courseName, int duration) {
		setCourseName(courseName); 
		setDuration(duration);
		this.students = new ArrayList<Student>();
	}
	
	
	
	/*
	 * Populate ArrayList of Student
	 */
	public void addStudent(Student student) {
		this.students.add(student);
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
}
