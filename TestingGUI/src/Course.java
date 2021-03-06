import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Course {
	
	public String _name;
	public String _teacher;
	public String _contactEmail;
	public Map<String, Assignment> _allAssignments;
	
	public Course(String name, String teacher, String email) {
		_name = name;
		_teacher = teacher;
		_contactEmail = email;
		_allAssignments = null;
	}
	
	public Iterator<Entry<String, Assignment>> getAssignments() {
		return _allAssignments.entrySet().iterator();
	}
	
	public void newAssignment(String Name, String dueDate) {
		Assignment Ass = new Assignment(Name, dueDate);
		_allAssignments.put(Name, Ass);
	}
	
	public Assignment getAssignment(String assName) {
		return _allAssignments.get(assName);
	}
	
	public void deleteAssignment(String assName) {
		_allAssignments.remove(assName);
	}
	
	public void completeAssignment(String Name) {
		_allAssignments.get(Name)._completion = true;
	}
	
	public void incompleteAssignment(String Name) {
		_allAssignments.get(Name)._completion = false;
	}
	
	
	
	
}
