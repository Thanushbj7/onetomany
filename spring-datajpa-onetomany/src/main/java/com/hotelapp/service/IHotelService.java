package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;
public interface IHotelService {
Hotel addHotel(Hotel hotel);
void updateHotel(Hotel hotel);
void deleteHotel(int hotelId);
List<Hotel> getAll();
Hotel getById(int hotelId);

List<Hotel> getByCity(String city);
List<Hotel> getByType(String type);
List<Hotel> getByRating(double rating);

}
