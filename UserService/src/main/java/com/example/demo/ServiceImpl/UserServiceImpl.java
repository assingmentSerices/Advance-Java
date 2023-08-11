package com.example.demo.ServiceImpl;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Entity.Hotel;
import com.example.demo.Entity.Rating;
import com.example.demo.Entity.User;
import com.example.demo.Exception.ResouresNotFoundException;
import com.example.demo.ExternalService.HotelService;
import com.example.demo.Repo.UserRepo;
import com.example.demo.Service.UserService;
@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserRepo userrepo;	
@Autowired
private RestTemplate resttemplate;
@Autowired
private HotelService hotelservice;



private Logger logger= (Logger) LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
	String randomUserId=	UUID.randomUUID().toString();
		user.setUserid(randomUserId);
	return this.userrepo.save(user);
		
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.userrepo.findAll();
	}

	@Override
	public User getUser(String Userid)  {
		// TODO Auto-generated method stub
		User user=userrepo.findById(Userid).orElseThrow(()-> new ResouresNotFoundException("User with given id is not found"+Userid));
      //rating
	

	
	Rating[] ratingOfUser=	resttemplate.getForObject("http://RATINGSERVICE/rating/getuser/"+user.getUserid(), Rating[].class);
		
	     logger.info("",ratingOfUser);
	  List<Rating> ratings = Arrays.stream(ratingOfUser).toList();
		
		 @SuppressWarnings("unused")
		List<Rating> ratingList = ratings.stream().map(rating -> {
			//api call to hotel
			
//ResponseEntity<Hotel> forEntity=resttemplate.getForEntity("http://HOTELSERVICE/hotel/"+ rating.getHotelId(),Hotel.class);
			System.out.println(rating.getHotelId());
	Hotel hotel= hotelservice.getHotel(rating.getHotelId()).getBody();
			//set hotel DATA
			
	rating.setHotel(hotel);
	
			return  rating;
		}).collect(Collectors.toList());
		
	      user.setRating(ratingList);
		return user;
	}

//	@Override
//	public User deleteById(User id) {
//		// TODO Auto-generated method stub
//		return this.userrepo.deleteByString( String id);
//	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.userrepo.save(user);
	}

@Override
public User deleteById(User id) {
	// TODO Auto-generated method stub
	return null;
}

}
