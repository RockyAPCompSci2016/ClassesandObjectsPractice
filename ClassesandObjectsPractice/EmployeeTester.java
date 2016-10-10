
public class EmployeeTester {

	public static void main(String[] args) {
		Employee Adrian=new Employee("KLey, Adrian", 100000);
		String zz=Adrian.getName();
		System.out.println(zz);
		double yy=Adrian.getSalary();
		double xx=Adrian.raiseSalary(15);
		System.out.println(zz+", "+yy+", "+xx);

	}

}
