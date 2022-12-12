import java.util.Date;
import java.util.Objects;

public class Project {

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public Project(String name, Date start, Date end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Project{" +
				"name='" + name + '\'' +
				", start=" + start +
				", end=" + end +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Project project = (Project) o;
		return Objects.equals(name, project.name) && Objects.equals(start, project.start) && Objects.equals(end, project.end);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, start, end);
	}

	public String name;
	public Date start;
	public Date end;

	public void getIntermediateResult(){

	}
	public void addToProject(){

	}
	public void beginProject(){

	}
	public void finishProject(){

	}

}