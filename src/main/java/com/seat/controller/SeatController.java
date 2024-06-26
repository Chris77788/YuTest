package com.seat.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Emp;
import com.emp.service.EmpServiceImpl;
import com.seat.model.Seat;
import com.seat.service.SeatServiceImpl;

@RestController
@RequestMapping("/seat")
public class SeatController {
	
	@Autowired
    private SeatServiceImpl seatService;
	
	@Autowired
    private EmpServiceImpl empService;

	@GetMapping("/seats")
    public List<Seat> getSeats() {
        return seatService.getAll();
    }

    @GetMapping("/emps")
    public List<Emp> getEmps() {
        return empService.getAll();
    }
    
//    @PostMapping("/changeSeat")
//    public ResponseEntity<?> assignSeat(@RequestBody SeatAssignmentRequest request) {
//        Optional<Emp> empOpt = empService.getOneEmp(request.getEmpId());
//        Optional<Seat> seatOpt = seatService.getOneSeat(request.getSeq());
//
//        if (empOpt.isPresent() && seatOpt.isPresent()) {
//            Emp emp = empOpt.get();
//            Seat seat = seatOpt.get();
//
//            if (emp.getSeat() != null) {
//                emp.getSeat().getEmps().remove(emp);
//                seatService.updateSeat(emp.getSeat());
//            }
//
//            emp.setSeat(seat);
//            seat.getEmps().add(emp);
//            empService.updateEmp(emp); 
//            seatService.updateSeat(seat); 
//
//            return ResponseEntity.ok().build();
//        } else {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    
//    }
    
//	@PostMapping("getOne_For_Update")
//	public String getOne_For_Update(@RequestParam("seq") String seq, ModelMap model) {
//		Seat seat = seatService.getOneSeat(Integer.valueOf(seq));
//		model.addAttribute("seat", seat);
//		return "backend/select_page";
//	}

}
//class SeatAssignmentRequest {
//    private Integer empId;
//    private Integer seatSeq;
//	public Integer getEmpId() {
//		return empId;
//	}
//	public void setEmpId(Integer empId) {
//		this.empId = empId;
//	}
//	public Integer getSeatSeq() {
//		return seatSeq;
//	}
//	public void setSeatSeq(Integer seatSeq) {
//		this.seatSeq = seatSeq;
//	}
//
//    
//}
