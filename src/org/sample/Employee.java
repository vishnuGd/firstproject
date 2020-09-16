package org.sample;

public class Employee {

	
	public void empDetails() {
		System.out.println("Employee Details");
		
		String empName= "vishnu";
		System.out.println("employee name:"+empName);
		
		char empGender= 'm';
		System.out.println("Employee Gender:"+empGender);
		
		

	}
	
	public static void main(String[] args) {
		
		Employee E= new Employee();
		E.empDetails();
				
	}
}

