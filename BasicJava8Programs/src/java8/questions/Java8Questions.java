package java8.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Java8Questions {

	static List<Employee> employeeList = new ArrayList<Employee>();
	
	
	public static void main(String[] args) {
		employeeList.add(new Employee(1, "RAM", 10000.0, 30, GenderEnum.MALE, 2001, "HR"));
		employeeList.add(new Employee(11, "RAvcxM", 20000.0, 31, GenderEnum.FEMALE, 2001, "Manager"));
		employeeList.add(new Employee(12, "RAMcv", 30000.0, 20, GenderEnum.FEMALE, 2001, "developer"));
		employeeList.add(new Employee(13, "RAMgfg", 15000.0, 40, GenderEnum.MALE, 2001, "Tester"));
		employeeList.add(new Employee(14, "RAMfg", 11000.0, 32, GenderEnum.MALE, 2001, "developer"));
		employeeList.add(new Employee(15, "RAMgf", 12000.0, 23, GenderEnum.FEMALE, 2001, "HR"));
		employeeList.add(new Employee(16, "RAMfgfg", 13000.0, 33, GenderEnum.FEMALE, 2001, "CEO"));
		employeeList.add(new Employee(17, "RAMfgf", 14000.0, 27, GenderEnum.MALE, 2001, "developer"));
		employeeList.add(new Employee(18, "RAMfgg", 15000.0, 28, GenderEnum.MALE, 2001, "Tester"));
		employeeList.add(new Employee(19, "RAMgg", 16000.0, 50, GenderEnum.FEMALE, 2001, "Manager"));
		employeeList.add(new Employee(21, "RAMfg", 17000.0, 36, GenderEnum.MALE, 2001, "Infrastructure"));
		employeeList.add(new Employee(31, "RAMvcbb", 18000.0, 31, GenderEnum.FEMALE, 2001, " "));
		
		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(employeeList.get(0), 2000);
		map.put(employeeList.get(1), 2001);
		map.put(employeeList.get(2), 2002);
		map.put(employeeList.get(3), 2003);
		map.put(employeeList.get(4), 2004);
		
		// get list of PhoneMuber of all employees
		// whose id is even
		// who have joined after 2003
		System.out.println(map.entrySet().stream().filter( e -> e.getKey().getId()%2==0 && e.getValue() > 2003).map(e -> e.getKey().getSalary()).collect(Collectors.toList()));
		
		
		//Query 1
		//No of male & female in org
		countNoOfMaleAndFemale();
		//Query 2 
		//Pring the all department in the org
		printAllDepartmentInOrg();
		//Query3
		//Find Average Age of male & female emplyees
		findAvgAgeOfMaleAndFemale();
		//Query4
		//Get name of employee Having highest salary
		findEmployeeHavingHighestSalary();
		//Query 5
		//Get name of all employee joined after 2015
		getEmployeesJoindAfter2015();
		//query 6 
		//Count number of employee in each department
		countEmployeeByDepartment();
		//Query 7
		//Find Average Salary of each department
		findAvgSalaryDepartmentWise();
		//Query 8
		//Get youngest male employee in HR
		findYoungestMaleEmployeeInHrDepart();
		//Query 9
		//who has most working experience in org
		mostEperienceEmplyee();
		//Query 10
		//no of male & female employee in developer & HR
		findNoOfMaleAndFemaleInDeveloperDept();
		//Query 11
		//find avg salary of male & female Employees
		findAvgSalaryOfMaleAnddFemale();
		//Query 12
		//List All employees by department
		findAllEmployeesByDepart();
		//query 13
		//Find avg salary & total slary of all employee
		findAvgAndTotalSalaryOfEmployees();
		//Query 14
		//Find oldest employee in org , his age & his department
		findOldestEmployeeAgeDepatment();
		//
		
	}


	private static void findOldestEmployeeAgeDepatment() {
		employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
	}


	private static void findAvgAndTotalSalaryOfEmployees() {
		Double avgSalaryOfEmployees = employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		Double totalSalaryOfEmployees = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println("Avg salary " + avgSalaryOfEmployees + " Total Salary "+ totalSalaryOfEmployees);
	}


	private static void findAllEmployeesByDepart() {
		Map<String, Long> emps = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeartment, Collectors.counting()));
		System.out.println(emps);
	}


	private static void findAvgSalaryOfMaleAnddFemale() {
		Map<GenderEnum, Double> empList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(empList);
	}


	private static void findNoOfMaleAndFemaleInDeveloperDept() {
		Map<GenderEnum, Long> empLoyees = employeeList.stream().filter(emp -> emp.getDeartment().equals("developer") && emp.getDeartment().equals("HR"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(empLoyees);
	}


	private static void mostEperienceEmplyee() {
		Optional<Employee> emp = employeeList.stream().max(Comparator.comparing(Employee::getAge));
		System.out.println(emp);
	}


	private static void findYoungestMaleEmployeeInHrDepart() {
		Optional<Employee> e1 = employeeList.stream().filter(emp -> emp.getGender().equals(GenderEnum.MALE) && emp.getDeartment().equals("HR"))
		.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		System.out.println(e1);
		Optional<Employee> e2= employeeList.stream().filter(emp -> emp.getGender().equals(GenderEnum.MALE) && emp.getDeartment().equals("HR"))
		.min(Comparator.comparing(Employee::getAge));
		System.out.println(e2);
	}


	private static void findAvgSalaryDepartmentWise() {
		Map<String, Double> empList = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(empList);
	}


	private static void countEmployeeByDepartment() {
		Map<String, Long> emplyeeByDepat = employeeList.stream().collect(Collectors.groupingBy(Employee::getDeartment, Collectors.counting()));
		System.out.println(emplyeeByDepat);
	}


	private static void getEmployeesJoindAfter2015() {
		List<Employee> empList = employeeList.stream().filter(emp -> emp.getJoiningYear() > 2015).collect(Collectors.toList());
		System.out.println(empList);
	}


	private static void findEmployeeHavingHighestSalary() {
		Optional<Employee> emp = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		System.out.println(emp.get().getName());
	}


	private static void findAvgAgeOfMaleAndFemale() {
		Map<GenderEnum, Double> empList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
		System.out.println(empList);
	}


	private static void printAllDepartmentInOrg() {
		List<String> departments = employeeList.stream().map(Employee::getDeartment).distinct().collect(Collectors.toList());
		System.out.println(departments);
		employeeList.stream().map(Employee::getDeartment).distinct().forEach(System.out::println);
	}


	private static void countNoOfMaleAndFemale() {
		Map<GenderEnum, Long> countNoOfMaleAndFemale = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countNoOfMaleAndFemale);
	}
	
	
}
