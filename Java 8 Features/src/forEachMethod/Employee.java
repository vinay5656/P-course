package forEachMethod;

public class Employee {
	private int id;
	private String name;
	private String address;
	private int salary;
	/**
	 * @param id
	 * @param name
	 * @param address
	 * @param salary
	 */
	public Employee(int id, String name, String address, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	

}
