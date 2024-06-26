package com.emp.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.seat.model.Seat;

public interface EmpRepository extends JpaRepository<Emp, Integer> {
	
	@Transactional
	@Modifying
	@Query("SELECT e FROM Emp e WHERE e.seat = :seat")
	List<Emp> findAllBySeat(@Param("seat")Seat seat);

}
