package com.te.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Employee employee=(Employee) context.getBean("empTwo");
		
		System.out.println(employee.getId());
		System.out.println(employee.getName());
		System.out.println(employee.getDept().getId());
		System.out.println(employee.getDept().getDname());

	}

}
