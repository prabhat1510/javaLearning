/**
 * 
 */
package javaLearning;

/**
 * @author t-Prabhat
 *
 */
public class MyLearning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(420,"Greg","Anderson",15000.45,"Mechanical");
		System.out.println(emp.getDepartment());
		System.out.println(emp.getClass());
		Employee emp2 = new Employee();
		emp2.setDepartment("Electrical");
		emp2.setEmpId(1410);
		emp2.setFirstName("Bob");
		emp2.setLastName("Murray");
		emp2.setSalary(15030.65);
		System.out.println(emp2.getDepartment());
	}

}
