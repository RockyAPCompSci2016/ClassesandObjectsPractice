
public class Employee {
	private String name;
	private double salary;
	
public Employee(String n, double s)
{
	name=n;
	salary=s;
}
public String getName()
{
	return name;
}
public double getSalary()
{
	return salary;
}
public double raiseSalary(double byPercent)
{
	salary=salary*(1.+(byPercent/100));
	return salary;
}

}
