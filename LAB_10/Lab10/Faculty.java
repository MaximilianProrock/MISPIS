import java.util.Objects;

public class Faculty {

	public Faculty(Employee dean, String name) {
		this.dean = dean;
		this.name = name;
	}

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculty{" +
				"dean=" + dean +
				", name='" + name + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Faculty faculty = (Faculty) o;
		return Objects.equals(dean, faculty.dean) && Objects.equals(name, faculty.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dean, name);
	}

	public Employee dean;
	public String name;

	public void holdEvent(){

	}
	public void hireTeachers(){

	}
	public void dismissTeacher(){

	}
	public void makeInquiry(){

	}

}