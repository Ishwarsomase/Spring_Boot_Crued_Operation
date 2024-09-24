package com.tech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tech.entity.Hotel;
import com.tech.servicei.HotelServicei;

@RestController

public class HomeController {
	@Autowired
	private HotelServicei si;
	
//	create hotel
	@PostMapping("/Addd")
	public ResponseEntity<Hotel>CreateHotel(@RequestBody Hotel hotel)
	{
		Hotel resp = si.create(hotel);
		return new ResponseEntity<Hotel>(resp,HttpStatus.CREATED);
		
	}
	
//	get hotel
	@GetMapping("getData")
	public ResponseEntity<List<Hotel>> GetHotel()
	{
		List<Hotel> all = si.getAll();
		return new ResponseEntity<List<Hotel>>(all,HttpStatus.OK);
		
		
	}
	
//	get a single data
	@GetMapping("/{id}")
	public ResponseEntity<Hotel>getHotel(@PathVariable String id)
	{
		Hotel hotel = si.get(id);
		
		return new ResponseEntity<Hotel>(hotel,HttpStatus.OK);
		
	}

}
