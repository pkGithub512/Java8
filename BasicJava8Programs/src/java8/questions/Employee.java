package java8.questions;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private int age;
	private GenderEnum gender;
	private int joiningYear;
	private String  deartment;
	private long height;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public GenderEnum getGender() {
		return gender;
	}
	public void setGender(GenderEnum gender) {
		this.gender = gender;
	}
	public int getJoiningYear() {
		return joiningYear;
	}
	public void setJoiningYear(int joiningYear) {
		this.joiningYear = joiningYear;
	}
	public String getDeartment() {
		return deartment;
	}
	public void setDeartment(String deartment) {
		this.deartment = deartment;
	}
	public Employee(int id, String name, double salary, int age, GenderEnum gender, int joiningYear,
			String deartment) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.joiningYear = joiningYear;
		this.deartment = deartment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + ", gender=" + gender
				+ ", joiningYear=" + joiningYear + ", deartment=" + deartment + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((deartment == null) ? 0 : deartment.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (int) (height ^ (height >>> 32));
		result = prime * result + id;
		result = prime * result + joiningYear;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (age != other.age)
			return false;
		if (deartment == null) {
			if (other.deartment != null)
				return false;
		} else if (!deartment.equals(other.deartment))
			return false;
		if (gender != other.gender)
			return false;
		if (height != other.height)
			return false;
		if (id != other.id)
			return false;
		if (joiningYear != other.joiningYear)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
			return false;
		return true;
	}
	
	
	
	
	
}
