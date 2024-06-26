package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.model.Emp;
import com.emp.model.EmpRepository;
import com.seat.model.Seat;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepository repository;
	
	public void updateEmp(Emp emp) {
		repository.save(emp);
	}
	
	public Emp getOneEmp(Integer empId) {
		Optional<Emp> optional = repository.findById(empId);
		return optional.orElse(null);
	}
	
	public List<Emp> getAll(){
		return repository.findAll();
	}
	
	public List<Emp> findAllBySeat(Seat seat){
		return repository.findAllBySeat(seat);
	}
}
