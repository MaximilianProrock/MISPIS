import java.util.Objects;

public abstract class Employee {

	public int getSsNo() {
		return ssNo;
	}

	public void setSsNo(int ssNo) {
		this.ssNo = ssNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public int ssNo;
	public String name;
	public String email;
	public int counter;

	public void getJob(){

	}
	public void getJobDone(){

	}
	public void getPaid(){

	}

	public void quit(){

	}

	@Override
	public String toString() {
		return "Employee{" +
				"ssNo=" + ssNo +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", counter=" + counter +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Employee employee = (Employee) o;
		return ssNo == employee.ssNo && counter == employee.counter && Objects.equals(name, employee.name) && Objects.equals(email, employee.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ssNo, name, email, counter);
	}
}