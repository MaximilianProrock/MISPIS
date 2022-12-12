import java.util.Objects;

public class Institute {

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Institute institute = (Institute) o;
		return Objects.equals(name, institute.name) && Objects.equals(address, institute.address);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address);
	}

	@Override
	public String toString() {
		return "Institute{" +
				"name='" + name + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public String name;
	public String address;

	public void openInstitute(){

	}
	public void closeInstitute(){

	}



}