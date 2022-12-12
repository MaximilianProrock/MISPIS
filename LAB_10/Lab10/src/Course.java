import java.util.*;

public class Course {

	public Course(Collection<Lecturer> teaches, String name, int id, float hours) {
		this.teaches = teaches;
		this.name = name;
		this.id = id;
		this.hours = hours;
	}

	public Collection<Lecturer> getTeaches() {
		return teaches;
	}

	public void setTeaches(Collection<Lecturer> teaches) {
		this.teaches = teaches;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getHours() {
		return hours;
	}

	public void setHours(float hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Course{" +
				"teaches=" + teaches +
				", name='" + name + '\'' +
				", id=" + id +
				", hours=" + hours +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Course course = (Course) o;
		return id == course.id && Float.compare(course.hours, hours) == 0 && Objects.equals(teaches, course.teaches) && Objects.equals(name, course.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(teaches, name, id, hours);
	}

	Collection<Lecturer> teaches;
	public String name;
	public int id;
	public float hours;


	public void removeStudentToCourse(){

	}
	public void addStudentToCourse(){

	}

	public void openCourse(){

	}

}