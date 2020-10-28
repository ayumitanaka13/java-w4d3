
import java.util.ArrayList;

public class Driver {
	
	// print method
	public static void printCourseInfo(Course c) {
		System.out.println("Course name : " + c.getCourseName() +
				"\nCourse Duration : " + c.getDuration() +
				"\nList of Students : ");

		printStudentList(c.getStudents());
	}
	
	public static void printStudentList(ArrayList<Student> studList) {
		for (Student s : studList) {
			System.out.println(s.getFirstName() + " " + s.getLastName() + 
					" " + s.getScore());
		}
	}
	
	public static void removeNotQualifiedStudents(Course course) {
		//List of Student
		ArrayList <Student> students = course.getStudents();
		if (course.getCourseName().equalsIgnoreCase("Java")) {
			for (int i = 0; i < students.size(); i++) {
				if(students.get(i).getScore() < 15) {
					System.out.println("\n" + students.get(i).getLastName()
							+ " is not qualified for Java");
				}
			}
		}
	}
	
	// main method
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		Student s1 = new Student("John", "Doe", 14.5);
		Student s2 = new Student("Sarah", "Green", 19.3);
		Student s3 = new Student("Taro", "Yamada", 17.8);
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		Course course1 = new Course("Java", 8, students);
		printCourseInfo(course1);
		
		removeNotQualifiedStudents(course1);
	}
}