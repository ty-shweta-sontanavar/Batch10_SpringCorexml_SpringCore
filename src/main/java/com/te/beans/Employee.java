package com.te.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee 
{
	public Employee()
	{
		
	}
  private int id;
  
  private String name;
  
  private Department dept;
}
