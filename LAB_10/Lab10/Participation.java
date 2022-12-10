import java.util.Objects;

public class Participation {

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public Participation(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "Participation{" +
				"hours=" + hours +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Participation that = (Participation) o;
		return hours == that.hours;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hours);
	}

	public int hours;

}