import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Courseload {
	public Map<String, Course> _courses;
	
	public Iterator<Entry<String, Course>> getClasses() {
		return _courses.entrySet().iterator();
	}
	
	public void newCourse(String name, String teacher, String email) {
		Course courseToAdd = new Course(name, teacher, email);
		_courses.put(name, courseToAdd);
	}
	
	public Course viewCourse(String courseName) {
		return _courses.get(courseName);
	}
	
	public void deleteCourse(String courseName) {
		_courses.remove(courseName);
	}
	
}
