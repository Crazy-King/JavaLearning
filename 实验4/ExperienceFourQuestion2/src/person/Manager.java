package person;


public class Manager extends Employee {
//	额外拥有属性：double bonus
	private double bonus;
	
	public Manager(String name, int age, boolean sex, String phoneNumber, String address, 
			String email, String office, double salary, java.util.Date dateHired, double bonus){
		super(name, age, sex, phoneNumber, address, email, office, salary, dateHired);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
}
