package com.adda.dollop.Bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class PostsTages {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @ManyToOne
  private Posts post;
  @ManyToOne
  private Tag tag;
}
