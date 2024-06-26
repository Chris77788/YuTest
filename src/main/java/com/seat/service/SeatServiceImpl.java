package com.seat.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seat.model.Seat;
import com.seat.model.SeatRepository;

@Service
public class SeatServiceImpl implements SeatService {

	@Autowired
	SeatRepository repository;
	
	public void updateSeat(Seat seat) {
		repository.save(seat);
	}
	
	public Seat getOneSeat(Integer seq) {
		Optional<Seat> optional = repository.findById(seq);
		return optional.orElse(null);
	}
	
	public List<Seat> getAll() {
		return repository.findAll();
	}
	
	public List<Seat> getAllByStatus(String seatStatus){
		return repository.findAllBySeatStatus(seatStatus);
	}
}
