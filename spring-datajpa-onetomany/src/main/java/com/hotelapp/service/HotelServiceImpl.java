package com.hotelapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;
import com.hotelapp.repositary.IHotelRepositary;
@Service
public class HotelServiceImpl implements IHotelService {
@Autowired
IHotelRepositary hotelRepositary;
	@Override
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepositary.save(hotel);
	}

	@Override
	public void updateHotel(Hotel hotel) {
		hotelRepositary.save(hotel);
		
	}

	@Override
	public void deleteHotel(int hotelId) {
		hotelRepositary.deleteById(hotelId);;
		
	}

	@Override
	public List<Hotel> getAll() {
		// TODO Auto-generated method stub
		return hotelRepositary.findAll();
	}

	@Override
	public Hotel getById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Hotel> getByRating(double rating) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
