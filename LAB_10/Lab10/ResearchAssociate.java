import java.util.Objects;

public class ResearchAssociate extends Employee {

	public String getFieldOfStudy() {
		return fieldOfStudy;
	}

	public void setFieldOfStudy(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	public ResearchAssociate(String fieldOfStudy) {
		this.fieldOfStudy = fieldOfStudy;
	}

	@Override
	public String toString() {
		return "ResearchAssociate{" +
				"ssNo=" + ssNo +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", counter=" + counter +
				", fieldOfStudy='" + fieldOfStudy + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		ResearchAssociate that = (ResearchAssociate) o;
		return Objects.equals(fieldOfStudy, that.fieldOfStudy);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), fieldOfStudy);
	}

	public String fieldOfStudy;

}