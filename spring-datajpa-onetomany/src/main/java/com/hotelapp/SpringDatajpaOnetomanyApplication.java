package com.hotelapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hotelapp.model.Category;
import com.hotelapp.model.Hotel;
import com.hotelapp.model.Item;
import com.hotelapp.model.Type;
import com.hotelapp.service.IHotelService;

@SpringBootApplication
public class SpringDatajpaOnetomanyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetomanyApplication.class, args);
	}
@Autowired
IHotelService hotelService;
	@Override
	public void run(String... args) throws Exception {
		Item item1=new Item("Fried Rice",Category.FASTFOOD,"Chinese",Type.VEG,100);
		Item item2=new Item("Mushroom Noodles",Category.FASTFOOD,"Chinese",Type.VEG,150);
		Item item3=new Item("Vanilla Shake",Category.BEVERAGES,"Juices",Type.VEG,50);
		Set<Item> items=new HashSet<>(Arrays.asList(item1,item2,item3));
		
		
		Hotel hotel=new Hotel("MainLand",Type.VEG,"Hyderabad",4.5,items);
		hotelService.addHotel(hotel);
		Item item4=new Item("Chicken Noodles",Category.FASTFOOD,"Chinese",Type.NONVEG,100);
		Item item5=new Item("Chicken Masala",Category.STARTERS,"NI",Type.VEG,170);
		Item item6=new Item("Chicken Biryani",Category.MAINCOURSE,"Juices",Type.VEG,50);
		Set<Item> itemsList1=new HashSet<Item>(Arrays.asList(item4,item5,item6));
		
		Hotel hotel1=new Hotel("Dragon King",Type.NONVEG,"Hyderabad",3,itemsList1);
		hotelService.addHotel(hotel1);
//		hotelService.getAll().forEach(System.out::println);
		
	}

}
