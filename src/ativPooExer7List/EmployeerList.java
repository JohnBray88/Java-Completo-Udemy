package ativPooExer7List;

public class EmployeerList {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeerList(Integer id,String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalary() {
		return salary;
	}
	public void increaseSalary(Double perc) {
		this.salary = this.salary +((this.salary * perc)/100);
	}
	
}
