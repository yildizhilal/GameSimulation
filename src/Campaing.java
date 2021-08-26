
public class Campaing {
	int id;
	String name;
	String validityDate;
	public Campaing(int id, String name, String validityDate) {
		super();
		this.id = id;
		this.name = name;
		this.validityDate = validityDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValidityDate() {
		return validityDate;
	}
	public void setValidityDate(String validityDate) {
		this.validityDate = validityDate;
	}

}
