package com.seat.model;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;


public interface SeatRepository extends JpaRepository<Seat, Integer> {
	
	@Transactional
	List<Seat> findAllByFloorNo(Integer floorNo);
	
	@Transactional
	List<Seat> findAllBySeatStatus(String seatStatus);

}
