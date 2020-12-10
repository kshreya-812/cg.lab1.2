package Spring.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component
public class Employee {

	@Value("${emp.employeeId}")
	private int employeeId;
	@Value("${emp.employeeName}")
    private String employeeName;
	@Value("${emp.salary}")
	private double salary;	
	@Value("${emp.age}")
    private int age;
	
	@Autowired
    private SBU businessunit;
	
	
	
	
	public Employee() {
		super();
	}

	
	public Employee(int employeeId, String employeeName, double salary, SBU businessunit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessunit = businessunit;
		this.age = age;
	}


	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	
	public SBU getBusinessunit() {
		return businessunit;
	}


	public void setBusinessunit(SBU businessunit) {
		this.businessunit = businessunit;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", businessunit=" + businessunit + ", age=" + age + "]";
	}

	
	
	
	
	
}
