package in.ineuron.comp;

import java.util.Set;

public class EngineeringCourses {
	private Set<String> courses;

	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "EngineeringCourses [courses=" + courses + "]";
	}
	
}
