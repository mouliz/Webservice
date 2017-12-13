package com.neo.dao;

import java.util.List;

import com.neo.domain.Employee;

public interface DataDao {  
	  
	 public boolean addEntity(Employee employee) throws Exception;  
	 public Employee getEntityById(long id) throws Exception;  
	 public List<Employee> getEntityList() throws Exception;  
	 public boolean deleteEntity(long id) throws Exception; 
	 public boolean updateEntity(long id) throws Exception; 
	 
	}  