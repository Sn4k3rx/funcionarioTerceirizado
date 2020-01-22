package entities;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerHours;
	
	public Employee() {
		
	}

	public Employee(String name, Integer hours, Double valuePerHours) {
		this.name = name;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHour() {
		return valuePerHours;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHours = valuePerHour;
	}
	
	public Double payment() {
		return hours * valuePerHours;
	}
}