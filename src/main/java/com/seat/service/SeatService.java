package com.seat.service;

import java.util.List;

import com.seat.model.Seat;

public interface SeatService {
	
	public void updateSeat(Seat seat);
	
	public Seat getOneSeat(Integer seq);
	
	public List<Seat> getAll();
	
	public List<Seat> getAllByStatus(String seatStatus);

}
