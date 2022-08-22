package com.hotelapp.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotelapp.model.Hotel;
@Repository
public interface IHotelRepositary extends JpaRepository<Hotel,Integer> {

}
