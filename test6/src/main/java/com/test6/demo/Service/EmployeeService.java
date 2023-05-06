package com.test6.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.test6.demo.Repository.EmployeeRepository;
import com.test6.demo.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository sr;
	
	public List<Employee> fun()
	{
		return sr.findAll();
	}
	
	public Employee saveDetails(Employee id) 
	{
		return sr.save(id);
	}
	public Employee update(Employee id)
	{
		return sr.save(id);
	}
	public void delete(int id)
	{
		 sr.deleteById(id);
	}
	
	public Employee find(int id)
	{
		return sr.findById(id).orElse(null);
	}
	public List<Employee>sortEmployee(String field)
	{
		return sr.findAll(Sort.by(Direction.DESC,field));
		
	}
	public List<Employee>pagingEmployee(int offset,int pageSize,String field)
	{
		Pageable paging=PageRequest.of(offset, pageSize).withSort(Sort.by(field));
		Page<Employee> obj = sr.findAll(paging);
	    List<Employee>sc=obj.getContent();
	    return sc;
		
	}
	
}

