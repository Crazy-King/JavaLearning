package person;


public class Employee extends Person {
//	office, salary, dateHired(java.util.Date 型)
	private String office;
	private double salary;
	private java.util.Date dateHired;
	
	public Employee(String name, int age, boolean sex, String phoneNumber, String address, 
			String email, String office, double salary, java.util.Date dateHired){
		super(name, age, sex, phoneNumber, address, email);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public java.util.Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(java.util.Date dateHired) {
		this.dateHired = dateHired;
	}

	
}
