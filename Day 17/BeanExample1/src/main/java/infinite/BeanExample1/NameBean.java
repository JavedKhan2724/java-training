package infinite.BeanExample1;

public class NameBean {

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private String firstName;
	private String lastName;
	
	public NameBean(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public NameBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
