import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;

public abstract class MainInterface {
	Courseload _allClasses = new Courseload();
	
	public LinkedList<Assignment> viewAssignments() {
		Iterator<Entry<String, Course>> courseIter = _allClasses.getClasses();
		
		LinkedList<Assignment> allAssignments = new LinkedList<Assignment>();
		
		while(courseIter.hasNext()) {
			Course currentCourse = courseIter.next().getValue();
			Iterator<Entry<String, Assignment>> assIter = currentCourse.getAssignments();
			
			while(assIter.hasNext()) {
				Assignment currentAss = assIter.next().getValue();
				
				allAssignments.add(currentAss);
			}
		}
		
		return allAssignments;
	}
	
	
	public void newAssignments() { }
	
	public void editAssignments() { }
	
	public void remindOfDeadlines() { }
	
	
	
	
}
