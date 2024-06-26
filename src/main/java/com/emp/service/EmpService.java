package com.emp.service;

import java.util.List;

import com.emp.model.Emp;
import com.seat.model.Seat;

public interface EmpService {
	
	public void updateEmp(Emp emp);
	
	public Emp getOneEmp(Integer empId);
	
	public List<Emp> getAll();
	
	public List<Emp> findAllBySeat(Seat seat);

}
