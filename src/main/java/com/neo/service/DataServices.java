package com.neo.service;
import java.util.List;  

import com.neo.domain.Employee;
public interface DataServices {  
	 public boolean addEntity(Employee employee) throws Exception;  
	 public Employee getEntityById(long id) throws Exception;  
	 public List<Employee> getEntityList() throws Exception;  
	 public boolean deleteEntity(long id) throws Exception;
	 public boolean updateEntity(long id) throws Exception;
	}  
