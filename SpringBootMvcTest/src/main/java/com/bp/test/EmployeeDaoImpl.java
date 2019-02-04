package com.bp.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getEmployees() {
		List<Employee> empList=new ArrayList<Employee>();
		for(int i=100;i<=105;i++)
		{
			Employee e=new Employee();
			e.setId(i);
			e.setName("Employee"+i);
			e.setDesignation("Designation"+i);
			e.setSalary(300+i);
			empList.add(e);
		}
		
		return empList;
	}

}
