package objectSerialization;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3968392626409041223L;
	/**
	 * 
	 */
//	private static final long serialVersionUID = 1L;
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	private double Salary;
	
	public Employee() {
		
	}

	/**
	 * @param name
	 * @param dateOfBirth
	 * @param department
	 * @param designation
	 * @param salary
	 */
	public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.department = department;
		this.designation = designation;
		Salary = salary;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return Salary;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		Salary = salary;
	}
	

}
