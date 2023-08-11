 package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Ratings_Micro")
public class Rating {
	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
private String ratingId;
private String userId;
private String hotelId;
private int rating;
private String feedback;



}
